/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//**************************************************************************************//
package question_1;
//*************************************************//

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dylan
 */
//*************************************************//
public class ST10438409_PROG6112_Test {
    //*************************************************//
    /**
     * @param args the command line arguments
     */
    //*************************************************//
    
    //*************************************************//
    //global var's
    
    //cars and motor bikes          //defau1t
    static int[][] roadAccidents = {{0,0}, {0,0}, {0,0}};
    
    //city's
    static String[] locations = {"Cape Town", "Johannesburg", "Port Elizabeth"};
    //*************************************************//
    
    //*************************************************//
    public static void main(String[] args) {
        // TODO code application logic here
        
        //*************************************************//
        //create main instance to access the global var's in this class
        ST10438409_PROG6112_Test mainInstance = new ST10438409_PROG6112_Test();
        accidentReport report = new accidentReport(roadAccidents, locations);
        accidentTotals total = new accidentTotals(roadAccidents, locations);
        //*************************************************//
        
        //*************************************************//
        //get user input
        getUserInput();
        //*************************************************//
        
        //*************************************************//
        //print title 
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("ROAD ACCIDENT REPORT");
        System.out.println("-----------------------------------------------------------------------------------------");
        //*************************************************//
        
        //*************************************************//
        //display the report
        report.printReport();
        //*************************************************//
        
        //*************************************************//
        //print title 
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("ROAD ACCIDENT TOTALS FOR EACH CITY");
        System.out.println("-----------------------------------------------------------------------------------------");
        //*************************************************//
        
        //*************************************************//
        //print the totals for each city
        total.calculateTotal();
        System.out.println("-----------------------------------------------------------------------------------------");
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    //get user input to full the array
    private static void getUserInput() 
    {
        //*************************************************//
        //create buffered reader to get input 
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //*************************************************//
        
        //*************************************************//
        //for loop to enter values into the array
        for (int i = 0; i < locations.length; i++)
        {
            //*************************************************//
            try {
                System.out.print("Enter the number of car accidents for " + locations[i] + ": ");
                roadAccidents[i][0] = Integer.parseInt(bufferedReader.readLine());
                
                System.out.print("Enter the number of motor bike accidents for " + locations[i] + ": ");
                roadAccidents[i][1] = Integer.parseInt(bufferedReader.readLine());
            }
            //*************************************************//
            catch (IOException ex) {
                Logger.getLogger(ST10438409_PROG6112_Test.class.getName()).log(Level.SEVERE, null, ex);
            }
            //*************************************************//
            
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