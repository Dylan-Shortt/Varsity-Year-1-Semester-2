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

//*************************************************//
//imports 
import java.util.Locale;
//*************************************************//

public class PROG2023_Exam_Practice {
    //*************************************************//
    /**
     * @param args the command line arguments
     */
    //*************************************************//
    
    //*************************************************//
    // arrays that store the programs values
    static String[] headings = { "JAN", "FEB", "MAR"};
    
    static String[] estateAgents = {"Joe Bloggs", "Jane Doe"};
    
    static double[][] propertySales = {{800000, 1500000, 2000000}//Joe Bloggs
                                        , {700000, 1200000, 1600000}};//Jane Doe
    //*************************************************//
    
    //*************************************************//
    public static void main(String[] args) {
        // TODO code application logic here
        
        //*************************************************//
        //declare variables 
        double[] totals = new double[estateAgents.length];
        int temp = 0;
        //*************************************************//
        
        //*************************************************//
        //main instance of main class for static global fields
        PROG2023_Exam_Practice mainInstance = new PROG2023_Exam_Practice();
        //declare and create an instance of the method class
        EstateAgent agents = new EstateAgent(headings, estateAgents, propertySales);
        //*************************************************//
                
        //*************************************************//
        //print basic report of estate agents
        agents.printBasicReport();
        //*************************************************//
        
        //*************************************************//
        //print total sales per agent
        for (int i = 0; i < estateAgents.length; i++)
        {
            double total = agents.EstateAgentSales(propertySales[i]);
            totals[temp] = total;
            temp++;
            
            System.out.printf(Locale.US, "%-1s %-1s R %,1.0f%n", "Total property sales for ", estateAgents[i] + " = ", total);
        }
        System.out.println();
        //*************************************************//
        
        //*************************************************//
        temp = 0;
        //calcualte the total commission per agent
        for (int i = 0; i < estateAgents.length; i++)
        {
            double commission = agents.EstateAgentCommission(totals[temp]);
            temp++;
            System.out.printf(Locale.US, "%-1s %-1s R %,1.0f%n", "Sales Commission for ", estateAgents[i] + " = ", commission);
        }
        System.out.println();
        //*************************************************//
        
        //*************************************************//
        //print top employee
        int topEmployee = agents.TopEstateAgent(totals);
        
        System.out.println("Top performing estate agent: " + estateAgents[topEmployee]);
        //*************************************************//
    }
    //*************************************************//
    
}
//***********************************END OF FILE****************************************//