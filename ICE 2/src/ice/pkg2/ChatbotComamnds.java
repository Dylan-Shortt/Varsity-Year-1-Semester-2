/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//**************************************************************************************//
package ice.pkg2;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author dylan
 */
//*************************************************//
public class ChatbotComamnds {
//*************************************************//

    //*************************************************//
    //variables
    
    //*************************************************//
    
    //*************************************************//
    //main constructor
    public ChatbotComamnds() 
    {
    
    }
    //*************************************************//

    //*************************************************//
    //get username for the chatting window
    public String getUsername() 
    {
        //*************************************************//
        //var's
        String username = "";
        //*************************************************//
        
        //*************************************************//
        //get user input
        while(username.isBlank() || username.isEmpty())
        {
            username = JOptionPane.showInputDialog(null, "Please enter your username below: ");
        }
        //*************************************************//
        
        //*************************************************//
        //return username
        return username;
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    //create a opening message for the user
    public String openingMessage(String username)
    {
        //*************************************************//
        //mesasage
        String message = "";
        //*************************************************//
     
        //*************************************************//
        //context
        message = "Welcome " + username + ",\n";
        message += "Please enter any prompt or question, and I will assist you to the best of my abilities :)";
        //*************************************************//
        
        //*************************************************//
        //return thing
        return message;
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    //get user input
    public String userInput()
    {
        //*************************************************//
        //var's
        String input = "";
        //*************************************************//
        
        input = JOptionPane.showInputDialog(null, "Please enter your prompt to the chatbot below: ");
        
        //*************************************************//
        //return user input
        return input;
        //*************************************************//
    }
    //*************************************************//
}
//***********************************END OF FILE****************************************//