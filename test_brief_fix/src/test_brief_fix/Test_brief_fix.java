/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
public class Test_brief_fix {
    //*************************************************//
    /**
     * @param args the command line arguments
     */
    //*************************************************//
    
    //*************************************************//
    //global variables
    static double[][] prices = {{10500.00, 8500.00}
                        ,{9500.00, 7200.00}
                        , {12000.00, 8000.00}};
    static String[] brands = {"CANON", "SONY", "NIKON"};
    //*************************************************//
    
    //*************************************************//
    public static void main(String[] args) {
        // TODO code application logic here
        
        //*************************************************//
        //create instace of classes to use methods and variables
        Test_brief_fix mainInstance = new Test_brief_fix();
        cameraReport report = new cameraReport(prices, brands);
        cameraResults results = new cameraResults(prices, brands);
        //*************************************************//
        
        //*************************************************//
        //display title
        System.out.println("*************************************************");
        System.out.println("CAMERA TECHNOLOGY REPORT");
        System.out.println("*************************************************");
        //*************************************************//
        
        //*************************************************//
        //print report
        report.cameraReport();
        //*************************************************//
        
        //*************************************************//
        //display title
        System.out.println("*************************************************");
        System.out.println("CAMERA TECHNOLOGY RESULTS");
        System.out.println("*************************************************");
        //*************************************************//
        
        //*************************************************//
        //display results
        results.outputResults();
        //*************************************************//
        
    }
    //*************************************************//
    
}

//***********************************END OF FILE****************************************//