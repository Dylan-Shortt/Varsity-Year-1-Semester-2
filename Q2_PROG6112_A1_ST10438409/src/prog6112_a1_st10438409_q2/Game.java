/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//**************************************************************************************//
package prog6112_a1_st10438409_q2;
//**************************************************************************************//

import java.io.*;
import java.util.Random;
import javax.swing.JOptionPane;


/**
 *
 * @author dylan
 */
//**************************************************************************************//
public class Game {
//**************************************************************************************//
    
    //*************************************************//
    protected String[][] gameBoard = new String[10][10];
    protected String username;
    //*************************************************//
    
    //*************************************************//
    //constructor
    public Game(String name)
    {
        username = name;
    }
    //*************************************************//
    
    //*************************************************//
    //populate the game board with starting values
    public String[][] firstPopulatingGameBoard()
    {   
        //*************************************************//
        //int number
        int number = 1;
        //*************************************************//
        
        //*************************************************//
        //populate array
        for (int i = 0; i < 10; i++)
        {
            //*************************************************//
            //populate rows
            for (int j = 0; j < 10; j++)
            {
                gameBoard[i][j] = "[" + number + "]";
                number++;
            }
            //*************************************************//
        }
        //*************************************************//
        
        //*************************************************//
        //return 
        return gameBoard;
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    //return the gameBoard
    public String returnGameBoard()
    {
        //*************************************************//
        //board
        String board = "";
        //*************************************************//
        
    //*************************************************//
        //print board
        //*************************************************//
        //populate array
        for (int i = 0; i < 10; i++)
        {
            //*************************************************//
            //populate rows
            for (int j = 0; j < 10; j++)
            {
                board += gameBoard[i][j];
            }
            //*************************************************//
            
            board += "\n";
        }
        //*************************************************//
    //*************************************************//
        
        //*************************************************//
        return board;
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    //to match the call in the main class
    public int diceRoll() 
    {
    return diceRoll(System.in);
    }
    //*************************************************//
    
    //*************************************************//
    // Roll dice
    public int diceRoll(InputStream in) {
        //*************************************************//
        //declare the random class for a random number
        Random random = new Random();
        //*************************************************//
        
        //*************************************************//
        //ask the user for input until the condition is met
        while (true) {
            try {
                //*************************************************//
                // Ask the user if they want to enter a value or roll a random number
                String response;
                //*************************************************//
                response = JOptionPane.showInputDialog(null, "Do you want to enter a number or roll a dice? (enter/roll): ");
                response = response.toLowerCase();
                //*************************************************//
                //if the user enters 'exit' quite the program
                if(response.equalsIgnoreCase("exit"))
                {
                    JOptionPane.showMessageDialog(null, "Thank you for playing");
                    System.exit(0);
                }
                //*************************************************//
                
                //*************************************************//
                //if_ the user selects to enter a value
                if (response.equals("enter")) 
                {
                    //*************************************************//
                    // Ask the user to enter a value between 1 and 6
                    String input = JOptionPane.showInputDialog(null, "Enter a number between 1 and 21: ");
                    //turn the string value into an integer value
                    int value = Integer.parseInt(input);
                    //*************************************************//
                    
                    //*************************************************//
                    // Validate the entered value is between the selected values
                    if (value >= 1 && value <= 21) 
                    {
                        //*************************************************//
                        //the value is between one and six, return true
                        return value;
                        //*************************************************//
                    } 
                    else 
                    {
                        //*************************************************//
                        //the value is invalid, ask the user to re-enter the value
                        JOptionPane.showMessageDialog(null,"Invalid number. Please enter a number between 1 and 21.");
                        //*************************************************//
                    }
                    //*************************************************//
                } 
                //*************************************************//
                //if_ the user selects to have the game roll a random number
                else if (response.equals("roll")) 
                {
                    //*************************************************//
                    // Roll a dice number between 1 and 6 (inclusive)
                    int roll = random.nextInt(6) + 1;
                    return roll;
                    //*************************************************//
                } 
                else 
                {
                    //*************************************************//
                    //checks the entered command is infact enter or roll
                    JOptionPane.showMessageDialog(null,"Invalid response. Please enter 'enter' or 'roll'.");
                    //*************************************************//
                }
                //*************************************************//
            } 
            //*************************************************//
            //*************************************************//
            catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null,"Invalid number. Please enter a number between 1 and 6.");
            }
            //*************************************************//
        }
    }
    //*************************************************//
    
}
//***********************************END OF FILE****************************************//