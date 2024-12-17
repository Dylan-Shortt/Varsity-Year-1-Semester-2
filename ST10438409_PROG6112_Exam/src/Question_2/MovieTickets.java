/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//**************************************************************************************//
package Question_2;
//*************************************************//
/**
 *
 * @author dylan
 */
//*************************************************//
public class MovieTickets implements IMovieTickets{

    //*************************************************//
    //defualt constructor
    public MovieTickets() {
    }
    //*************************************************//
    
    //*************************************************//
    //calcualte the total price of tickets
    @Override
    public double CalculateTotalTicketPrice(int numberOfTickets, double ticketPrice) {
        
        //set the VAT to 14%
        double vat = 1.14;
    
        //*************************************************//
        //return total cost of tickets
        double total = (numberOfTickets * ticketPrice * vat);
        
        // Round to one decimal place
        total = Math.round(total * 10) / 10.0;
        
        return total;
        //*************************************************//
    }
    //*************************************************//

    //*************************************************//
    //check the programs validation
    @Override
    public boolean ValidateData(MovieTicketData movieTicketData) 
    {  
        //*************************************************//
        // Check if the fields contain text
        
        //check movie name
        if(movieTicketData.cmbMovieList.getSelectedItem().toString().isBlank() || movieTicketData.cmbMovieList.getSelectedItem().toString().isEmpty())
        {
            return false;
        }
        // Check movie price
        String priceText = movieTicketData.txtTicketPrice.getText();
        if (priceText.isBlank()) 
        {
            return false;  // Invalid if price is blank
        }
    
        try {
            int price = Integer.parseInt(priceText);
            if (price <= 0) 
            {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;  // Invalid if price is not a valid number
        }
    
        // Check number of movie tickets
        String ticketsText = movieTicketData.txtNumberOfTickets.getText();
        if (ticketsText.isBlank()) 
        {
            return false;  // Invalid if tickets field is blank
        }
    
        try {
            int numberOfTickets = Integer.parseInt(ticketsText);
            if (numberOfTickets <= 0) 
            {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;  // Invalid if number of tickets is not a valid number
        }
        //*************************************************//
        
        //*************************************************//
        //return true if_ all validation passed
        return true;
        //*************************************************//
    }
    //*************************************************//
}
//***********************************END OF FILE****************************************//

//*************************************************//
//Name: Dylan Shortt
//Student number: ST10438409
//Group: 4
//Module: PROG
//Module code: 6112
//Date: 2024/11/12
//*************************************************//