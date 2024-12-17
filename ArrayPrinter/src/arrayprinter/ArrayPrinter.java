/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//**************************************************************************************//
package arrayprinter;
//*************************************************//
/**
 *
 * @author dylan
 */
//*************************************************//
public class ArrayPrinter {
    
    //*************************************************//
    public static void main(String[] args) {
        //*************************************************//
        //arrays declared
        String[] singleArray = {"Apple", "Banana", "Cherry"};
        double[][] doubleArray = {{1.234, 5.6789}, {123.45, 9.1}, {0.12, 34.567}};
        //*************************************************//

        //*************************************************//
        // Print header
        System.out.printf("%-10s %-15s %-15s%n", "Item", "Value 1", "Value 2");
        //*************************************************//

        //*************************************************//
        // Print rows with formatted columns and a rand sign in front of numbers
        for (int i = 0; i < singleArray.length; i++) {
            System.out.printf("%-10s R%-14.2f R%-14.2f%n", singleArray[i], doubleArray[i][0], doubleArray[i][1]);
        }
        //*************************************************//
    }
    //*************************************************//
}
//***********************************END OF FILE****************************************//