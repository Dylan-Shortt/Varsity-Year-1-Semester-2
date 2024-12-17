/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//**************************************************************************************//
package prog_2019;
//*************************************************//
/**
 *
 * @author dylan
 */
//*************************************************//
public class PROG_2019 {
    //*************************************************//
    /**
     * @param args the command line arguments
     */
    //*************************************************//
    
//*************************************************//
//global variables 
    static int[][] sales = {
        {25, 15, 35},  
        {25, 55, 35},  
        {11, 20, 45},
        {17, 27, 25}
    };
    static String[] type = {"SUV", "COUPE", "SEDAN", "VAN"};
//*************************************************//
    public static void main(String[] args) {
        // TODO code application logic here
        
        //*************************************************//
        // Create instance of the main class to access global variables
        PROG_2019 mainInstance = new PROG_2019();
        monthlySalesReport report = new monthlySalesReport(sales, type);
        vehcileStars stars = new vehcileStars(sales, type);
        //*************************************************//
        
        //*************************************************//
        // Print the report
        System.out.println("*******************************************");
        System.out.println("VEHCILE SALES REPORT");
        System.out.println("*******************************************");
        //*************************************************//
        
        //*************************************************//
        //print report
        report.printReport();
        //*************************************************//
        
        //*************************************************//
        // Print the report
        System.out.println("*******************************************");
        System.out.println("VEHCILE SALES REPORT");
        System.out.println("*******************************************");
        //*************************************************//
        
        //*************************************************//
        //print stat report
        stars.printReport();
        System.out.println("*******************************************");
        //*************************************************//
        
    }
    //*************************************************//
    
}
//***********************************END OF FILE****************************************//