/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//**************************************************************************************//
package arraymethodsexample;
//**************************************************************************************//

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntUnaryOperator;
import javax.swing.JOptionPane;

/**
 *
 * @author dylan
 */
//**************************************************************************************//
public class ArrayMethodsExample {

    /**
     * @param args the command line arguments
     */
    //*************************************************//
    public static void main(String[] args) {
        // TODO code application logic here
        
        //*************************************************//
        //decalre the arrays
        int[] array = {7,2,9,4,6,1};
        int[] otherArray = {1,2,4,6,7,9};
        //*************************************************//
        
        //*************************************************//
        //sort 'array'
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        //*************************************************//
        
        //*************************************************//
        //search for a specific key
        int key = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter key"));
        System.out.println(key + " is at index : " + Arrays.binarySearch(array, key));
        //*************************************************//
        
        //*************************************************//
        //new array with constant value
        int newArray[] = new int[10];
        int constantValue = 5;
        
        Arrays.fill(newArray, constantValue);
        System.out.println(Arrays.toString(newArray));
        //*************************************************//
        
        //*************************************************//
        //first half
        int half = array.length/2;
        int[] firstHalf = new int[10];
        
        firstHalf = Arrays.copyOfRange(array, 0, half);
        System.out.println(Arrays.toString(firstHalf));
        //*************************************************//
        
        //*************************************************//
        //equality
        System.out.println("equality: " + Arrays.equals(array, otherArray));
        //*************************************************//
        
        //*************************************************//
        //find mismatch
        int test = Arrays.mismatch(array, otherArray);
        if(test == -1)
        {
            System.out.println("no mismatch");
        }
        else
        {
            System.out.println("Mismatch: " + test);
        }
        //*************************************************//
        
        //*************************************************//
        //turn int to string
        String string;
        string = Arrays.toString(array);
        System.out.println(string);
        //*************************************************//
        
        //*************************************************//
        // Convert array to list
        Arrays.asList(array);
        System.out.println(Arrays.toString(array));
        //*************************************************//
        
        //*************************************************//
        //parral sort
        Arrays.parallelSort(otherArray);
        System.out.println(Arrays.toString(otherArray));
        //*************************************************//
        
        //*************************************************//
        //prefix
        // Apply parallelPrefix operation (e.g., sum)
        Arrays.parallelPrefix(array, Integer::sum);

        // Print the resulting array
        System.out.print("Resulting array after parallelPrefix:");
        System.out.println(Arrays.toString(array));
        //*************************************************//
        
        //*************************************************//
        //new array
        int[] parrallelArray = new int[10];
        Arrays.parallelSetAll(parrallelArray, index -> index * 2); // Example generator that multiplies the index by 2
        System.out.println(Arrays.toString(parrallelArray));
        //*************************************************//
    }
    //*************************************************//
    
}
//***********************************END OF FILE****************************************//