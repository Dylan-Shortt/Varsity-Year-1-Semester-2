/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog_2019;
//**************************************************************************************//
/**
 *
 * @author dylan
 */
public class monthlySalesReport {
    
    //*************************************************//
    //var's
    private int[][] sales;
    private String[] type;
    private String[] months = {"JAN", "FEB", "MAR"};
    //*************************************************//
    
    //*************************************************//
    //constructor
    public monthlySalesReport(int[][] sales, String[] type) {
        this.sales = sales;
        this.type = type;
    }
    //*************************************************//
    
    //*************************************************//
    //print report
    public void printReport()
    {
        // Print header
        System.out.printf("%-10s %-10s %-10s %-10s%n", "",months[0], months[1], months[2]);

        // Print rows with formatted columns and a dollar sign in front of numbers
        for (int i = 0; i < sales.length; i++) 
        {
            System.out.printf("%-10s %-10d %-10d %-10d%n", type[i], sales[i][0], sales[i][1], sales[i][2]);
        }
    }
    //*************************************************//
    
    
}
//***********************************END OF FILE****************************************//