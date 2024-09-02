//**************************************************************************************//
package prog6112_a1_st10438409_q2;

import java.io.*;
import java.util.Random;

/**
 * Game class to handle Snakes and Ladders game logic
 * Author: Dylan
 */
//**************************************************************************************//
public class Game {
    //*************************************************//
    // Declare game board and username
    protected String[][] gameBoard = new String[10][10];
    protected String username;
    protected int playerPosition; // Track player position
    //*************************************************//
    
    //*************************************************//
    // Constructor
    public Game(String name) {
        username = name;
        playerPosition = 0; // Initialize player position
    }
    //*************************************************//
    
    //*************************************************//
    // Populate the game board with starting values
    public String[][] firstPopulatingGameBoard() {
        //*************************************************//
        // Initialize the number to be placed on the board
        int number = 1;
        //*************************************************//
        
        //*************************************************//
        // Populate the game board array
        for (int i = 0; i < 10; i++) {
            //*************************************************//
            // Populate each row
            for (int j = 0; j < 10; j++) 
            {
                gameBoard[i][j] = "[" + number + "]";
                number++;
            }
            //*************************************************//
        }
        //*************************************************//
        
        //*************************************************//
        // Return the populated game board
        return gameBoard;
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    // Return the game board as a formatted string
    public String returnGameBoard() {
        //*************************************************//
        // Initialize a StringBuilder to build the board string
        StringBuilder board = new StringBuilder();
        //*************************************************//
        
        //*************************************************//
        // Loop through the game board to create the string representation
        for (int i = 0; i < 10; i++) {
            //*************************************************//
            // Add each cell to the board string with proper formatting
            for (int j = 0; j < 10; j++) 
            {
                //*************************************************//
                board.append(gameBoard[i][j]);
                //*************************************************//
                
                //*************************************************//
                if (j < 9) 
                { // Add a space between cells except after the last cell in the row
                    //*************************************************//
                    board.append(" ");
                    //*************************************************//
                }
                //*************************************************//
            }
            //*************************************************//
            // Move to the next line after each row
            board.append("\n");
        }
        //*************************************************//
        
        //*************************************************//
        // Return the complete board string
        return board.toString();
        //*************************************************//
    }
    
    //*************************************************//
    // Simulate a dice roll (default method)
    public int diceRoll() {
        //*************************************************//
        // Use the System.in input stream by default
        return diceRoll(System.in);
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    // Roll dice with input stream for testing purposes
    public int diceRoll(InputStream in) {
        //*************************************************//
        // Declare the Random class for generating random numbers
        Random random = new Random();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        //*************************************************//
        
        //*************************************************//
        // Ask the user for input until a valid response is received
        while (true) {
            try {
                //*************************************************//
                // Ask the user if they want to enter a value or roll a random number
                System.out.print("Do you want to enter a number or roll a dice? (enter/roll): ");
                String response = bufferedReader.readLine().trim().toLowerCase();
                System.out.println();
                //*************************************************//
                
                //*************************************************//
                // If the user enters 'exit', quit the program
                if (response.equalsIgnoreCase("exit")) {
                    System.out.println("Thank you for playing");
                    System.exit(0);
                }
                //*************************************************//
                
                //*************************************************//
                // If the user selects to enter a value
                if (response.equals("enter")) {
                    //*************************************************//
                    // Ask the user to enter a value between 1 and 21
                    System.out.print("Enter a number between 1 and 21: ");
                    String input = bufferedReader.readLine();
                    System.out.println();
                    int value = Integer.parseInt(input);
                    //*************************************************//
                    
                    //*************************************************//
                    // Validate that the entered value is between the selected values
                    if (value >= 1 && value <= 21) {
                        //*************************************************//
                        // If the value is valid, return it
                        return value;
                        //*************************************************//
                    } else {
                        //*************************************************//
                        // If the value is invalid, ask the user to re-enter the value
                        System.out.println("Invalid number. Please enter a number between 1 and 21.");
                        //*************************************************//
                    }
                    //*************************************************//
                } 
                //*************************************************//
                // If the user selects to have the game roll a random number
                else if (response.equals("roll")) {
                    //*************************************************//
                    // Roll a dice number between 1 and 6 (inclusive)
                    int roll = random.nextInt(6) + 1;
                    return roll;
                    //*************************************************//
                } else {
                    //*************************************************//
                    // Check that the entered command is either 'enter' or 'roll'
                    System.out.println("Invalid response. Please enter 'enter' or 'roll'.");
                    //*************************************************//
                }
                //*************************************************//
            } 
            //*************************************************//
            // Handle cases where the entered value is not a valid number
            catch (NumberFormatException ex) {
                System.out.println("Invalid number. Please enter a number between 1 and 21.");
            } 
            //*************************************************//
            // Handle any other input/output errors
            catch (IOException ex) {
                System.out.println("An error occurred while reading input.");
            }
            //*************************************************//
        }
    }
    //*************************************************//
}
//***********************************END OF FILE****************************************//