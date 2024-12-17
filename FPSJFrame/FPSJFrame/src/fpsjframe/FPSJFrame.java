//**************************************************************************************//
// The FPSJFrame class is a JPanel that implements KeyListener and Runnable interfaces.
// It simulates a simple first-person shooter (FPS) game using a basic 2D map and 
// raycasting for the 3D rendering effect. Players move with W, A, S, D keys, and 
// progress through the game until they reach the endpoint.
//**************************************************************************************//
package fpsjframe;

//*************************************************//
//imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;
//*************************************************//

//*************************************************//
// Main class FPSJFrame that extends JPanel and implements KeyListener and Runnable
public class FPSJFrame extends JPanel implements KeyListener, Runnable {
    
    //**************************************************************************************//
    // Variables for game settings, screen size, and player configuration
    private final int nScreenWidth = 1200; // Width of the game screen
    private final int nScreenHeight = 700; // Height of the game screen
    private final int nMapWidth = 16; // Width of the game map (in tiles)
    private final int nMapHeight = 16; // Height of the game map (in tiles)
    private final float fFOV = (float) (Math.PI / 4.0); // Field of view for raycasting
    private final float fDepth = 16.0f; // Maximum view distance
    private final float fSpeed = 5.0f; // Speed of player movement and rotation
    //**************************************************************************************//

    //**************************************************************************************//
    // Variables for player position and orientation
    private float fPlayerX = 1.5f; // Player's starting X position
    private float fPlayerY = 1.5f; // Player's starting Y position
    private float fPlayerA = 0.0f; // Player's starting angle (facing direction)
    
    // Array of booleans to store the state of movement keys (W, A, S, D)
    private boolean[] keys = new boolean[4]; 
    private String map; // The game map represented as a string
    
    // Game states to manage the flow of the game (startup, in-game, and congrats screen)
    private enum GameState { STARTUP, IN_GAME, CONGRATS }
    private GameState gameState = GameState.STARTUP;

    // Coordinates for the end goal (winning condition)
    private final float fEndX = 14.5f; // X position of the goal
    private final float fEndY = 14.5f; // Y position of the goal
    //**************************************************************************************//

    //**************************************************************************************//
    // Constructor FPSJFrame initializes the game map and sets up the JPanel properties
    public FPSJFrame() {
        setPreferredSize(new Dimension(nScreenWidth, nScreenHeight)); // Set screen size
        setFocusable(true); // Make JPanel focusable for key input
        addKeyListener(this); // Add key listener to capture player input

        // Create the map with Start (S) and End (E) points
        map = "S.......#.......";
        map += "#...............";
        map += "#.......########";
        map += "#..............#";
        map += "#......##......#";
        map += "#......##......#";
        map += "#..............#";
        map += "###............#";
        map += "##.............#";
        map += "#......####..###";
        map += "#......#.......#";
        map += "#......#.......#";
        map += "#..............#";
        map += "#......#########";
        map += "#..............E";
        map += "################";
    }
    //**************************************************************************************//

    //**************************************************************************************//
    // paintComponent method handles rendering of the game depending on the current game state
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // Call the superclass method

