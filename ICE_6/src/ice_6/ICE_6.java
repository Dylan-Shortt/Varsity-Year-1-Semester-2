/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//*************************************************//
package ice_6;
//*************************************************//

import java.util.ArrayList;


/**
 *
 * @author dylan
 */
//*************************************************//
public class ICE_6 {
    //*************************************************//
    /**
     * @param args the command line arguments
     */
    //*************************************************//
    
    //*************************************************//
    // Global ArrayList for dispatches  
    public static ArrayList<String> dispatchList = new ArrayList<>(); 
    //*************************************************//
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //*************************************************//
        //Home page window
        Home homePage = new Home();
        homePage.setVisible(true);
        //*************************************************//
        
    }
    //*************************************************//
    
    //*************************************************//
    //return array lists
    public ArrayList<String> returnArray()
    {
        return dispatchList;
    }
    //*************************************************//
}
//***********************************END OF FILE****************************************//

//**************************************************************************************//
class Dispatch
{
    //*************************************************//
    // Method to receive and store the dispatch details
    public Dispatch(String item, String name, String quantity, String row) 
    {
        //*************************************************//
        // Store the dispatch information in the ArrayList
        String items = ("Item: " + item) + "\n";
               items += ("Name: " + name) + "\n";
               items += ("Quantity: " + quantity) + "\n";;
               items += ("Row: " + row) + "\n" + "\n";
        //*************************************************//
               
        //*************************************************//
        //add to list
        ICE_6.dispatchList.add(items);
        //*************************************************//
    }
    //*************************************************//
}
//***********************************END OF FILE****************************************//