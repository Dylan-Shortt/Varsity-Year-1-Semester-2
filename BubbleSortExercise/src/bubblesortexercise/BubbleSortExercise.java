/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubblesortexercise;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author dylan
 */
public class BubbleSortExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //*************************************************//
        //recive array size input
        String input = JOptionPane.showInputDialog(null, "Enter size of the array:");
        //*************************************************//
        
        //*************************************************//
        //check that the string only contains digits
         while (!input.matches("\\d+")) 
        {
            input = JOptionPane.showInputDialog(null, "Enter size of the array:");
        }
         //*************************************************//
         
        //*************************************************//
        //declare array
        int size = Integer.parseInt(input);
        int[] array = new int [size];
        //*************************************************//
        
        
        //*************************************************//
        //populate the array
        for (int i = 0; i < size; i ++)
        {
            array[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the array value at position " + (i+1) +":"));
        }
        //*************************************************//
        
        //*************************************************//
        //sort the array using bubble sort
        for (int i = 0; i < size - 1; i++)
        {
            for(int j = 0; j < size - 1 - i; j++)
            {
                if(array[j] > array[j + 1])
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        //*************************************************//
        
        //*************************************************//
        //display the array
        System.out.print("Array values: ");
        for (int i = 0; i < size; i ++)
        {
            System.out.print(array[i] + " ");
        }
        //*************************************************//
        
    }
    
}
