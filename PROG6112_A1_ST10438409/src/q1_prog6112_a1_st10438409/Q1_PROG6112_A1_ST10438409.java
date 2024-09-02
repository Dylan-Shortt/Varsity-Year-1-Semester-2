/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//*************************************************//
//package name
package q1_prog6112_a1_st10438409;
//*************************************************//

//*************************************************//
//imports
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//*************************************************//


/**
 *
 * @author dylan
 */
//*************************************************//
//class named PROG6112_A1_ST10438409
public class Q1_PROG6112_A1_ST10438409 {

    /**
     * @param args the command line arguments
     */
    //*************************************************//
    public static void main(String[] args) {
        // TODO code application logic here
        
        //*************************************************//
        //Student object to run class methods
        Student studentMethods = new Student();
        //*************************************************//
         
        //*************************************************//
        //main class code for the program
        try {
            //*************************************************//
            //declarations 
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String inputedValue = "";
            boolean testInput = true;
            //*************************************************//
        
            //*************************************************//
            //print main menue on start up
            Student.startScreen();
            //*************************************************//
            
            //*************************************************//
            //continue or exit
            Student.askToContinue();
            //*************************************************//
            
            //*************************************************//
            //print menu to user
            Student.mainMenu();
            int loopValue = Student.getValidNumberFromUser();
            //*************************************************//
            
            //*************************************************//
            //loop to ask the menu and do instructions again
            while(true)
            {
                //*************************************************//
                //switch to select the different options from the manager input
               switch (loopValue) {
            //*************************************************//
            case 1:
                //*************************************************//
                //Delcare local values for the ArrayList
                String ID;
                String name;
                int age;
                String email;
                String course;
                //*************************************************//
                
                //*************************************************//
                //print title
                System.out.println();
                System.out.println("CAPTURE A NEW STUDENT");
                System.out.println("****************************");
                //*************************************************//
                
                //*************************************************//
                //get user ID
                System.out.print("Enter the student id: ");
                ID = bufferedReader.readLine();
                //*************************************************//
                
                //*************************************************//
                //get user name
                System.out.print("Enter the student name: ");
                name = bufferedReader.readLine();
                //*************************************************//
                
                //*************************************************//
                //get user age
                age = Student.getStudentAge();
                //*************************************************//
                
                //*************************************************//
                //get user email
                System.out.print("Enter the student email: ");
                email = bufferedReader.readLine();
                //*************************************************//
                
                //*************************************************//
                //get user course
                System.out.print("Enter the student course: ");
                course = bufferedReader.readLine();
                //*************************************************//
                
                //*************************************************//
                //crate new student
                Student student = new Student(ID, name, age, email, course);
                //*************************************************//
                
                //*************************************************//
                //add to array
                System.out.println( Student.SaveStudent(student));
                //*************************************************//
                
                
                
                //*************************************************//
                    //*************************************************//
                        //continue or exit
                        Student.askToContinue();
                    //*************************************************//
                //*************************************************//
                
                break;
            //*************************************************//
            //*************************************************//
            case 2:
                //*************************************************//
                //title
                System.out.print("\nEnter the student id to search: ");
                String searchString = bufferedReader.readLine();
                //*************************************************//
                
                //*************************************************//
                //print title line
                System.out.println("-----------------------------------------");
                //*************************************************//
                
                //*************************************************//
                //Search for student and print result
                String result = Student.SearchStudent(searchString);
                System.out.println(result);
                //*************************************************//
                        
                //*************************************************//
                //print title line
                System.out.println("-----------------------------------------");
                //*************************************************//
                
                //*************************************************//
                    //continue or exit
                    Student.askToContinue();
                //*************************************************//
                
                break;
            //*************************************************//
            //*************************************************//
            case 3:
                //*************************************************//
                //get student ID
                System.out.print("\nEnter the student ID to be deleted: ");
                String deleteID = bufferedReader.readLine();
                //*************************************************//
                
                //*************************************************//
                //confirm if_ user wants to delete student
                System.out.println("Are you sure you want to delete student " + deleteID
                + " from the system? Yes (y) to delete.");
                if(bufferedReader.readLine().equalsIgnoreCase("y"))
                {
                //*************************************************//
                //print title line
                System.out.println("-----------------------------------------");
                //*************************************************//
  
                //*************************************************//
                //delete student
                String output = Student.DeleteStudent(deleteID);
                System.out.println(output);
                //*************************************************//
                
                //*************************************************//
                //print title line
                System.out.println("-----------------------------------------");
                //*************************************************//
                }
                //*************************************************//
                
                //*************************************************//
                    //continue or exit
                    Student.askToContinue();
                //*************************************************//
                break;
            //*************************************************//
            //*************************************************//
            case 4:
                studentMethods.StudentReport();
                studentMethods.askToContinue();
                break;
            //*************************************************//
            //*************************************************//
            case 5:
                studentMethods.ExitStudentApplication();
                break;
            //*************************************************//
               }
               //*************************************************//
                
                
            //*************************************************//
                //print menu to user
                Student.mainMenu();
                loopValue = Student.getValidNumberFromUser();
            //*************************************************//
            }
            //*************************************************//
        
        } 
        //*************************************************//
        //catch an error from the Buffered reader
        catch (IOException ex) {
            Logger.getLogger(Q1_PROG6112_A1_ST10438409.class.getName()).log(Level.SEVERE, null, ex);
        }
        //*************************************************//
        
        
    }
    //*************************************************//
    
}
//*************************************************//

//***********************************END OF FILE****************************************//