        // Handle drawing based on the current game state
        if (gameState == GameState.STARTUP) {
            drawStartupScreen(g); // Show startup screen
        } else if (gameState == GameState.IN_GAME) {
            drawGame(g); // Draw the game and player
            drawMap(g); // Draw the 2D map
        } else if (gameState == GameState.CONGRATS) {
            drawCongratsScreen(g); // Show congrats screen after winning
        }
    }
    //**************************************************************************************//

    //**************************************************************************************//
    // Draw the startup screen with instructions for starting the game
    private void drawStartupScreen(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, nScreenWidth, nScreenHeight); // Fill background
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 36));
        g.drawString("FPS Game", nScreenWidth / 2 - 100, nScreenHeight / 2 - 50); // Title
        g.setFont(new Font("Arial", Font.PLAIN, 24));
        g.drawString("Press ENTER to Start", nScreenWidth / 2 - 130, nScreenHeight / 2); // Start message
    }

    // Draw the congratulations screen when the player reaches the end
    private void drawCongratsScreen(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, nScreenWidth, nScreenHeight); // Fill background
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 36));
        g.drawString("Congratulations!", nScreenWidth / 2 - 150, nScreenHeight / 2 - 50); // Congratulation message
        g.setFont(new Font("Arial", Font.PLAIN, 24));
        g.drawString("You reached the end!", nScreenWidth / 2 - 120, nScreenHeight / 2); // End message
        g.drawString("Press enter to exit", nScreenWidth / 2 - 100, nScreenHeight / 2 + 50); // Exit message
    }
    //**************************************************************************************//

    //**************************************************************************************//
    // The main game rendering logic that handles 3D drawing using raycasting and the 2D map
    private void drawGame(Graphics g) {
        // Clear the screen
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, nScreenWidth, nScreenHeight);

        // Draw the game map and player indicator
        drawMap(g);
        drawPlayerArrow(g, fPlayerX, fPlayerY, fPlayerA);

        // Raycasting for 3D effect
        for (int x = 0; x < nScreenWidth; x++) {
            float fRayAngle = (fPlayerA - fFOV / 2.0f) + ((float) x / nScreenWidth) * fFOV;
            float fStepSize = 0.1f;
            float fDistanceToWall = 0.0f;
            boolean bHitWall = false;
            float fEyeX = (float) Math.sin(fRayAngle);
            float fEyeY = (float) Math.cos(fRayAngle);

            // Increment ray distance until hitting a wall
            while (!bHitWall && fDistanceToWall < fDepth) {
                fDistanceToWall += fStepSize;
                int nTestX = (int) (fPlayerX + fEyeX * fDistanceToWall);
                int nTestY = (int) (fPlayerY + fEyeY * fDistanceToWall);

                // Check if ray is out of bounds
                if (nTestX < 0 || nTestX >= nMapWidth || nTestY < 0 || nTestY >= nMapHeight) {
                    bHitWall = true;
                    fDistanceToWall = fDepth;
                } else {
                    // Check if ray hit a wall
                    if (map.charAt(nTestY * nMapWidth + nTestX) == '#') {
                        bHitWall = true;
                    }
                }
            }

            // Calculate ceiling and floor based on distance to the wall
            int nCeiling = (int) ((nScreenHeight / 2.0) - nScreenHeight / ((float) fDistanceToWall));
            int nFloor = nScreenHeight - nCeiling;

            // Draw each column of the screen
            for (int y = 0; y < nScreenHeight; y++) {
                if (y < nCeiling) {
                    g.setColor(Color.BLACK); // Ceiling color
                } else if (y > nCeiling && y <= nFloor) {
                    g.setColor(Color.GRAY); // Wall color
                } else {
                    g.setColor(Color.WHITE); // Floor color
                }
                g.drawLine(x, y, x, y); // Draw a line for each pixel column
            }
        }

        // Check if player has reached the end position (E)
        if (Math.abs(fPlayerX - fEndX) < 0.5 && Math.abs(fPlayerY - fEndY) < 0.5) {
            gameState = GameState.CONGRATS; // Transition to congrats screen
        }
    }

    // Draw the 2D overhead map on the screen
    private void drawMap(Graphics g) {
        int tileSize = 12; // Size of each tile on the map
        int mapOffsetX = 10; // Offset of the map from the left
        int mapOffsetY = 10; // Offset of the map from the top

        // Draw each tile on the map
        for (int y = 0; y < nMapHeight; y++) {
            for (int x = 0; x < nMapWidth; x++) {
                if (map.charAt(y * nMapWidth + x) == '#') {
                    g.setColor(Color.BLACK); // Wall tile
                } else if (map.charAt(y * nMapWidth + x) == 'E') {
                    g.setColor(Color.GREEN); // End tile
                } else if (map.charAt(y * nMapWidth + x) == 'S') {
                    g.setColor(Color.BLUE); // Start tile
                } else {
                    g.setColor(Color.WHITE); // Empty tile
                }
                g.fillRect(mapOffsetX + x * tileSize, mapOffsetY + y * tileSize, tileSize, tileSize); // Draw each tile
            }
        }
    }

    // Draw the player's position and orientation on the 2D map using an arrow
    private void drawPlayerArrow(Graphics g, float fPlayerX, float fPlayerY, float fPlayerA) {
        int mapOffsetX = 10;
        int mapOffsetY = 10;
        int tileSize = 12;

        // Transform to rotate the player arrow based on the angle
        Graphics2D g2d = (Graphics2D) g;
        AffineTransform old = g2d.getTransform();
        g2d.setColor(Color.RED);
        g2d.translate(mapOffsetX + (int) (fPlayerX * tileSize), mapOffsetY + (int) (fPlayerY * tileSize));
        g2d.rotate(-fPlayerA);
        g2d.fillPolygon(new int[]{-5, 5, 0}, new int[]{-5, -5, 10}, 3); // Draw the arrow as a triangle
        g2d.setTransform(old);
    }
    //**************************************************************************************//

    //**************************************************************************************//
    // Update the game by processing key inputs and player movement
    public void updateGame(float fElapsedTime) {
        if (keys[0]) { // W key for forward movement
            float newPlayerX = fPlayerX + (float) Math.sin(fPlayerA) * fSpeed * fElapsedTime;
            float newPlayerY = fPlayerY + (float) Math.cos(fPlayerA) * fSpeed * fElapsedTime;
            if (map.charAt((int) (newPlayerY) * nMapWidth + (int) (newPlayerX)) != '#') {
                fPlayerX = newPlayerX;
                fPlayerY = newPlayerY;
            }
        }
        if (keys[1]) { // A key for left rotation
            fPlayerA -= (fSpeed * 0.75f) * fElapsedTime;
        }
        if (keys[2]) { // S key for backward movement
            float newPlayerX = fPlayerX - (float) Math.sin(fPlayerA) * fSpeed * fElapsedTime;
            float newPlayerY = fPlayerY - (float) Math.cos(fPlayerA) * fSpeed * fElapsedTime;
            if (map.charAt((int) (newPlayerY) * nMapWidth + (int) (newPlayerX)) != '#') {
                fPlayerX = newPlayerX;
                fPlayerY = newPlayerY;
            }
        }
        if (keys[3]) { // D key for right rotation
            fPlayerA += (fSpeed * 0.75f) * fElapsedTime;
        }

        repaint(); // Redraw the game after updating player movement
    }
    //**************************************************************************************//

    //**************************************************************************************//
    // The run method is responsible for the main game loop, which continually updates the game
    // and tracks the time elapsed between frames for smooth movement and rendering.
    @Override
    public void run() {
        long lastTime = System.nanoTime(); // Track time between frames
        while (true) {
            long now = System.nanoTime();
            float fElapsedTime = (now - lastTime) / 1000000000.0f; // Calculate elapsed time
            lastTime = now;
            if (gameState == GameState.IN_GAME) {
                updateGame(fElapsedTime); // Update game logic if in-game
            }
            try {
                Thread.sleep(16); // Sleep to limit frame rate to ~60fps
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //**************************************************************************************//

    //**************************************************************************************//
    // KeyListener methods to handle player input for movement and game state transitions
    @Override
    public void keyPressed(KeyEvent e) {
        if (gameState == GameState.STARTUP && e.getKeyCode() == KeyEvent.VK_ENTER) {
            gameState = GameState.IN_GAME; // Start the game on Enter key press
        } else if (gameState == GameState.IN_GAME) {
            if (e.getKeyCode() == KeyEvent.VK_W) keys[0] = true; // Move forward
            if (e.getKeyCode() == KeyEvent.VK_A) keys[1] = true; // Rotate left
            if (e.getKeyCode() == KeyEvent.VK_S) keys[2] = true; // Move backward
            if (e.getKeyCode() == KeyEvent.VK_D) keys[3] = true; // Rotate right
        } else if (gameState == GameState.CONGRATS && e.getKeyCode() == KeyEvent.VK_ENTER) {
            System.exit(0); // Exit game after winning on Enter key press
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) keys[0] = false; // Stop moving forward
        if (e.getKeyCode() == KeyEvent.VK_A) keys[1] = false; // Stop rotating left
        if (e.getKeyCode() == KeyEvent.VK_S) keys[2] = false; // Stop moving backward
        if (e.getKeyCode() == KeyEvent.VK_D) keys[3] = false; // Stop rotating right
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not used
    }
    //**************************************************************************************//

    //**************************************************************************************//
    // The main method to initialize the JFrame and start the game loop in a separate thread
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple FPS Game");
        FPSJFrame game = new FPSJFrame();
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        Thread gameThread = new Thread(game);
        gameThread.start(); // Start the game loop in a new thread
    }
}
//**************************************************************************************//

//***********************************END OF FILE****************************************//