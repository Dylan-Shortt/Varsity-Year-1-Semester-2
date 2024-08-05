/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
//*************************************************//
public class Item extends Grocery_Store_Inventory_Management{

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    //*************************************************//
    //variables
    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    private String name = "";
    private Category category;
    private double price = 0;
    //*************************************************//
    
    //*************************************************//
    //defualt
    public Item()
    {
        
    }
    //*************************************************//
    
    //*************************************************//
    //constructor
    public Item(String n, Category c, double p)
    {
        name = n;
        category = c;
        price = p;
    }
    //*************************************************//
    
    //*************************************************//
    //display stuff
    public void display(ArrayList<Item> item)
    {
        //*************************************************//
        //display title 
        System.out.println("ALL items in inventory:\n");
        //*************************************************//
        
        //*************************************************//
        int count = 0;
        //*************************************************//
        
        //*************************************************//
        //print all items in the ArrayList
        while(count < item.size())
        {
            //*************************************************//
            //print values
            String line = "";
            line = "" + item.get(count).getName();
            line += " (" + item.get(count).getCategory() + ")";
            line += " - $" + item.get(count).getPrice();
            //*************************************************//
            
            //*************************************************//
            //print item
            System.out.println(line);
            //*************************************************//
            
            //*************************************************//
            //update size
            count++;
            //*************************************************//
        }
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    //add stuff
    public ArrayList<Item> addItem(ArrayList<Item> itemArray)
    {
        //*************************************************//
        //get input
        BufferedReader BufferedReader = new BufferedReader(new InputStreamReader(System.in));
       //*************************************************//
        
        
        try {
            //*************************************************//
            //get values from user
            System.out.print("Enter item name: ");
            name = BufferedReader.readLine();
            //*************************************************//
            
            //*************************************************//
            //get category
            System.out.print("Enter category (FRUITS, VEGETABLES, DAIRY, BAKERY, MEAT): ");
            category = Category.valueOf(BufferedReader.readLine());
            //*************************************************//
            
            //*************************************************//
            //get values from user
            System.out.print("Enter price: ");
            price = Double.parseDouble(BufferedReader.readLine());
            //*************************************************//
            
            //*************************************************//
            Item object = new Item(name, category, price);
            itemArray.add(object);
            //*************************************************//
            
        } catch (IOException ex) {
            Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return itemArray;
    }
    //*************************************************//
    
    //*************************************************//
    //remove stuff
    public void remove(ArrayList<Item> item)
    {
        try {
            //*************************************************//
            //declare variables
            String input;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            //*************************************************//
            
            //*************************************************//
            //get user input
            System.out.print("Enter Item name to remove: ");
            input = bufferedReader.readLine();
            //*************************************************//
            
            
            //*************************************************//
        int count = 0;
        //*************************************************//
        
        //*************************************************//
        //print all items in the ArrayList
        while(count < item.size())
        {
            //*************************************************//
            //check if_ name matches
            if(item.get(count).getName().equalsIgnoreCase(input))
            {
                item.remove(count);
            }
            //*************************************************//
            
            //*************************************************//
            //update size
            count++;
            //*************************************************//
        }
        //*************************************************//
        } catch (IOException ex) {
            Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Item removed successfully!");
    }
    //*************************************************//
    
    //*************************************************//
//display stuff
public void displayCategory(ArrayList<Item> item) {
    try {
        //*************************************************//
        int count = 0;
        //*************************************************//
        
        //*************************************************//
        //declare variables
        String input;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //*************************************************//
        
        //*************************************************//
        //get user input
        System.out.print("Enter category to display: ");
        input = bufferedReader.readLine();
        
        // Convert input to uppercase to match enum names, assuming enum names are in uppercase
        Category category;
        try {
            category = Category.valueOf(input.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid category entered.");
            return; // Exit the method if the category is invalid
        }
        //*************************************************//
        
        //*************************************************//
        //print all items in the ArrayList
        System.out.println("Items in category " + input + ":");
        while (count < item.size()) {
            if (item.get(count).getCategory().equals(category)) {
                
                //*************************************************//
                //print values
                String line = item.get(count).getName();
                line += " (" + item.get(count).getCategory() + ")";
                line += " - $" + item.get(count).getPrice();
                //*************************************************//
                
                //*************************************************//
                //print item
                System.out.println(line);
                //*************************************************//
            }
            // Update the count after each iteration
            count++;
        }
        //*************************************************//
    } catch (IOException ex) {
        Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
    }
}
//*************************************************//

    
//*************************************************//
}
//***********************************END OF FILE****************************************//