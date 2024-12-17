/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SequentialAndRandom;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;



/**
 *
 * @author dylan
 */
public class SequentialAndRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    //*************************************************//
    //read the text file
    readSequentially();
    //*************************************************//
    System.out.println();
    
    //*************************************************//
    //add line
    appendSequentially("New Line added to the text file");
    //*************************************************//
    System.out.println();
    
    //*************************************************//
    //read the text file
    readSequentially();
    //*************************************************//
    System.out.println();
    
    //*************************************************//
    //random position 
    readRandomly(5);
    //*************************************************//
    
    //*************************************************//
    System.out.println();
    modifyRandomly(10, "zzzzzzzzzzzzzzzzzzzzzzzzzzz");
    //*************************************************//
    
    readSequentially();
        
    }

    //*************************************************//
    public static void readSequentially()
    {
        //*************************************************//
        //Sequential Access to a File
        try (BufferedReader reader = new BufferedReader(new FileReader("datafile.txt"))) {
            
            //*************************************************//
            String line;
            //*************************************************//
            
            //*************************************************//
            while ((line = reader.readLine()) != null) 
            {
                //*************************************************//
                System.out.println(line);
                //*************************************************//
            }
            //*************************************************//
            
        //*************************************************//    
        } catch (IOException e) {
            e.printStackTrace();
        }
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    public static void appendSequentially(String newLine)
    {
        //*************************************************//
        try {
            //*************************************************//
            PrintWriter writer = new PrintWriter(new FileWriter("datafile.txt", true));
            //*************************************************//
            
            //*************************************************//
            writer.println(newLine);
            //*************************************************//
            
            //*************************************************//
            writer.close();
            //*************************************************//
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        //*************************************************//
    }
    //*************************************************//

    //*************************************************//
    public static void readRandomly(int position) {
        //*************************************************//
        //file
        RandomAccessFile file = null;
        //*************************************************//
        
        //*************************************************//
        try {
            //*************************************************//
            // Open the file in read mode
            file = new RandomAccessFile("datafile.txt", "r");
            //*************************************************//
            
            //*************************************************//
            // Move the file pointer to the specified byte position
            file.seek(position);
            //*************************************************//
            
            //*************************************************//
            // Read a character at the specified position
            char ch = (char) file.read();
            //*************************************************//
            
            //*************************************************//
            // Print the character
            System.out.println("Character at position " + position + ": " + ch);
            //*************************************************//
            
            //*************************************************//
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        } 
        //*************************************************//
        finally {
            //*************************************************//
            // Ensure the file is closed to avoid resource leaks
            if (file != null) {
                
                //*************************************************//
                try {
                    
                    //*************************************************//
                    file.close();
                    //*************************************************//
                    
                } catch (IOException e) {
                    System.err.println("Error closing file: " + e.getMessage());
                }
                //*************************************************//
            }
            //*************************************************//
        }
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    public static void modifyRandomly(int position, String newText) {
        //*************************************************//
        RandomAccessFile file = null;
        //*************************************************//
        try {
            //*************************************************//
            // Open the file in read/write mode
            //*************************************************//
            file = new RandomAccessFile("datafile.txt", "rw");
            //*************************************************//

            //*************************************************//
            // Move the file pointer to the specified byte position
            //*************************************************//
            file.seek(position);
            //*************************************************//

            //*************************************************//
            // Write the new string starting from the specified position
            //*************************************************//
            file.writeBytes(newText);
            //*************************************************//

            //*************************************************//
            System.out.println("Modified file at position " + position + " with: " + newText);
            //*************************************************//

        } catch (IOException e) {
            //*************************************************//
            System.err.println("Error modifying the file: " + e.getMessage());
            //*************************************************//

        } finally {
            //*************************************************//
            // Ensure the file is closed to avoid resource leaks
            //*************************************************//
            if (file != null) {
                try {
                    //*************************************************//
                    file.close();
                    //*************************************************//
                } catch (IOException e) {
                    //*************************************************//
                    System.err.println("Error closing file: " + e.getMessage());
                    //*************************************************//
                }
            }
            //*************************************************//
        }
        //*************************************************//
    }
    //*************************************************//
}
//***********************************END OF FILE****************************************//