
package Classes_And_Functions;

// DVD.java

public class DVD extends LoanItem {

    // Global variable
    //***************************************************//
    private String classification;
    //***************************************************//

    // Constructor
    //***************************************************//
    public DVD(String name, double rentalPrice, String classification) {
        super(name, rentalPrice);
        this.classification = classification;
    }
    //***************************************************//

    // Getter and setter
    //***************************************************//
    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }
    //***************************************************//
    
    // Implementation of print method
    //***************************************************//
    @Override
    public String print() {
        return String.format("%s video classified as %s and rents for R%.2f", getName(), classification, getRentalPrice());
    }
    //***************************************************//
}
//-----------------EndOfFile-----------------//