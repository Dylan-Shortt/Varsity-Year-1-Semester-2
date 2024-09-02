/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employees_super_example;

/**
 *
 * @author dylan
 */
public class Manager extends Employees_Super_Example{

    
    
    //*************************************************//
    //var's
    private String department;
    //*************************************************//
    
    //*************************************************//
    //super
    public Manager(String name, int id, double salary, String dep) 
    {
        super(name, id, salary);
        department = dep;
    }
    //*************************************************//
    
    //*************************************************//
    //toString
    @Override
    public String toString() {
        return super.toString() + " Manager{" + "department=" + department + '}';
    }
    //*************************************************//
}
