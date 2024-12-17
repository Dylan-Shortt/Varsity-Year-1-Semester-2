/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//**************************************************************************************//
package Question_2;
//*************************************************//
/**
 *
 * @author dylan
 */
//*************************************************//
public class PROG2021_Exam_Practice {
    //*************************************************//
    /**
     * @param args the command line arguments
     */
    //*************************************************// 
    
    //*************************************************//
    //static arrays and values
    static String[] title = {"BRAND", "QUARTER 1", "QUARTER 2", "QUARTER 3", "TOTAL", "STATUS"};
    
    static String[] brands = {"Triumph", "Honda", "Suzuki", "Yamaha", "Ducati"};
    
    static int[][] saleAmounts = {{500, 100, 500}  //"Triumph"
                           ,{70, 80, 200}   //"Honda"
                           ,{100, 100, 200} //"Suzuki"
                           ,{100, 70, 50}   //"Yamaha"
                           ,{300, 100, 500}};//"Ducati"
    
    //*************************************************//
    
    //*************************************************//
    public static void main(String[] args) {
        // TODO code application logic here
        
        //*************************************************//
        //main instance to use arrays 
        PROG2021_Exam_Practice mainInstance = new PROG2021_Exam_Practice();
        salesReport sales = new salesReport(title, brands, saleAmounts);
        //*************************************************//
        
        //*************************************************//
        // print report
        sales.reportOfSales();
        //*************************************************//
    }
    //*************************************************//
    
}
//***********************************END OF FILE****************************************//