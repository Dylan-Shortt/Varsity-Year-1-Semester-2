/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//**************************************************************************************//
package ice.pkg2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dylan
 */
//*************************************************//
public class ChatbotComamnds {
//*************************************************//
    
    //*************************************************//
    //new string response for TTS
    private String newResponse = "";
    //*************************************************//

    public void setNewResponse(String newResponse) {
        this.newResponse = newResponse;
    }
    
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
    
    //*************************************************//
    //exit
    public static void exitCommand(Chatbot_Window chatWindow, TextToSpeechChatbot chatbot)
    {
        chatWindow.setjTextArea_Chatbot("Thank you for time and come back again soon");
        chatbot.textToSpeech("Thank you for time and come back again soon");
        System.exit(0);
    }
    //*************************************************//

    public void setUp(Chatbot_Window chatWindow, TextToSpeechChatbot chatbot) 
    {
        //*************************************************//
        //setup for window
        String usernameFromUser = getUsername();
        //*************************************************//
        
        //*************************************************//
        chatWindow.setUsername("User: " + usernameFromUser);
        //*************************************************//
        
        //*************************************************//
        //opening message
        String message = openingMessage(usernameFromUser);
        chatWindow.setjTextArea_Chatbot(message);
        //play voice
        chatbot.textToSpeech(message); 
        //*************************************************//
    }
    //*************************************************//
    //response from the AI
    public String getResponse(Chatbot_Window chatWindow, TextToSpeechChatbot chatbot, String input) 
    {
        //*************************************************//
        String response = "";
        //*************************************************//
        
//**************************************************************************************//
        //array Lists with the full list of responses
        ArrayList<String> userResponse = new ArrayList<String>();
        ArrayList<String> arrayList = new ArrayList<String>();
//**************************************************************************************//
        // Populating userResponse ArrayList
userResponse.add("How do I make a string builder?");
userResponse.add("How do I create a buffered reader?");
userResponse.add("How do I print to the console?");
userResponse.add("How do I handle exceptions?");
userResponse.add("How do I use a loop?");
userResponse.add("How do I create an array?");
userResponse.add("How do I declare a variable?");
userResponse.add("How do I optimize my code?");
userResponse.add("How do I debug my code?");
userResponse.add("How do I write comments in code?");

//**************************************************************************************//
// Populating arrayList ArrayList
arrayList.add("You can create one by performing the following: \nStringBuilder stringBuilder = new StringBuilder();");
arrayList.add("You can create one by performing the following: \nBufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));");
arrayList.add("You can print to the console by performing: \nSystem.out.println(\"Your message\");");
arrayList.add("You can handle exceptions using try-catch blocks: \ntry {\n  // code\n} catch (Exception e) {\n  e.printStackTrace();\n}");
arrayList.add("You can use a loop like this: \nfor(int i = 0; i < limit; i++) {\n  // code\n}");
arrayList.add("You can create an array like this: \nint[] array = new int[size];");
arrayList.add("You can declare a variable like this: \nint myVariable = 10;");
arrayList.add("To optimize your code, look for redundant operations and eliminate them.");
arrayList.add("To debug your code, use breakpoints and step through the execution.");
arrayList.add("You can write comments like this: \n// This is a single-line comment.");

//**************************************************************************************//

        // Check if the input matches any in userResponse
int index = userResponse.indexOf(input);

if (index != -1) {
    // Input found in userResponse list
    // Get response string
    response = chatWindow.getjTextArea_Chatbot().getText() + "\n\n";
    response += arrayList.get(index);
    
    // Set new response
    setNewResponse(arrayList.get(index));
} else {
    // Input not found in userResponse list
    if (input.equalsIgnoreCase("help")) {
        // Provide help information
        StringBuilder helpString = new StringBuilder();
        for (int i = 0; i < Math.min(userResponse.size(), 10); i++) {
            helpString.append(userResponse.get(i)).append("\n");
        }
        response = helpString.toString();
        
        // Set new response
        setNewResponse(response);
    } else {
        // Input does not match any known responses and is not "help"
        response = "Sorry, I can't help with that.";
        
        // Set new response
        setNewResponse(response);
    }
}

        
        //*************************************************//
        
        //*************************************************//
        return response;
        //*************************************************//
    }
    //*************************************************//

    //*************************************************//
    //return TTS
    public String newResponse() 
    {
        return newResponse;
    }
    //*************************************************//
    
}
//***********************************END OF FILE****************************************//