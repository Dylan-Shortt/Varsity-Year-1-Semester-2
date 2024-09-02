//*************************************************//
package q1_prog6112_a1_st10438409;
//*************************************************//

//*************************************************//
//import list
import java.io.*;
import java.util.ArrayList;
//*************************************************//

/**
 *
 * @author dylan
 */
//*************************************************//
public class Student {
    //*************************************************//
    private String ID = "";
    private String name = "";
    private int age = 0;
    private String email = "";
    private String course = "";
    
    //*************************************************//
    //create the ArrayList of the Student class to hold the objects
    public static ArrayList<Student> studentList = new ArrayList<Student>();
    //*************************************************//
    
    //*************************************************//
    //default constructor 
    public Student ()
    {
        
    }
    //*************************************************//

    //*************************************************//
    // Constructor
    public Student(String ID, String name, int age, String email, String course) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
    }
    //*************************************************//
    
    //*************************************************//
    // Getter methods
    
    //*************************************************//
    public String getID() {
        return ID;
    }
    //*************************************************//

    //*************************************************//
    public String getName() {
        return name;
    }
    //*************************************************//

    //*************************************************//
    public int getAge() {
        return age;
    }
    //*************************************************//
    
    //*************************************************//
    public String getEmail() {
        return email;
    }
    //*************************************************//

    //*************************************************//
    public String getCourse() {
        return course;
    }
    //*************************************************//
    //*************************************************//
    
    //*************************************************//
    // Setter methods
    //*************************************************//
    public void setID(String ID) {
        this.ID = ID;
    }
    //*************************************************//

    //*************************************************//
    public void setName(String name) {
        this.name = name;
    }
    //*************************************************//
    
    //*************************************************//
    public void setAge(int age) {
        this.age = age;
    }
    //*************************************************//
    
    //*************************************************//
    public void setEmail(String email) {
        this.email = email;
    }
    //*************************************************//

    //*************************************************//
    public void setCourse(String course) {
        this.course = course;
    }
    //*************************************************//
    //*************************************************//

    //*************************************************//
    //methods for the other class
    //*************************************************//
    public static void startScreen()
    {
        //*************************************************//
        //Declare string with start window content
        String content = "";
        content += ""
                + "STUDENT MANAGEMENT APPLICATION" + "\n"
                + "***************************************" + "\n";
        //*************************************************//
        
        //*************************************************//
        //print main menue 
        System.out.print(content);
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    public static void askToContinue() throws IOException
    {
        //*************************************************//
        //declare buffered reader 
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //*************************************************//
        //*************************************************//
            //ask to exit
            exitQuestion();
            //check the inputed value
            String inputedValue = bufferedReader.readLine();
            //check the inputed value
            startScreenValue(inputedValue);
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    public static void exitQuestion()
    {
        //*************************************************//
        //Declare string with exit or menu message
        String content = "Enter (1) to launch menu or any other key to exit: ";
        System.out.print(content);
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    public static void startScreenValue(String input)
    {
        //*************************************************//
        if(!input.equalsIgnoreCase("1"))
        {
            System.out.println("Thank you for using our Program, goodbye!");
            System.exit(0);
        }
        //*************************************************//
    }
    //*************************************************//
    //*************************************************//

    //*************************************************//
    public static void mainMenu()
    {
        //*************************************************//
        //declare main menu string
        String main = "\n";
        main += "Please select one of the following menu items:" + "\n"
                + "(1) Capture a new student." + "\n"
                + "(2) Search for a student." + "\n"
                + "(3) Delete a student." + "\n"
                + "(4) Print student report." + "\n"
                + "(5) Exit Application";
        //*************************************************//
        
        //*************************************************//
        //print main menu
        System.out.println(main);
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    //check input only contains numbers 
    public static int getValidNumberFromUser() throws IOException {
        //*************************************************//
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //*************************************************//
        String loopV;
        int loopValue;
        //*************************************************//

        //*************************************************//
        while (true) {
            //*************************************************//
            System.out.print("Please enter a number: ");
            loopV = bufferedReader.readLine();
            //*************************************************//
            
            //*************************************************//
            if (loopV.matches("\\d+")) {
                //*************************************************//
                loopValue = Integer.parseInt(loopV);
                break;
                //*************************************************//
            }
            //*************************************************//
            System.out.println("Please enter a valid input.");
            //*************************************************//
        }
        //*************************************************//

        //*************************************************//
        return loopValue;
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    public static int getStudentAge() throws IOException {
        //*************************************************//
        //declare values
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int age = -1;
        //*************************************************//
        
        //*************************************************//
        while (true) {
            //*************************************************//
            //ask and receive user input
            System.out.print("Please enter the student age >> ");
            String ageString = bufferedReader.readLine();
            //*************************************************//
            
            //*************************************************//
            try {
                age = Integer.parseInt(ageString);
                //*************************************************//
                //if_ age is valid, skip to returning value
                if (StudentAgeValid(age + "")) {
                    break;
                } 
                //*************************************************//
                //if_ the age is not valid
                else {
                    System.out.println("You have entered an incorrect age!!!");
                }
                //*************************************************//
            } catch (NumberFormatException e) {
                //*************************************************//
                //if_ the user does not enter a digit
                System.out.println("You have entered an incorrect age!!!");
                //*************************************************//
            }
            //*************************************************//
        }
        //*************************************************//
        
        //*************************************************//
        //return age
        return age;
        //*************************************************//
    }
    //*************************************************//

    //*************************************************//
    //method to check if age is valid
    public static boolean StudentAgeValid(String ageInput) {
        try 
        {
            //*************************************************//
            int age = Integer.parseInt(ageInput);
            return age >= 16;
            //*************************************************//
            
        } catch (NumberFormatException e) {
            return false; // Return false if the input is not a valid integer
        }
    }
    //*************************************************//
    
    //*************************************************//
    public static String SearchStudent(String ID)
    {
        //*************************************************//
        //declare result string
        String result = "Student with Student ID: " + ID + " was not found!";
        //*************************************************//
        
        //*************************************************//
        //search
        int length = studentList.size();
        int count = 0;
        //*************************************************//
        
        //*************************************************//
        while(count < length)
        {
            //*************************************************//
            if(studentList.get(count).getID().equals(ID))
            {
                result = "STUDENT ID: " + studentList.get(count).getID() + "\n"
                        +"STUDENT NAME: " + studentList.get(count).getName()+ "\n"
                        +"STUDENT AGE: " + studentList.get(count).getAge()+ "\n"
                        +"STUDENT EMAIL: " + studentList.get(count).getEmail()+ "\n"
                        +"STUDENT COURSE: " + studentList.get(count).getCourse();
                break;
            }
            //*************************************************//
            
            count++;
        }
        //*************************************************//
        
        //*************************************************//
        return result;
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    public static String DeleteStudent(String ID) 
    {
        //*************************************************//
        // Search for the student by ID
        int length = studentList.size();
        int count = 0;
        boolean foundID = false;
        String result = "";
        //*************************************************//
        
        //*************************************************//
        while (count < length) 
        {
            //*************************************************//
            if (studentList.get(count).getID().equals(ID)) 
            {
                //*************************************************//
                // Student found, remove from the list
                studentList.remove(count);
                //*************************************************//
                result = ("Student with Student ID: " + ID
                + " WAS deleted!");
                foundID = true;
                //*************************************************//
                break;
                //*************************************************//
            }
            //*************************************************//
            count++;
        }
        //*************************************************//
        
        //*************************************************//
        //if_ no ID was found
        if(foundID == false)
        {
            result = ("No student matching ID: " + ID + " was found.");
        }
        //*************************************************//
        
        return result;
    }
    //*************************************************//

    //*************************************************//
    // Method to add a student to the studentList
    public static String SaveStudent(Student student) {
        studentList.add(student);
        //*************************************************//
                //print completion message
        return "The new student was successfully added";
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    //Student Report
    public static void StudentReport()
    {
        //*************************************************//
        //int number of students
        int count = 1;
        //*************************************************//
        
        //*************************************************//
        //loop through list of students
        for (int i = 0; i < studentList.size(); i++) 
        {
            //*************************************************//
            //get the current student
            Student student = studentList.get(i);
            //*************************************************//
            
            //*************************************************//
            //print title
            System.out.println("STUDENT " + count++);
            System.out.println("---------------------------------------------");
            //*************************************************//
            
            //*************************************************//
            //print student information
            System.out.println("STUDENT ID: " + student.getID());
            System.out.println("STUDENT NAME: " + student.getName());
            System.out.println("STUDENT AGE: " + student.getAge());
            System.out.println("STUDENT EMAIL: " + student.getEmail());
            System.out.println("STUDENT COURSE: " + student.getCourse());
            //*************************************************//
            
            //*************************************************//
            //print end line
            System.out.println("---------------------------------------------");
            //*************************************************//
            
        }
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    //exit application on input 5
    public static void ExitStudentApplication()
    {
        //*************************************************//
        //exit
            System.out.println("Thank you for using our Program, goodbye!");
            System.exit(0);
        //*************************************************//
    }
    //*************************************************//
}
//***********************************END OF FILE****************************************//