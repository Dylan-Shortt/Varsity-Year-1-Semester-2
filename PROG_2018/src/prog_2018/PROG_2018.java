/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//**************************************************************************************//
package prog_2018;
//*************************************************//
/**
 *
 * @author dylan
 */
//*************************************************//
public class PROG_2018 {
//*************************************************//
    /**
     * @param args the command line arguments
     */
//*************************************************//
    
    //*************************************************//
    //global variable's 
    static int[][] sales = {{30, 15, 35}
                    , {20, 25, 30}
                    , {25, 11, 32}};
    
    static String[] brands = {"IPhone 7", "Samsung S8", "Huawei Mate 10"};
    //*************************************************//
    public static void main(String[] args) {
        // TODO code application logic here
        //*************************************************//
        //create class instance for main variables
        PROG_2018 mainInstance = new PROG_2018();
        printReport report = new printReport(sales, brands);
        //*************************************************//
        
        //*************************************************//
        //title
        System.out.println("**************************************************************************************************");
        System.out.println("TOP CELL PHONE SALES REPORT - 2018");
        System.out.println("**************************************************************************************************");
        //*************************************************//
        
        //*************************************************//
        //print report
        report.report();
        //*************************************************//
    }
    //*************************************************//
    
}
//***********************************END OF FILE****************************************//