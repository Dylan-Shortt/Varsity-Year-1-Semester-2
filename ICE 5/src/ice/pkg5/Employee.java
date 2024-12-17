/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//**************************************************************************************//
package ice.pkg5;
//*************************************************//

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author dylan
 */
//*************************************************//
public class Employee {
    
    //*************************************************//
    //declare id, name, and salary
    private String id;
    private String name;
    private String salary;
    static final String filePath = "Employee.txt";
    //*************************************************//

    //*************************************************//
    //constructor
    public Employee(String id, String name, String salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    //*************************************************//

    //*************************************************//
    //defualt constructor
    public Employee() {
    }
    //*************************************************//

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSalary() {
        return salary;
    }
        
    //*************************************************//
    //read from file 
    public static String readFromFile(int position) throws FileNotFoundException, IOException
    {
        //*************************************************//
        //declare random access file in read mode
        RandomAccessFile file = new RandomAccessFile(filePath, "r");
        //*************************************************//
        
        //*************************************************//
        //seek the position in the file to read from
        int recordLength = 61;
        position = (position - 1) * recordLength;
        file.seek(position);
        //*************************************************//
        
        //*************************************************//
        //read and close the file
        String line = file.readLine();
        file.close();
        //*************************************************//
        
        //*************************************************//
        //return bytes
        return line;
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    //wrtie text to the file
    public static void writeToFile(Employee emp) throws FileNotFoundException, IOException
    {
        //*************************************************//
        //declare random access file in read mode and write mode
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");
        //*************************************************//
        
        //*************************************************//
        //find end of file
        file.seek(file.length());
        //*************************************************//
        
        //*************************************************//
        // Make data to write, ensuring that the ID and name are padded to 20 characters
        String data = padString(emp.getId()) + padString(emp.getName()) + padString(String.valueOf(emp.getSalary())) + "\n";
        //*************************************************//
        
        //*************************************************//
        //write and close the file
        file.write(data.getBytes());
        file.close();
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    //wrtie text to the file
    public static void updateFile(Employee emp) throws FileNotFoundException, IOException 
    {
        //*************************************************//
        // Open the file in read and write mode
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");
        //*************************************************//

        //*************************************************//
        // Calculate the position in the file to update
        int recordLength = 61;
        int position = (Integer.parseInt(emp.getId()) - 1) * recordLength;
        file.seek(position);
        //*************************************************//

        //*************************************************//
        // Read the existing line from the file
        String line = file.readLine();
        if (line == null) 
        {
            //*************************************************//
            throw new IOException("Failed to read the line at position " + position);
            //*************************************************//
        }
        //*************************************************//

        //*************************************************//
        // Extract ID and Name from the existing line
        String existingId = line.substring(0, 20).trim(); // ID is padded to 20 characters
        String existingName = line.substring(20, 40).trim(); // Name is padded to 20 characters
        //*************************************************//

        //*************************************************//
        // Create the new data to write
        String newData = padString(existingId) + padString(existingName) + padString(emp.getSalary()) + "\n";
        //*************************************************//

        //*************************************************//
        // Write the updated data to the file
        file.seek(position);
        file.write(newData.getBytes());
        //*************************************************//

        //*************************************************//
        // Close the file
        file.close();
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    //make each value 20 cahracters long
    public static String padString(String input) 
    {
        //*************************************************//
        // If the input is longer than the desired length, truncate it
        if (input.length() > 20) 
        {   
            //*************************************************//
            //shorten string to 20 characters
            return input.substring(0, 20);
            //*************************************************//
        }
        
        //*************************************************//
        // Otherwise, pad the input with spaces until it reaches the desired length
        return String.format("%-" + 20 + "s", input);
        //*************************************************//
    }
    //*************************************************//
}
//***********************************END OF FILE****************************************//