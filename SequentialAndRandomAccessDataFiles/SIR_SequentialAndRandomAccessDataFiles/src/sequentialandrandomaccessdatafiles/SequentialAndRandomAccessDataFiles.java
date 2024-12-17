package sequentialandrandomaccessdatafiles;

import java.io.*;

public class SequentialAndRandomAccessDataFiles {
    public static void main(String[] args) {
        
        //Sequential Access to a File
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        //Random Access to a File
        try (RandomAccessFile file = new RandomAccessFile("example.txt", "rw")) {
            // Move the file pointer to the 5th byte position
            file.seek(5);
            // Read the next character
            char ch = (char) file.read();
            System.out.println("Character at position 5: " + ch);

            // Write at a specific position
            file.seek(10);
            file.write("New Data".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
}
