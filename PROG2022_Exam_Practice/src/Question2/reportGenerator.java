/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//**************************************************************************************//
package Question2;
//*************************************************//
/**
 *
 * @author dylan
 */
//*************************************************//
public class reportGenerator {
    
    //*************************************************//
    private int[][] prices;
    private String[] provinces;
    private String[] types;
    //*************************************************//

    //*************************************************//
    public reportGenerator(int[][] prices, String[] provinces, String[] types) {
        this.prices = prices;
        this.provinces = provinces;
        this.types = types;
    }
    //*************************************************//
    
    
    //*************************************************//
    //print accident report
    public void printReport()
    {
        //*************************************************//
        // Print header
        System.out.printf("%-20s %-21s %-21s %-20s%n", "",types[0], types[1], types[2]);
        System.out.println("-----------------------------------------------------------------------------------");
        //*************************************************//
        
        //*************************************************//
        // Print rows with formatted columns
        for (int i = 0; i < prices.length; i++) 
        {
            System.out.printf("%-20s R %-20d R %-20d R %-20d%n", provinces[i], prices[i][0], prices[i][1], prices[i][2]);
        }
        //*************************************************//
    }
    //*************************************************//
    
}
//***********************************END OF FILE****************************************//
