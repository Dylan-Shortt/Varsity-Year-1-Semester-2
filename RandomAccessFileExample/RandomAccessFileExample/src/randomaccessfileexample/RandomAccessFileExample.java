//*************************************************//
// package declaration
package randomaccessfileexample;
//*************************************************//

//*************************************************//
// imports
import java.io.*;
//*************************************************//

//*************************************************//
// Class: RandomAccessFileExample
public class RandomAccessFileExample {
//*************************************************//

    //*************************************************//
    // Main method
    public static void main(String[] args) {
    //*************************************************//

        //*************************************************//
        // Try-with-resources to handle RandomAccessFile
        try (RandomAccessFile file = new RandomAccessFile("employees.dat", "rw")) {

            // Create two Employee objects
            Employee emp1 = new Employee(1, "John Doe", 50000.0);
            Employee emp2 = new Employee(2, "Jane Smith", 60000.0);

            // Write employee data to the file
            emp1.writeToFile(file);
            emp2.writeToFile(file);

            System.out.println("Records written to the random-access file.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        //*************************************************//
        // Try-with-resources to read from the RandomAccessFile
        try (RandomAccessFile file = new RandomAccessFile("employees.dat", "rw")) {

            // Read the first record from the file
            file.seek(0); // Move pointer to the beginning of the file
            int id1 = file.readInt();

            // Read fixed-length string (name)
            char[] nameChars1 = new char[Employee.NAME_SIZE];
            for (int i = 0; i < Employee.NAME_SIZE; i++) {
                nameChars1[i] = file.readChar();  // Read character by character
            }
            String name1 = new String(nameChars1).trim();  // Trim extra spaces
            double salary1 = file.readDouble();
            System.out.println("Record 1: " + id1 + ", " + name1 + ", " + salary1);

            // Read the second record from the file
            file.seek(Employee.getRecordSize()); // Move pointer to the second record
            int id2 = file.readInt();

            // Read fixed-length string (name)
            char[] nameChars2 = new char[Employee.NAME_SIZE];
            for (int i = 0; i < Employee.NAME_SIZE; i++) {
                nameChars2[i] = file.readChar();  // Read character by character
            }
            String name2 = new String(nameChars2).trim();  // Trim extra spaces
            double salary2 = file.readDouble();
            System.out.println("Record 2: " + id2 + ", " + name2 + ", " + salary2);

        } catch (IOException e) {
            e.printStackTrace();
        }
        //*************************************************//
    }
    //*************************************************//
}
//*************************************************//

//*************************************************//
// Class: Employee
class Employee {
    private int id;
    private String name;
    private double salary;
    
    // Define NAME_SIZE as static because it should not depend on an instance of Employee
    public static final int NAME_SIZE = 20; 
    //*************************************************//

    //*************************************************//
    // Constructor to initialize employee data
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = String.format("%-" + NAME_SIZE + "s", name).substring(0, NAME_SIZE); // Ensure fixed-length name
        this.salary = salary;
    }
    //*************************************************//

    //*************************************************//
    // Write employee data to a RandomAccessFile
    public void writeToFile(RandomAccessFile file) throws IOException {
        file.writeInt(id);
        file.writeChars(name); // Write fixed-length string
        file.writeDouble(salary);
    }
    //*************************************************//

    //*************************************************//
    // Get the size of an employee record
    public static int getRecordSize() {
        return Integer.BYTES + (Character.BYTES * NAME_SIZE) + Double.BYTES; // Calculate the record size
    }
    //*************************************************//
}
//*************************************************//

//***********************************END OF FILE****************************************//