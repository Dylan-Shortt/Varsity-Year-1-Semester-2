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
public class accidentReport {
    
    //*************************************************//
    //accident array
    private int[][] roadAccidents;
    //city's
    private String[] locations;
    //type
    private String[] type = {"CAR", "MOTOR BIKE"};
    //*************************************************//

    //*************************************************//
    //constructor
    public accidentReport(int[][] roadAccidents, String[] locations) {
        this.roadAccidents = roadAccidents;
        this.locations = locations;
    }
    //*************************************************//
    
    //*************************************************//
    //print accident report
    public void printReport()
    {
        //*************************************************//
        // Print header
        System.out.printf("%-20s %-20s %-20s%n", "",type[0], type[1]);
        //*************************************************//
        
        //*************************************************//
        // Print rows with formatted columns
        for (int i = 0; i < roadAccidents.length; i++) 
        {
            System.out.printf("%-20s %-20d %-20d%n", locations[i], roadAccidents[i][0], roadAccidents[i][1]);
        }
        //*************************************************//
    }
    //*************************************************//
    
}
//***********************************END OF FILE****************************************//

//*************************************************//
//StudentNumber = ST10438409
//Module = PROG 6112
//Task type = Test
//*************************************************//