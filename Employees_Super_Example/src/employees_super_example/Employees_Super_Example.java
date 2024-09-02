/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//**************************************************************************************//
package employees_super_example;
//*************************************************//
/**
 *
 * @author dylan
 */
//*************************************************//
public class Employees_Super_Example {
//*************************************************//
    
    
    //*************************************************//
    //var's
    private String name;
    private int id;
    private double salary;
    //*************************************************//

    
    //*************************************************//
    //constructor
    public Employees_Super_Example(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    //*************************************************//
    
    //*************************************************//
    //display details
     public String toString() 
    {
        return "Employees_Super_Example{" + "name=" + name + ", id=" + id + ", salary=" + salary + '}';
    }
    //*************************************************//

    //*************************************************//
    public double getSalary() {
        return salary;
    }
    //*************************************************//
}
//***********************************END OF FILE****************************************//