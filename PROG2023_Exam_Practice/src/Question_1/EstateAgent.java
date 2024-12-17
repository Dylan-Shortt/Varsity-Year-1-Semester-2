/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//**************************************************************************************//
package Question_1;
//*************************************************//
/**
 *
 * @author dylan
 */
//*************************************************//
public class EstateAgent implements IEstateAgent{

    //*************************************************//
    // arrays that store the programs values
    private String[] headings;
    
    private String[] estateAgents;
    
    private double[][] propertySales;
    //*************************************************//

    //*************************************************//
    //constructor 
    public EstateAgent(String[] headings, String[] estateAgents, double[][] propertySales) {
        this.headings = headings;
        this.estateAgents = estateAgents;
        this.propertySales = propertySales;
    }
    //*************************************************//
    
    //*************************************************//
    //print the basic report on the estate agents
    public void printBasicReport()
    {
        //*************************************************//
        //print report title
        System.out.println("ESTATE AGENTS SALES REPORT\n");
        //*************************************************// 
                
        //*************************************************//
        //print title
        System.out.printf("%-20s %-22s %-22s %-20s%n", "", headings[0], headings[1], headings[2]);
        System.out.println("----------------------------------------------------------------------------------------");
        //*************************************************//
        
        //*************************************************//
        // print report
        for (int i = 0; i < propertySales.length; i++)
        {
            System.out.printf("%-20s R %-20s R %-20s R %-20s%n", estateAgents[i], propertySales[i][0], propertySales[i][1], propertySales[i][2]);
        }
        //*************************************************//
        System.out.println();
    }
    //*************************************************//
    
    //*************************************************//
    @Override
    public double EstateAgentSales(double[] propertySales) 
    {
        //*************************************************//
        //declare amount 
        double totalSales = 0;
        //*************************************************//
        
        //*************************************************//
        //calculate total sales
        for (int i = 0; i < propertySales.length; i++)
        {
            totalSales += propertySales[i];
        }
        //*************************************************//
        
        //*************************************************//
        //return total
        return totalSales;
        //*************************************************//
    }
    //*************************************************//

    //*************************************************//
    @Override
    public double EstateAgentCommission(double propertySales) {
        //*************************************************//
        //calculate total commission
        double commission = propertySales * 0.02;
        return commission;
        //*************************************************//
    }
    //*************************************************//

    //*************************************************//
    //return top rated agent
    @Override
    public int TopEstateAgent(double[] totalSales) {
        //*************************************************//
        //temp highest employee
        int topEmployee = 0;
        double highestValue = totalSales[0];
        //*************************************************//
        
        //*************************************************//
        //find highest employee
        for (int i = 0; i < totalSales.length; i++)
        {
            //*************************************************//
            //check if_ the current value is higher than set value
            boolean condition = highestValue < totalSales[i];
            if(condition)
            {
                highestValue = totalSales[i];
                topEmployee = i;
            }
            //*************************************************//
        }
        //*************************************************//
        
        //*************************************************//
        //return index
        return topEmployee;
        //*************************************************//
    }
    //*************************************************//
    
}
//***********************************END OF FILE****************************************//