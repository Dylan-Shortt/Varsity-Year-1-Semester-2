/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog_2018;

/**
 *
 * @author dylan
 */
public class printReport {
    
    //*************************************************//
    //variables
    private int[][] sales;
    private String[] brands;
    private int total;
    private int[] monthTotal = new int[3];
    private int sub = 0;
    //*************************************************//

    //*************************************************//
    //constructor
    public printReport(int[][] sales, String[] brands) {
        this.sales = sales;
        this.brands = brands;
    }
    //*************************************************//
    
    //*************************************************//
    //print report
    public void report()
    {
        // Print header
        System.out.printf("%-20s %-20s %-20s %-20s %-20s%n", "", "JAN", "FEB", "MAR", "TOTAL");

        // Print rows with formatted columns
        for (int i = 0; i < sales.length; i++) 
        {
            total = sales[i][0] + sales[i][1] + sales[i][2];
            System.out.printf("%-20s %-20d %-20d %-20d %-20d%n", brands[i], sales[i][0], sales[i][1], sales[i][2], total);
            monthTotal[sub] = sales[0][i] + sales[1][i] + sales[2][i];
            sub++;
        }
        System.out.println("**************************************************************************************************");
        //print monthly
        System.out.printf("%-20s %-20d %-20d %-20d%n", "MONTHLY TOTAL", monthTotal[0], monthTotal[1], monthTotal[2]);
        System.out.println("**************************************************************************************************");
    }
    //*************************************************//
    
}
//***********************************END OF FILE****************************************//