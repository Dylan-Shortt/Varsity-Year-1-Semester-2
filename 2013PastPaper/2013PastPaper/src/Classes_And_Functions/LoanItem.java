package Classes_And_Functions;

// LoanItem.java

public abstract class LoanItem {

    // Global variables
    //***************************************************//
    private String name;
    private double rentalPrice;
    //***************************************************//

    // Constructor
    //***************************************************//
    public LoanItem(String name, double rentalPrice) {
        this.name = name;
        this.rentalPrice = rentalPrice;
    }
    //***************************************************//

    // Getters and setters
    //***************************************************//
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }
    //***************************************************//

    // Abstract method
    //***************************************************//
    public abstract String print();
    //***************************************************//

}
//-----------------EndOfFile-----------------//