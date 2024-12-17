/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog_2019;

/**
 *
 * @author dylan
 */
public class vehcileStars {
    
    //*************************************************//
    //var's
    private int[][] sales;
    private String[] type;
    private String[] stars = {"(Silver Star)", "(Gold Star)"};
    private int total = 0;
    private int star = 0;
    //*************************************************//
    
    //*************************************************//
    //constructor
    public vehcileStars(int[][] sales, String[] type) {
        this.sales = sales;
        this.type = type;
    }
    //*************************************************//
    
    //*************************************************//
    //print report
    public void printReport()
    {
        // Print rows with formatted columns and a dollar sign in front of numbers
        for (int i = 0; i < sales.length; i++) 
        {
            //get total sales for vehcile
            total = sales[i][0] + sales[i][1] + sales[i][2];
            
            //determine stars
            if(total >= 100)
            {
                star = 1;
            }
            else
            {
                star = 0;
            }
            
            //output result
            System.out.printf("%-10s %-10d %-10s%n", type[i], total, stars[star]);
        }
    }
    //*************************************************//
    
}
//***********************************END OF FILE****************************************//