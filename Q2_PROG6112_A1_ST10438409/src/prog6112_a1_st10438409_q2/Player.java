/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//**************************************************************************************//
package prog6112_a1_st10438409_q2;
//**************************************************************************************//

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


/**
 *
 * @author dylan
 */
//**************************************************************************************//
public class Player extends Game{
//**************************************************************************************//
    
    //*************************************************//
    //declare var's
    private int position = 0;
    private Object[][] gameBoardData;
    
    public int getSnakesSteppedOn() {
        return snakesSteppedOn;
    }

    //declare values for user
    public int getLaddersSteppedOn() {
        return laddersSteppedOn;
    }

    public void setSnakesSteppedOn(int snakesSteppedOn) {
        this.snakesSteppedOn = snakesSteppedOn;
    }

    public void setLaddersSteppedOn(int laddersSteppedOn) {
        this.laddersSteppedOn = laddersSteppedOn;
    }
    private int snakesSteppedOn = 0;
    private int laddersSteppedOn = 0;
    //*************************************************//
    
    //*************************************************//
    //constructor
    public Player(String name)
    {
        super(name);
    }
    //*************************************************//
    
    //*************************************************//
    //get player position
    public int getPosition() {
        //*************************************************//
        //return position
        return position;
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    public void movePlayer(int roll) {
        //*************************************************//
        //get new position
        int newPosition = position + roll;
        //*************************************************//
        
        //*************************************************//
        //if_ the new position is less than the game board
        if (newPosition >= 100) {
            newPosition = 100;
        }
        //*************************************************//
        
        //*************************************************//
        // Clear old position
        int oldRow = (position - 1) / 10;
        int oldCol = (position - 1) % 10;
        //*************************************************//
        
        //*************************************************//
        if (position > 0) {
            gameBoard[oldRow][oldCol] = "[" + position + "]";
        }
        //*************************************************//
        
        //*************************************************//
        // Update position
        position = newPosition;
        int newRow = (position - 1) / 10;
        int newCol = (position - 1) % 10;
        gameBoard[newRow][newCol] = "[" + username + "]";
        //*************************************************//
    }
    //*************************************************//
    
    
    //*************************************************//
    //return game board
     public Object[][] getGameBoardData() 
     {
         //*************************************************//
        // Get the game board as a string from the superclass method
        String board = super.returnGameBoard();
        //*************************************************//
    
        //*************************************************//
        // Split the board string into rows based on newline characters
        String[] rows = board.split("\n");
        //*************************************************//
        
        //*************************************************//
        // Ensure we have the expected number of rows
        if (rows.length != 10) {
            throw new IllegalArgumentException("Unexpected number of rows in board: " + rows.length);
        }
        //*************************************************//
    
        //*************************************************//
        Object[][] gameBoardData = new Object[10][10];
        //*************************************************//
        
        //*************************************************//
        // Regular expression to match content inside square brackets
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
        //add snakes 
        gameBoardData[3][5] = "Snake";
        gameBoardData[5][1] = "Snake";
        gameBoardData[7][6] = "Snake";
        gameBoardData[9][8] = "Snake";
        //*************************************************//
        
        //*************************************************//
        // Set Ladders
        gameBoardData[4][2] = "Ladder";
        gameBoardData[6][9] = "Ladder";
        gameBoardData[8][1] = "Ladder";
        //*************************************************//
        
        //*************************************************//
        return gameBoardData;
        //*************************************************//
    }
    //*************************************************//
     
    //*************************************************//
      // Method to handle snakes and ladders
    public void checkForSnakesAndLadders() 
    {
        //*************************************************//
        //positions
        int row = (position - 1) / 10;
        int col = (position - 1) % 10;
        gameBoardData = getGameBoardData();
        //*************************************************//
        
        //*************************************************//
        String cellContent = (String) gameBoardData[row][col];
        //*************************************************//

        //*************************************************//
        if ("Snake".equals(cellContent)) 
        {
            // Move the player down
            JOptionPane.showMessageDialog(null, "Oh no! You landed on a Snake. Moving down."); 
            setSnakesSteppedOn(getSnakesSteppedOn() + 1);
            movePlayer(-10);
        } 
        //*************************************************//
        else if ("Ladder".equals(cellContent)) 
        {
            //*************************************************//
            // Move the player up
            JOptionPane.showMessageDialog(null, "Yay! You landed on a Ladder. Moving up.");
            setLaddersSteppedOn(getLaddersSteppedOn() + 1);
            movePlayer(10);
            //*************************************************//
        }
        //*************************************************//
    }
    //*************************************************//
}
//***********************************END OF FILE****************************************//