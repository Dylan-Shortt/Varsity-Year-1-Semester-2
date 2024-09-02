/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//*************************************************//
package testproject;
//*************************************************//

/**
 *
 * @author dylan
 */
//*************************************************//
//imports
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//*************************************************//

//*************************************************//
public class BufferedReaderExample {
    //*************************************************//

    public static void main(String[] args) {
        //*************************************************//
        // Creating a BufferedReader object to read input from the console
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //*************************************************//
        
        //*************************************************//
        //create a string ArrayList 
        ArrayList<String> lines = new ArrayList<>();
        System.out.println("Enter lines of text (type 'exit' to quit):");
        //*************************************************//
        
        String line;
        try {
            //*************************************************//
            // Reading lines until the user types "exit"
            while (!(line = reader.readLine()).equalsIgnoreCase("exit")) {
                lines.add(line);
            }
            //*************************************************//
        } //*************************************************//
        catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        }
        //*************************************************//
        
        //*************************************************//
        System.out.println("\nYou entered:");
        // Printing all the lines entered by the user
        for (String enteredLine : lines) {
            System.out.println(enteredLine);
        }
        //*************************************************//
    }
}
