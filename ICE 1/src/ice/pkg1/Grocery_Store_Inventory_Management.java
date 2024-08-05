/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//*************************************************//
package ice.pkg1;
//*************************************************//

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author dylan
 */
//**************************************************************************************//
public class Grocery_Store_Inventory_Management {
    /**
     * @param args the command line arguments
     */
    
    //*************************************************//
    //Emnum Category
    enum Category {
        FRUITS, 
        VEGETABLES, 
        DAIRY, 
        BAKERY, 
        MEAT
    }
    //*************************************************//
    
    //*************************************************//
    public static void main(String[] args) {
        // TODO code application logic here
        
        //*************************************************//
        //Initialize Item
        String input = "";
        Item[] items = new Item[5];
        Item inventory = new Item();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //*************************************************//
        
        //*************************************************//
        //create Item array
        items[0] = new Item("Apple", Category.FRUITS, 0.5);
        items[1] = new Item("carrot", Category.VEGETABLES, 0.3);
        items[2] = new Item("Bread", Category.BAKERY, 1.2);
        items[3] = new Item("Chicken", Category.MEAT, 1.5);
        items[4] = new Item("Milk", Category.DAIRY, 5.0);
        //*************************************************//
        
        //*************************************************//
        //turn array into array list_
        ArrayList<Item> arrayList = new ArrayList<Item>();
        int count = 0;
        for (Item item : items)
        {
            arrayList.add(items[count]);
            count++;
        }
        //*************************************************//
        
//**************************************************************************************//
//**************************************************************************************//
    
        //*************************************************//
        //print title
        System.out.println("Grocery_Store_Inventory_Management");
        //*************************************************//
        
    try {
        while(!input.equals("5"))
        {
            //*************************************************//
            //print menu
            printMenu();
            //*************************************************//
        
            //*************************************************//
            //get user input
            input = bufferedReader.readLine();
            System.out.println();
            //*************************************************//
            
            //*************************************************//
            //chose the following action
            if(input.equals("1"))
            {
                inventory.display(arrayList);
                 System.out.println();
            }
            //*************************************************//
            
            //*************************************************//
            //chose the following action
            if(input.equals("2"))
            {
                arrayList = inventory.addItem(arrayList);
                 System.out.println();
            }
            //*************************************************//
            
            //*************************************************//
            //chose the following action
            if(input.equals("3"))
            {
                inventory.remove(arrayList);
                 System.out.println();
            }
            //*************************************************//
            
            //*************************************************//
            //chose the following action
            if(input.equals("4"))
            {
                inventory.displayCategory(arrayList);
                 System.out.println();
            }
            //*************************************************//
            
            //*************************************************//
            //chose the following action
            if(input.equals("5"))
            {
                System.out.println("Exiting...");
                System.exit(0);
            }
            //*************************************************//
        }
            
    } catch (IOException ex) {
        Logger.getLogger(Grocery_Store_Inventory_Management.class.getName()).log(Level.SEVERE, null, ex);
    }

    }
    //*************************************************//
    
    //*************************************************//
    //create menu
    public static void printMenu()
    {
        String menu = "";
        menu += "1. Display all items\n"
                + "2. Add a new item\n"
                + "3. Remove an item\n"
                + "4. Display items by category\n"
                + "5. Exit\n"
                + "Choose an option: ";
        System.out.print(menu);
    }
    //*************************************************//
    
    
//**************************************************************************************//
}
//***********************************END OF FILE****************************************//