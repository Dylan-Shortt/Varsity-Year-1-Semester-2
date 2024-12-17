/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//**************************************************************************************//
package Question_1;
//*************************************************//
/**
 *
 * @author dylan
 */
//*************************************************//
public class PROG6112_Exam_Brief_Example {
    //*************************************************//
    /**
     * @param args the command line arguments
     */
    //*************************************************//
    
    //*************************************************//
    //static arrays for main classes
    static double[][] Costs = {{8000, 2500, 5000} //Joe Bloggs
                                ,{7000, 2200, 5600}};    //Jane Doe
    
    static String[] title = {"JAN", "FEB", "MAR"};
    
    static String[] technicians = {"Joe Bloggs", "Jane Doe"};
    //*************************************************//
    
    //*************************************************//
    public static void main(String[] args) {
        // TODO code application logic here
        //*************************************************//
        //main instance
        PROG6112_Exam_Brief_Example mainInstance = new PROG6112_Exam_Brief_Example();
        Repairs repairReport = new Repairs(Costs, title, technicians);
        //*************************************************//
        
        //*************************************************//
        //print report
        repairReport.printReport();
        //*************************************************//
    }
    //*************************************************//
    
}
//***********************************END OF FILE****************************************//