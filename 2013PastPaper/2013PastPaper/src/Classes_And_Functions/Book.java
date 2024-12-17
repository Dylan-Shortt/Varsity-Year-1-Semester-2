
package Classes_And_Functions;

// Book.java

public class Book extends LoanItem {

    // Global variable
    //***************************************************//
    private String genre;
    //***************************************************//

    // Constructor
    //***************************************************//
    public Book(String name, double rentalPrice, String genre) {
        super(name, rentalPrice);
        this.genre = genre;
    }
    //***************************************************//

    // Getter and setter
    //***************************************************//
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    //***************************************************//

    // Implementation of print method
    //***************************************************//
    @Override
    public String print() {
        return String.format("%s recommends a book %s and rents for R%.2f", getName(), genre, getRentalPrice());
    } 
    //***************************************************//
}
//-----------------EndOfFile-----------------//
