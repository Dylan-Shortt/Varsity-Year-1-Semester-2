/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//**************************************************************************************//
package Question_2;

/**
 *
 * @author dylan
 */
class salesReport {
    //*************************************************//
    //var's
    private String[] title;
    private String[] brands;
    private int[][] saleAmounts;
    //*************************************************//
    
    //*************************************************//
    //construtor
    public salesReport(String[] title, String[] brands, int[][] saleAmounts) {
        this.title = title;
        this.brands = brands;
        this.saleAmounts = saleAmounts;
    }
    //*************************************************//
    
    //********************************************************************//
    //Total calculation
    private int calculateTotal(int brand)
    {
        //*************************************************//
        //set total to zero
        int total = 0;
        //*************************************************//
        //find the total for that brand
         total = saleAmounts[brand][0] + saleAmounts[brand][1] + saleAmounts[brand][2];
        //*************************************************//
         
        //*************************************************//
        //return total
        return total;
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    //calcualte status 
    private String status (int total)
    {
        //*************************************************//
        //declare string
        String medal = "";
        //*************************************************//
        
        //*************************************************//
        //find medal status
        if(total >= 300)
        {
            medal = "Gold";
        }
        else
        {
            medal = "Silver";
        }
        //*************************************************//
        
       //*************************************************//
       //return status
       return medal;
       //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    //print report
    public void reportOfSales()
    {
        //*************************************************//
        //print title
        System.out.printf("%-10s %-15s %-15s %-15s %-5s %-10s%n", title[0], title[1], title[2], title[3], title[4], title[5]);
        System.out.println("----------------------------------------------------------------------------------------");
        //*************************************************//
        
        //*************************************************//
        // print report
        for (int i = 0; i < saleAmounts.length; i++)
        {
            int total = calculateTotal(i);
            System.out.printf("%-10s %-15s %-15s %-15s %-5s %-10s%n", brands[i], saleAmounts[i][0], saleAmounts[i][1], saleAmounts[i][2], total, status(total));
        }
        //*************************************************//
    }
    //*************************************************//
}
//***********************************END OF FILE****************************************//