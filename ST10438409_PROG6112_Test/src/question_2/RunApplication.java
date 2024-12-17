/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//**************************************************************************************//
package question_2;
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
public class RunApplication {
    
    //*************************************************//
        //global var's
        static String type = "";
        static String city = "";
        static int total = 0;
        //*************************************************//
    
    //*************************************************//
    //main method
    public static void main(String[] args) {
        
        //*************************************************//
        //get user input
        userInput();
        //*************************************************//
        
        //*************************************************//
        //create roadAccidentReport instance
        RoadAccidentReport report = new RoadAccidentReport(type, city, total);
        //*************************************************//
        
        //*************************************************//
        //print report
        report.printAccidentReport();
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    //get user input
    public static void userInput()
    {
        //*************************************************//
            try {
                //*************************************************//
                //create buffered reader to get user input
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                //*************************************************//
                
                //*************************************************//
                //get user input and update var's
                System.out.print("Enter the accident vehicle type: ");
                type = bufferedReader.readLine();
                
                System.out.print("Enter the city for the vehicle accidents: ");
                city = bufferedReader.readLine();
                
                System.out.print("Enter the total Car accidents for " + city + ": ");
                total = Integer.parseInt(bufferedReader.readLine());
                //*************************************************//
                
            } catch (IOException ex) {
                Logger.getLogger(RunApplication.class.getName()).log(Level.SEVERE, null, ex);
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