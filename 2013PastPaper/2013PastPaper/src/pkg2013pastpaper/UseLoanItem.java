
package pkg2013pastpaper;
import Classes_And_Functions.*; 
// UseLoanItem.java

public class UseLoanItem {

    public static void main(String[] args) {

        // Create objects
        Book book = new Book("Programming", 559.99, "Java for Dummies");
        DVD dvd = new DVD("Argo", 29.99, "Drama");

        // Print information
        System.out.println(book.print());
        System.out.println(dvd.print());
    }
}
//-----------------EndOfFile-----------------//
