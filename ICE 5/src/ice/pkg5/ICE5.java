/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//**************************************************************************************//
package ice.pkg5;
//*************************************************//

import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;



/**
 *
 * @author dylan
 */
//*************************************************//
public class ICE5 {

    //*************************************************//
    /**
     * @param args the command line arguments
     */
    //*************************************************//
    
    //*************************************************//
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        //*************************************************//
        //ask menu
        while(true)
        {
            //*************************************************//
            //ask user
            int option = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number responding to your choice:\n1. Add Employee\n2. Find Employee\n3. Update Employee\n4. Exit"));
            //*************************************************//
            
            //*************************************************//
            // Switch statement
        switch (option) 
        {
            case 1:
                // Code for choice 1
                addEmployee();
            break;
            //*************************************************//
            
            case 2:
                // Code for choice 2
                int ID = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter User ID: "));
                readEmployee(ID);
            break;
            //*************************************************//
            
            case 3:
                // Code for choice 3
                updateEmployee();
            break;
            //*************************************************//
            
            case 4:
                // Code for choice 4
                System.exit(0);
            break;
            //*************************************************//
            
            default:
            // Code for invalid choices
                JOptionPane.showMessageDialog(null, "Invalid number, please try again");
            break;
        }
        //*************************************************//
        }
        //*************************************************//
        
    }
    //*************************************************//
    
    //*************************************************//
    //read line from file
    public static void readEmployee(int num) throws IOException
    {
        //*************************************************//
        //create employee instance
        Employee employee = new Employee();
        //*************************************************//
        
        //*************************************************//
        //get line from file
        String line = (employee.readFromFile(num));
        //*************************************************//
        
        //*************************************************//
        //scan line to get values
        Scanner scan = new Scanner (line);
        //*************************************************//
        
        //*************************************************//
        //create message to display employee
        String message 
                 = "ID:         " + scan.next() + "\n";
        message += "Name:  " + scan.next() + "\n";
        message += "Salary: " + scan.next();
        //*************************************************//
        
        //*************************************************//
        //display employee
        JOptionPane.showMessageDialog(null, message);
        //*************************************************//
        
        //*************************************************//
        //close scanner
        scan.close();
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    //input employee details
    public static void addEmployee() throws IOException
    {
        //*************************************************//
        //add ID
        String ID = JOptionPane.showInputDialog(null, "Enter ID of Employee: ");
        //*************************************************//
        
        //*************************************************//
        //add name
        String name = JOptionPane.showInputDialog(null, "Enter name of Employee: ");
        //*************************************************//
        
        //*************************************************//
        //add salary
        String salary = (JOptionPane.showInputDialog(null, "Enter salary of Employee: "));
        //*************************************************//
    
        //*************************************************//
        //create an employee object
        Employee employee = new Employee(ID, name, salary);
        employee.writeToFile(employee);
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    //input employee details
    public static void updateEmployee() throws IOException
    {
        //*************************************************//
        //add ID
        String ID = JOptionPane.showInputDialog(null, "Enter ID of Employee whom's salary you wish to update: ");
        //*************************************************//
        
        //*************************************************//
        //add salary
        String salary = (JOptionPane.showInputDialog(null, "Enter the new salary of Employee: "));
        //*************************************************//
    
        //*************************************************//
        //create an employee object
        Employee employee = new Employee(ID, "", salary);
        employee.updateFile(employee);
        //*************************************************//
    }
    //*************************************************//
}
//***********************************END OF FILE****************************************//