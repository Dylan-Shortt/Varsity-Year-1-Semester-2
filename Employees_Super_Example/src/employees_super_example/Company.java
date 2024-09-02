/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//*************************************************//
package employees_super_example;
//*************************************************//
/**
 *
 * @author dylan
 */
//*************************************************//
public class Company {
 //*************************************************//   
    public static void main(String[] args) {
        
        //*************************************************//
        //var's
        String managerName = "David";
        String developerName = "Steve";
        //************************//
        int managerID = 57;
        int developerID = 93;
        //************************//
        double managerSalary = 1000.10;
        double developerSalary = 1450.9;
        //************************//
         String department = "Developers";
         String programmingLanguage = "Java";
        //*************************************************//
        
        //*************************************************//
        //instances
        Manager manager = new Manager(managerName, managerID, managerSalary, department);
        Developer developer = new Developer(programmingLanguage, developerName, developerID, developerSalary);
        //*************************************************//
        
        //*************************************************//
        //print results
        System.out.println("Manager:");
        System.out.println(manager.toString() + " ---- " + manager.getSalary());
        System.out.println();
        System.out.println("Developer:");
        System.out.println(developer.toString() + " ---- " + developer.getSalary());
    }
//*************************************************//    
}
//***********************************END OF FILE****************************************//