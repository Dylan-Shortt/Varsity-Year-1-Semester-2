/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employees_super_example;

/**
 *
 * @author dylan
 */
public class Developer extends Employees_Super_Example{
    
    //*************************************************//
    //var's
    private String programmingLanguage;
    //*************************************************//

    //*************************************************//
    //constructor
    public Developer(String programmingLanguage, String name, int id, double salary) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    //*************************************************//

    //*************************************************//
    //tostring
    @Override
    public String toString() {
        return super.toString() + " Developer{" + "programmingLanguage=" + programmingLanguage + '}';
    }
    //*************************************************//
    
    
}
