/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//*************************************************//
package ice.pkg2;
//*************************************************//

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
        //setup for window
        String usernameFromUser = commands.getUsername();
        //*************************************************//
        
        //*************************************************//
        chatWindow.setUsername("User: " + usernameFromUser);
        //*************************************************//
        //*************************************************//
        //opening message
        String message = commands.openingMessage(usernameFromUser);
        chatWindow.setjTextArea_Chatbot(message);
        //play voice
        chatbot.textToSpeech(message); 
        //*************************************************//
        
        //*************************************************//
        
    }
    //*************************************************//
    
//**************************************************************************************//
}
//***********************************END OF FILE****************************************//