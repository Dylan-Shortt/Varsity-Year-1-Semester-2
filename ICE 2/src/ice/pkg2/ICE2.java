/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//*************************************************//
package ice.pkg2;
//*************************************************//

import javax.swing.JOptionPane;


/**
 *
 * @author dylan
 */
//**************************************************************************************//
public class ICE2 {

    /**
     * @param args the command line arguments
     */
    //*************************************************//
    public static void main(String[] args) {
        // TODO code application logic here
        
        //*************************************************//
        //create an instance of the GUI class                
        Chatbot_Window chatWindow = new Chatbot_Window();
        ChatbotComamnds commands = new ChatbotComamnds();
        TextToSpeechChatbot chatbot = new TextToSpeechChatbot();
        //*************************************************//
        
        //*************************************************//
        //create an instance of the GUI class                
        chatWindow.setVisible(true);
        //*************************************************//
        
        //*************************************************//
        //set up for the user to use teh system
        commands.setUp(chatWindow, chatbot);
        //*************************************************//
        
        //*************************************************//
        //enter first user input
        String input = "";
        String response = "";
        while (!input.equalsIgnoreCase("exit"))
        {
            
            //*************************************************//
            //set user input window
            input = JOptionPane.showInputDialog(null, "Please enter your message/request below: ");
            chatWindow.setjTextPane1_user_text(input);
            //*************************************************//
            
            //*************************************************//
            response = commands.getResponse(chatWindow, chatbot, input);
                    
           
            
            String newResponse = commands.newResponse();
            //*************************************************//
            
            //*************************************************//
            //print AI response and speak response
            chatWindow.setjTextArea_Chatbot(response);
            //speak response
            chatbot.textToSpeech(newResponse);     
            //*************************************************//
            
            
        }
        //*************************************************//
        
        //*************************************************//
        //once the user selects exit
        commands.exitCommand(chatWindow, chatbot);
        //*************************************************//
        
    }
    //*************************************************//
    
//**************************************************************************************//
}
//***********************************END OF FILE****************************************//