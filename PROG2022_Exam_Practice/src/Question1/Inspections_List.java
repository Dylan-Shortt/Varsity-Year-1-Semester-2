/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class Inspections_List {
    
    //*************************************************//
    //private var'
    private String name;
    private String location;
    private String years;
    //*************************************************//

    //*************************************************//
    //constructor 
    public Inspections_List(String name, String location, String years) {
        this.name = name;
        this.location = location;
        this.years = years;
    }
    //*************************************************//

    //*************************************************//
    //default constructor
    public Inspections_List() {
    }
    //*************************************************//
    
    //*************************************************//
    // output statement 
    public String toString()
    {
        String output = "";
        output += ("Hospital Name: " + getName()) + "\n";
        output += ("Hospital Location: " + getLocation()) + "\n";
        output += ("Year Since INspection: " + getYears()) + "\n";
        output += ("*************************************************");
        
        return output;
    }
    //*************************************************//

    //*************************************************//
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getYears() {
        return years;
    }
    //*************************************************//
}
//***********************************END OF FILE****************************************//