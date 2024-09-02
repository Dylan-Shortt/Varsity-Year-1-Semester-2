/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//*************************************************//
package twodarrayexercise;
//*************************************************//

import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author dylan
 */
//*************************************************//
public class TwoDArrayExercise {
//*************************************************//

    /**
     * @param args the command line arguments
     */
    //*************************************************//
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            
            //*************************************************//
            //get the row and column size's
            int row = 0;
            int column = 0;
            //*************************************************//
            
            //*************************************************//
            //buffered reader
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            //*************************************************//
            
            //*************************************************//
            //recive user input on the size of the array
            System.out.print("Enter number of rows: ");
            row = Integer.parseInt(bufferedReader.readLine());
            
            System.out.print("Enter number of columns: ");
            column = Integer.parseInt(bufferedReader.readLine());
            System.out.println();
            //*************************************************//
            
            //*************************************************//
            //int 2 D array
            int [][] array = new int[row][column];
            Random value = new Random();
            //*************************************************//
            
            //*************************************************//
            //populate array
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < column; j++) 
                {
                    array[i][j] = value.nextInt(9) + 1;
                }
            }
            //*************************************************//
            
            //*************************************************//
            //print message
            System.out.println("Unsorted array: ");
            //print unsorted array
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < column; j++) 
                {
                    System.out.print("[" + array[i][j] + "]");
                }
                System.out.println("");
            }
            //*************************************************//
            
            //*************************************************//
            //sort using insertion sort
            for (int i = 0; i < row; i++) 
            {
                for (int j = 1; j < column; j++) 
                {
                    int key = array[i][j];
                    int k = j - 1;

                    // Move elements of array[i][0..j-1], that are greater than key, to one position ahead of their current position
                    while (k >= 0 && array[i][k] > key) {
                    array[i][k + 1] = array[i][k];
                    k = k - 1;
                    }
                array[i][k + 1] = key;
                }
            }
            //*************************************************//
            
            //*************************************************//
            //print message
            System.out.println("Sorted array: ");
            //print unsorted array
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < column; j++) 
                {
                    System.out.print("[" + array[i][j] + "]");
                }
                System.out.println();
            }
            //*************************************************//
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(TwoDArrayExercise.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    //*************************************************//
    
}
//***********************************END OF FILE****************************************//