/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//*************************************************//
package jframe_example_registration_form;
//*************************************************//

//*************************************************//
import java.util.ArrayList;
//*************************************************//

/**
 *
 * @author dylan
 */
public class Main {
    
    //*************************************************//
    //array list
    static ArrayList<Registered> arrayList = new ArrayList<Registered>();
    //*************************************************//
    
    public static void main(String[] args) {
        
        //*************************************************//
        Registration_Form form = new Registration_Form();
        form.setVisible(true);
        //*************************************************//
        
        //*************************************************//
        Registered regis = new Registered();
        //*************************************************//
        
    }
    //*************************************************//
    public static void addRegistered(Registered regis)
    {
        arrayList.add(regis);
        
        System.out.println(arrayList.get(0));
    }
    //*************************************************//
    
}
//***********************************END OF FILE****************************************//