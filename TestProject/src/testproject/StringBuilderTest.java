/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//**************************************************************************************//
package testproject;
//**************************************************************************************//

/**
 *
 * @author dylan
 */

//**************************************************************************************//
public class StringBuilderTest {
   
    //**************************************************************************************//
    //Declarations
    private String str = "This is a String";
    private char c = 'D';
    private int i = 10;
    private float f = 1025;
    private double d = 100.486;
    private boolean b = true;
    
    private String strOffset = "This is an inserted string";
    private int offset = str.length();
    
    private int start = 16;
    private int end = 41;
    private String strReplace = "replaced string values";
    
    private int index = 0;
    
    private int minimumCapacity = 200;
    
    private int newLength = 150;
    //**************************************************************************************//
    
    //**************************************************************************************//
    //constructor
    public StringBuilderTest ()    
    {
        
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    //test method
    public void builder()
    {
        //*************************************************//
        System.out.println("First we can declare a StringBuilder: ");
        System.out.println("StringBuilder stringBuilder = new StringBuilder();");
        // first use, declare a StringBuilder
        StringBuilder sb = new StringBuilder();
        //*************************************************//
        
        //*************************************************//
        System.out.println("\nNext we can append data to the builder:");
        // second use, append data:
        sb.append(str);
        sb.append("\n");
        
        sb.append(c);
        sb.append("\n");
        
        sb.append(i);
        sb.append("\n");
        
        sb.append(f);
        sb.append("\n");
        
        sb.append(d);
        sb.append("\n");
        
        sb.append(b);
        sb.append("\n");
        
        // print string 
        System.out.println("Print string: ");
        System.out.println(sb);
        //*************************************************//
        
        //*************************************************//
        // insert into StringBuilder 
        System.out.println("Third, we can insert data into the builder:");
        System.out.println("We can insert a string at position " + offset);
        
        sb.insert(offset, strOffset);
        sb.append("\n");
        
        System.out.println("String builder: ");
        System.out.println(sb);
        //*************************************************//
        
        //*************************************************//
        // Replace sequence
        System.out.println("Replace from start index to end index with a set string");
        
        sb.replace(start, end, strReplace);
        
        System.out.println("Print string: ");
        System.out.println(sb);
        //*************************************************//
        
        //*************************************************//
        // Delete portion
        System.out.println("Delete range from string: ");
        sb.delete(start, end);
        System.out.println("Delete range:");
        System.out.println(sb);
        //*************************************************//
        
        //*************************************************//
        // Delete character 
        System.out.println("Delete character:");
        sb.deleteCharAt(index);
        System.out.println("Deleted first index:");
        System.out.println(sb);
        //*************************************************//
        
        //*************************************************//
        // Reverse string order
        System.out.println("Reverse string order: ");
        
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        //*************************************************//
        
        //*************************************************//
        // Get length 
        System.out.println("Length of string: ");
        int length = sb.length();
        System.out.println(length);
        //*************************************************//
        
        //*************************************************//
        // Get the capacity of the sequence
        System.out.println("String capacity");
        int capacity = sb.capacity();
        System.out.println("Capacity of string is: " + capacity);
        //*************************************************//
        
        //*************************************************//
        // Ensure a minimum capacity
        System.out.println("Ensure a minimum capacity:");
        sb.ensureCapacity(minimumCapacity);
        System.out.println("sb.ensureCapacity(int minimumCapacity);");
        //*************************************************//
        
        //*************************************************//
        // Set the length of the sequence
        System.out.println("Set the length of the sequence");
        sb.setLength(newLength);
        System.out.println("sb.setLength(int newLength);");
        //*************************************************//
        
        //*************************************************//
        // Get a character at a specific index
        System.out.println("Get character at a specific index:");
        char ch = sb.charAt(index);
        System.out.println("Character at index " + index + " is: " + ch);
        //*************************************************//
        
        //*************************************************//
        // Set a character at a specific index
        System.out.println("Set character at a specific index:");
        sb.setCharAt(index, 'X');
        System.out.println("String builder after setting character at index " + index + " to 'X':");
        System.out.println(sb);
        //*************************************************//
        
        //*************************************************//
        // Get a substring
        System.out.println("Get substring from start index to end index:");
        String substr = sb.substring(start, end);
        System.out.println("Substring from index " + start + " to " + end + " is: " + substr);
        //*************************************************//
        
        //*************************************************//
        // Convert StringBuilder to String
        System.out.println("Convert StringBuilder to String:");
        String finalString = sb.toString();
        System.out.println("Final string: " + finalString);
        //*************************************************//
    
    }
    //**************************************************************************************//
    
}
//***********************************END OF FILE****************************************//
