/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//*************************************************//
package prog6112_a1_st10438409_q2;
//*************************************************//

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author dylan
 */
//**************************************************************************************//
public class Q2_PROG6112_A1_ST10438409 {
//**************************************************************************************//

    /**
     * @param args the command line arguments
     */
    //**************************************************************************************//
    public static void main(String[] args) throws IOException {
        //**************************************************************************************//
        //Var's for the main program
        String username = "";
        String board;
        int roll = 0;
        int playerCount = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //*************************************************//
        
        //*************************************************//
        //get username
        username = getUsername(bufferedReader);
        //*************************************************//
        
        //*************************************************//
        //Launch Game Application
        Player player = new Player(username);
        //*************************************************//
        
        //*************************************************//
        //populate the game board
        player.firstPopulatingGameBoard();
        //*************************************************//
        
        
        //*************************************************//
        // Game loop
        while (player.getPosition() < 100) {
            
            //*************************************************//
            // Roll the dice to get a new position
            roll = player.diceRoll();  // Call the default diceRoll method
            System.out.println(username + " rolled a " + roll);
            //*************************************************//
            
            //*************************************************//
            //update number of player rolls
            playerCount++;
            //*************************************************//
            
            //*************************************************//
            //move the player on the board
            int position = player.movePlayer(roll);
            board = player.returnGameBoard();
            //*************************************************//
            
            //*************************************************//
            //check if the player lands on a snake or ladder
            if (playerCount > 2) 
            {
                //*************************************************//
                // Check for snakes and ladders
                player.checkForSnakesAndLadders();
                //*************************************************// 
            }
            //*************************************************//
            
            //*************************************************//
            // Display the game board
            displayGameBoard(player.getGameBoardData(), username, position);
            //*************************************************//
        }
        //*************************************************//

        //*************************************************//
        System.out.println("Congratulations " + username + ", you have won the game!");
        //*************************************************//
        
        //*************************************************//
        //print report
        System.out.println("Username          : " + username);
        System.out.println("Amount of rolls   : " + playerCount);
        System.out.println("Snakes stepped on : " + player.getSnakesSteppedOn());
        System.out.println("Ladders used      : " + player.getLaddersSteppedOn());
        //*************************************************//
        
        //*************************************************//
        System.exit(0);
        //*************************************************//
    }
    //*************************************************//
    //ask for the username of the user
    public static String getUsername(BufferedReader bufferedReader) throws IOException {
        //*************************************************//
        //return string 
        String name = "";
        //*************************************************//
        
        //*************************************************//
        //check that the username has a value and is not blank
        while (name.isBlank() || name.isEmpty()) {
            //*************************************************//
            //print message to user
            System.out.println("*************************************************");
            System.out.println("Welcome user to my Snakes and Ladders Game !");
            System.out.print("Please enter your username: ");
            name = bufferedReader.readLine();
            //*************************************************//
        }
        //*************************************************//
        
        //*************************************************//
        //return name with value
        return name;
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    public static void displayGameBoard(Object[][] gameBoard, String username, int position) {
    
    //*************************************************//
    // Determine the width of the largest cell
    int cellWidth = 10; // Adjust this width based on your needs
    //*************************************************//
    
    System.out.println("Current Game Board:");
    
    //*************************************************//
    for (int i = 0; i < gameBoard.length; i++) 
    {
        //*************************************************//
        for (int j = 0; j < gameBoard[i].length; j++) 
        {
            //*************************************************//
            // Check if this cell is the player's position
            if (position == i * 10 + j + 1) 
            { // Adjust for 1-based index
                System.out.print(String.format("[%-" + cellWidth + "s ", username + "]"));
            }
            //*************************************************//
            else 
            {
                //*************************************************//
                System.out.print(String.format("%-" + cellWidth + "s ", gameBoard[i][j]));
                //*************************************************//
            }
            //*************************************************//
        }
        //*************************************************//
        System.out.println();
    }
    //*************************************************//
    System.out.println();
    }
    //*************************************************//

}
//***********************************END OF FILE****************************************//
