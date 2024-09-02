/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//*************************************************//
package prog6112_a1_st10438409_q2;
//*************************************************//

import javax.swing.JOptionPane;


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
    public static void main(String[] args) {
//**************************************************************************************//
        // TODO code application logic here
        
        //*************************************************//
        //Var's for the main program
        String username = "";
        String board;
        int roll = 0;
        int playerCount = 0;
        //*************************************************//
        
        //*************************************************//
        //get username
        username = getUsername();
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
            //roll the dice to get a new position
             roll= player.diceRoll();
            JOptionPane.showMessageDialog(null, username + " rolled a " + roll);
            //*************************************************//
            
            //*************************************************//
            //update number of player rolls
            playerCount++;
            //*************************************************//
            
            //*************************************************//
            //move the player on the board
            player.movePlayer(roll);
            board = player.returnGameBoard();
            //*************************************************//
            
            //*************************************************//
            // Get the game board data as a 2D array
            Object[][] gameBoard = player.getGameBoardData();
            //*************************************************//
            
            //*************************************************//
            // Launch the game board window with the game board data
            java.awt.EventQueue.invokeLater(() -> {
                new GameBoardWindow(gameBoard).setVisible(true);
            });
            //*************************************************//
            
            //*************************************************//
            if(playerCount > 2)
            {
              //*************************************************//
                // Check for snakes and ladders
                player.checkForSnakesAndLadders();
              //*************************************************// 
              
              //*************************************************//
                // Get the game board data as a 2D array
                Object[][] gameBoardCheck = player.getGameBoardData();
              //*************************************************//
            
             //*************************************************//
                // Launch the game board window with the game board data
                java.awt.EventQueue.invokeLater(() -> {
                    new GameBoardWindow(gameBoardCheck).setVisible(true);
                });
             //*************************************************//
            }
            //*************************************************//
            
        }
        //*************************************************//

        //*************************************************//
        JOptionPane.showMessageDialog(null, "Congratulations " + username + ", you have won the game!");
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
    public static String getUsername()
    {
        //*************************************************//
        //return string 
        String name = "";
        //*************************************************//
        
        //*************************************************//
        //check that the username has a value and is not blank
        while(name.isBlank() || name.isEmpty())
        {
            //*************************************************//
            //print message to user
            String message = "Welcome user to my Snakes and Ladders Game !\n"
                    +"Please enter your username: ";
            name = JOptionPane.showInputDialog(null, message);
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

}
//***********************************END OF FILE****************************************//