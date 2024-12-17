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
public class properties {
    
    //*************************************************//
    //global var's
    
    // prices of locations
    static int[][] prices = {{800000,1500000, 2000000}, 
        {700000,1200000, 1600000}, 
        {750000,1300000, 1800000}};
    
    //city's
    static String[] provinces = {"Gauteng", "Natal", "Cape"};
    
    //type of locations
    static String[] types = {"FLAT", "TOWNHOUSE", "HOUSE"};
    //*************************************************//
    
    //*************************************************//
    public static void main(String[] args) {
        
        //*************************************************//
        //create main instance to access the global var's in this class
        properties mainInstance = new properties();
        reportGenerator report = new reportGenerator(prices, provinces, types);
        generateStatistics stats = new generateStatistics(prices, provinces, types);
        //*************************************************//
        
        //*************************************************//
        //display the report
        report.printReport();
        //*************************************************//
        
        //*************************************************//
        //make average
        stats.findAverage();
        //*************************************************//
    }
    //*************************************************//
    
}
//***********************************END OF FILE****************************************//