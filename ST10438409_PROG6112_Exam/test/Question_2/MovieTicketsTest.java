/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
//**************************************************************************************//
package Question_2;
//**************************************************************************************//
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
//**************************************************************************************//
public class MovieTicketsTest {
    //**************************************************************************************//
    private MovieTickets instance;
    //**************************************************************************************//
    @Before
    public void setUp() {
        instance = new MovieTickets();
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    @Test
    public void testCalculateTotalTicketPrice_CalculatedSuccessfully() {
        System.out.println("CalculateTotalTicketPrice - Calculated Successfully");

        int numberOfTickets = 3;
        double ticketPrice = 100.0;
        double expectedTotal = 342.0; // 3 tickets * 100 each * 1.14 VAT = 342.0

        double result = instance.CalculateTotalTicketPrice(numberOfTickets, ticketPrice);
        assertEquals(expectedTotal, result, 0.1); // allowing for slight rounding differences
    }
    //**************************************************************************************//
    
    //**************************************************************************************//
    @Test
    public void testValidationTest() {
        System.out.println("ValidateData");

        MovieTicketData validData = new MovieTicketData();
        validData.cmbMovieList.setSelectedIndex(1);
        validData.txtNumberOfTickets.setText("2");
        validData.txtTicketPrice.setText("50");

        boolean result = instance.ValidateData(validData);
        assertTrue(result);
    }
    //**************************************************************************************//
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