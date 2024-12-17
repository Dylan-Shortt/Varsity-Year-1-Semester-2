/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//**************************************************************************************//
package test_brief_fix;
//*************************************************//
/**
 *
 * @author dylan
 */
//*************************************************//

//*************************************************//
public class cameraResults {
    
    //*************************************************//
    //variables
    private double[][] prices;
    private String[] brands;
    //*************************************************//

    //*************************************************//
    //constructor 
    public cameraResults(double[][] prices, String[] brands) {
        this.prices = prices;
        this.brands = brands;
    }
    //*************************************************//
    
    //*************************************************//
    public void outputResults()
    {
        //*************************************************//
        int pos = 0;
        double  currentHighest = 0;
        //*************************************************//
        
        //*************************************************//
        for (int i = 0; i < prices.length; i++)
        {
            //*************************************************//
            double difference = prices[i][0] - prices[i][1];
            //*************************************************//
            
            //*************************************************//
            if(difference > currentHighest)
            {
                currentHighest = difference;
                pos = i;
            }
            //*************************************************//
            
            //*************************************************//
            if(difference >= 2500)
            {
                System.out.printf("%-20s R%-20s", brands[i], difference + " ***");
            }
            //*************************************************//
            else
            {
                System.out.printf("%-20s R%-20s", brands[i], difference);
            }
            //*************************************************//
            System.out.println();
        }
        //*************************************************//
        
        //*************************************************//
        System.out.println();
        System.out.println("CAMERA WITH THE MOST DIFFERNCE IS: " + brands[pos]);
        System.out.println("*************************************************");
        //*************************************************//
    }
    //*************************************************//
    
}
//***********************************END OF FILE****************************************//