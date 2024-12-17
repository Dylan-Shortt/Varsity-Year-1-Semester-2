/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//**************************************************************************************//
package Question2;
//*************************************************//

import java.text.DecimalFormat;

/**
 *
 * @author dylan
 */
//*************************************************//
public class generateStatistics {
    
    //*************************************************//
    private int[][] prices;
    private String[] provinces;
    private String[] types;
    //*************************************************//

    //*************************************************//
    public generateStatistics(int[][] prices, String[] provinces, String[] types) {
        this.prices = prices;
        this.provinces = provinces;
        this.types = types;
    }
    //*************************************************//
    
    //*************************************************//
    //generate average
    public void findAverage()
    {
        //*************************************************//
        //find everage for every location
        for (int i = 0; i < prices.length; i++) 
        {
          //find the average
          double average = prices[i][0] + prices[i][1] + prices[i][2];
          average = average / 3;
          
          //format average to 3 decimal places
          DecimalFormat df = new DecimalFormat("#.###");
          String formattedValue = df.format(average);
          
          System.out.println("Average property price in " + provinces[i] + " = R" + formattedValue);
        }
        //*************************************************//
    }
    //*************************************************//
    
}
//***********************************END OF FILE****************************************//