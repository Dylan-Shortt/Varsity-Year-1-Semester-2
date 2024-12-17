/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//**************************************************************************************//
package test_brief_fix;
//**************************************************************************************//
/**
 *
 * @author dylan
 */
//**************************************************************************************//
public class cameraReport {
    
    //*************************************************//
    //variables
    private double[][] prices;
    private String[] brands;
    //*************************************************//

    //*************************************************//
    //constructor 
    public cameraReport(double[][] prices, String[] brands) {
        this.prices = prices;
        this.brands = brands;
    }
    //*************************************************//
    
    //*************************************************//
    public void cameraReport()
    {
        //*************************************************//
        System.out.printf("%-20s %-20s %-20s%n", "", "MIRRORLESS", "DSLR");
        //*************************************************//
        
        //*************************************************//
        for (int i = 0; i < prices.length; i++)
        {
            System.out.printf("%-20s R%-20s R%-20s%n", brands[i], prices[i][0], prices[i][1]);
        }
        //*************************************************//
    }
    //*************************************************//
    
}
//***********************************END OF FILE****************************************//