/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//**************************************************************************************//
package Question_1;
//*************************************************//

import java.util.Arrays;
import java.util.Locale;

/**
 *
 * @author dylan
 */
//*************************************************//
public class Repairs implements IRepairs{
    
    //*************************************************//
    //static arrays 
    private double[][] Costs;
    private String[] title;
    private String[] technicians;
    private double[] commissions = new double[2];
    //*************************************************//

    //*************************************************//
    //constructor 
    public Repairs(double[][] Costs, String[] title, String[] technicians) {
        this.Costs = Costs;
        this.title = title;
        this.technicians = technicians;
    }
    //*************************************************//
    
    //*************************************************//
    //print report method
    public void printReport()
    {
        //*************************************************//
        //print title of report
        System.out.println("TECHNICIAN VEHICLE REPAIR REPORT\n");
        //*************************************************//
        
        //*************************************************//
        //print month titles and underline
        System.out.printf("%-15s %-17s %-17s %-15s%n", "", title[0], title[1], title[2]);
        System.out.println("--------------------------------------------------------");
        //*************************************************//
        
        //*************************************************//
        //print a lign in the report for every technician
        for (int i = 0; i < technicians.length; i++)
        {
            System.out.printf("%-15s R %-15s R %-15s R %-15s%n", technicians[i], Costs[i][0], Costs[i][1], Costs[i][2]);
        }
        //*************************************************//
        
        //*************************************************//
        //final new line of report
        System.out.println();
        //*************************************************//
        
        //*************************************************//
        //print total per technician 
        for (int i = 0; i < technicians.length; i++)
        {
             double[] row = Arrays.copyOfRange(Costs[i], 0, 3);
            System.out.printf(Locale.US, "%-15s %-10s R %,1.1f%n", "Total vehicle repair for ", technicians[i] + " = ", RepairCosts(row));
        }
        System.out.println();
        //*************************************************//
        
        //*************************************************//
        //print the commission
        for (int i = 0; i < technicians.length; i++)
        {
             double[] row = Arrays.copyOfRange(Costs[i], 0, 3);
             double commission = TechnicianPay(RepairCosts(row));
            System.out.printf(Locale.US, "%-15s %-10s R %,1.1f%n", "Repair Commission for ", technicians[i] + " = ", commission);
            
            commissions[i] = commission;
        }
        System.out.println();
        //*************************************************//
        
        //*************************************************//
        //return top technician
        System.out.println("Top performing vehicke repair technician: " + technicians[TopTechnician(commissions)]);
        //*************************************************//
    }
    //*************************************************//

    //*************************************************//
    @Override
    public double RepairCosts(double[] repairCosts) 
    {
        //*************************************************//
        //declare
        double repairCost = 0;
        //*************************************************//
        
        for (int i = 0; i < repairCosts.length; i++)
        {
            repairCost += repairCosts[i];
        }
        
        //*************************************************//
        //return value
        return repairCost;
        //*************************************************//
    }
    //*************************************************//

    //*************************************************//
    @Override
    public double TechnicianPay(double amount) {
        
        //*************************************************//
        //return pay
        return amount*0.10;
        //*************************************************//
    }
    //*************************************************//

    //*************************************************//
    @Override
    public int TopTechnician(double[] repairs) {
        //*************************************************//
        //set the first value as the highest
        int maxIndex = 0; 
        double maxValue = repairs[0]; 
        //*************************************************//
        
        //*************************************************//
        // Loop through the array to find the highest value
        for (int i = 1; i < repairs.length; i++) 
        {
            //*************************************************//
            if (repairs[i] > maxValue) 
            {
                maxValue = repairs[i];
                maxIndex = i;
            }
            //*************************************************//
        }
        //*************************************************//
        
        //*************************************************//
        // Return the index of the highest value
        return maxIndex; 
        //*************************************************//
    }
    //*************************************************//
}
//***********************************END OF FILE****************************************//