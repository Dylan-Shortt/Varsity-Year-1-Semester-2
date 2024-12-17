/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//**************************************************************************************//
package Question1;
//*************************************************//

import java.util.ArrayList;

/**
 *
 * @author dylan
 */
//*************************************************//

public class PROG2022_Exam_Practice {
    //*************************************************//
    /**
     * @param args the command line arguments
     */
    //*************************************************//
    
    //*************************************************//
    //public array
    public static ArrayList<Inspections_List> array = new ArrayList<Inspections_List>();
    //*************************************************//
    
    //*************************************************//
    public static void main(String[] args) {
        // TODO code application logic here
        
        //*************************************************//
        //create instance of class the main class
        PROG2022_Exam_Practice mainInstance = new PROG2022_Exam_Practice();
        //list class
        Inspections_List list_of_inspections = new Inspections_List();
        //*************************************************//
        
        //*************************************************//
        //create GUI window
        Hospital_Inspections inspections = new Hospital_Inspections();
        //show GUI
        inspections.setVisible(true);
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    //update array list
    public void update_Inspections_List(Inspections_List item)
    {
        array.add(item);
    }
    //*************************************************//
    
    //*************************************************//
    //output array list values
    public String outputPrintMessage()
    {
        //*************************************************//
        //outupt string
        String output = "";
        //*************************************************//
        
        //*************************************************//
        //run through all slots
        for (int i = 0; i < array.size(); i++)
        {
            
            //*************************************************//
            //create string
            output += ("Hospital Name: " + array.get(i).getName()) + "\n";
            output += ("Hospital Location: " + array.get(i).getLocation()) + "\n";
            output += ("Year Since Inspection: " + array.get(i).getYears()) + "\n";
            output +=  ("*************************************************") + "\n";
            //*************************************************//
            
            
        }
        //*************************************************//
        
        //*************************************************//
        //end line 
        output += ("*************************************************");
        //return
        return output;
        //*************************************************//
    }
    //*************************************************//
    
}
//***********************************END OF FILE****************************************//