/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//**************************************************************************************//
package question_1;
//*************************************************//
/**
 *
 * @author dylan
 */
//*************************************************//
public class accidentTotals {
    //*************************************************//
    //accident array
    private int[][] roadAccidents;
    //city's
    private String[] locations;
    //location with highest crash total
    private String highestAccident = "";
    private int highestAccidentCount = 0;
    //*************************************************//

    //*************************************************//
    //constructor
    public accidentTotals(int[][] roadAccidents, String[] locations) {
        this.roadAccidents = roadAccidents;
        this.locations = locations;
    }
    //*************************************************//
    
    //********************************************************************//
    //Total calculation
    public void calculateTotal()
    {
        //default value
        int total = 0;
        
        //*************************************************//
        //run through the rows and columns of the array
        for (int i = 0; i < roadAccidents.length; i++)
        {
            //set total to zero
            total = 0;
            
            //*************************************************//
            //update  total
            total += roadAccidents[i][0] + roadAccidents[i][1];
            System.out.printf("%-20s %-20d%n", locations[i], total);
            //*************************************************//
            
            //*************************************************//
            //find highest total
            if(total > highestAccidentCount)
            {
                highestAccidentCount = total;
                highestAccident = locations[i];
            }
            //*************************************************//
        }
        //*************************************************//
        
        //*************************************************//
        //print highest accident location
        System.out.println("CITY WITH THE MOST VEHICLE ACIDENTS: " + highestAccident);
        //*************************************************//
    
    }
    //********************************************************************//
   
    
}
//***********************************END OF FILE****************************************//

//*************************************************//
//StudentNumber = ST10438409
//Module = PROG 6112
//Task type = Test
//*************************************************//