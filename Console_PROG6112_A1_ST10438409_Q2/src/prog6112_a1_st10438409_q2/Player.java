/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//**************************************************************************************//
package prog6112_a1_st10438409_q2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author dylan
 */
//**************************************************************************************//
public class Player extends Game {
    //*************************************************//
    // Declare variables
    private int position = 0;
    private Object[][] gameBoardData;
    private int snakesSteppedOn = 0;
    private int laddersSteppedOn = 0;
    //*************************************************//
    
    //*************************************************//
    // Constructor
    public Player(String name) {
        super(name);
    }
    //*************************************************//
    
    //*************************************************//
    // Getters and Setters
    public int getPosition() {
        return position;
    }

    public int getSnakesSteppedOn() {
        return snakesSteppedOn;
    }

    public void setSnakesSteppedOn(int snakesSteppedOn) {
        this.snakesSteppedOn = snakesSteppedOn;
    }

    public int getLaddersSteppedOn() {
        return laddersSteppedOn;
    }

    public void setLaddersSteppedOn(int laddersSteppedOn) {
        this.laddersSteppedOn = laddersSteppedOn;
    }
    //*************************************************//
    
    //*************************************************//
    // Move player based on the dice roll
    public int movePlayer(int roll) {
        int newPosition = position + roll;
        
        if (newPosition >= 100) {
            newPosition = 100;
        }
        
        position = newPosition;
        System.out.println("Player moved to position: " + position);
        return position;
    }
    //*************************************************//
    
    //*************************************************//
    // Return the game board data for display
    public Object[][] getGameBoardData() {
        //*************************************************//
        String board = super.returnGameBoard();
        String[] rows = board.split("\n");
        //*************************************************//
        
        //*************************************************//
        if (rows.length != 10) 
        {
            throw new IllegalArgumentException("Unexpected number of rows in board: " + rows.length);
        }
        //*************************************************//

        //*************************************************//
        Object[][] gameBoardData = new Object[10][10];
        
        Pattern pattern = Pattern.compile("\\[(.*?)\\]");
        //*************************************************//

        //*************************************************//
        for (int i = 0; i < rows.length; i++) 
        {
            //*************************************************//
            Matcher matcher = pattern.matcher(rows[i]);
            int j = 0;
            //*************************************************//

            //*************************************************//
            while (matcher.find()) 
            {
                //*************************************************//
                if (j >= 10) 
                {
                    throw new IllegalStateException("Row " + i + " does not have exactly 10 cells");
                }
                //*************************************************//
                
                //*************************************************//
                gameBoardData[i][j] = matcher.group(1); // Extract the content inside the brackets
                j++;
                //*************************************************//
            }
            //*************************************************//

            //*************************************************//
            if (j != 10) 
            {
                throw new IllegalStateException("Row " + i + " does not have exactly 10 cells");
            }
            //*************************************************//
        }
        //*************************************************//

        //*************************************************//
        // Add snakes 
        gameBoardData[3][5] = "Snake";
        gameBoardData[5][1] = "Snake";
        gameBoardData[7][6] = "Snake";
        gameBoardData[9][8] = "Snake";
        //*************************************************//
        
        //*************************************************//
        // Set ladders
        gameBoardData[4][2] = "Ladder";
        gameBoardData[6][9] = "Ladder";
        gameBoardData[8][1] = "Ladder";
        //*************************************************//
        
        return gameBoardData;
    }
    //*************************************************//
    
    //*************************************************//
    // Check for snakes or ladders and adjust player position accordingly
    public void checkForSnakesAndLadders() {
        
        //*************************************************//
        int row = (position - 1) / 10;
        int col = (position - 1) % 10;
        gameBoardData = getGameBoardData();
        //*************************************************//
        
        //*************************************************//
        String cellContent = (String) gameBoardData[row][col];
        //*************************************************//

        //*************************************************//
        if ("Snake".equalsIgnoreCase(cellContent)) 
        {
            System.out.println("Oh no! You landed on a Snake. Moving down."); 
            setSnakesSteppedOn(getSnakesSteppedOn() + 1);
            movePlayer(-10);
        }//*************************************************//
        
        //*************************************************//
        else if ("Ladder".equalsIgnoreCase(cellContent)) 
        {
            //*************************************************//
            System.out.println("Yay! You landed on a Ladder. Moving up.");
            setLaddersSteppedOn(getLaddersSteppedOn() + 1);
            movePlayer(10);
            //*************************************************//
        }
        //*************************************************//
    }
    //*************************************************//
}
//***********************************END OF FILE****************************************//
