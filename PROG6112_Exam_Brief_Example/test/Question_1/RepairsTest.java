/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Question_1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class RepairsTest {
    
    private Repairs repairs;
    private double[][] costs;
    private String[] technicians;
    private String[] title;

    // Setting up the data before each test
    @Before
    public void setUp() {
        // Example data
        title = new String[]{"JAN", "FEB", "MAR"};
        technicians = new String[]{"Joe Bloggs", "Jane Doe"};
        costs = new double[][]{
            {8000.0, 2500.0, 5000.0},  // Joe Bloggs
            {7000.0, 2200.0, 5600.0}   // Jane Doe
        };
        repairs = new Repairs(costs, title, technicians);
    }

    // Test CalculateCosts_ReturnsRepairCosts
    @Test
    public void CalculateCosts_ReturnsRepairCosts() {
        double[] repairCostsJoe = {8000.0, 2500.0, 5000.0}; // Hard-coded repair costs for Joe Bloggs
        double expectedTotalJoe = 8000.0 + 2500.0 + 5000.0; // Expected repair cost for Joe

        double result = repairs.RepairCosts(repairCostsJoe); // Call the method

        assertEquals("Total repair cost for Joe should be 15500.0", expectedTotalJoe, result, 0.01); // Allowing small margin of error
    }

    // Test CalculatePay_ReturnsExpectedPay
    @Test
    public void CalculatePay_ReturnsExpectedPay() {
        double repairCostJoe = 15500.0; // Hard-coded total repair cost for Joe Bloggs
        double expectedPayJoe = repairCostJoe * 0.10; // Expected pay is 10% of total repair cost

        double result = repairs.TechnicianPay(repairCostJoe); // Call the method

        assertEquals("Technician pay for Joe should be 1550.0", expectedPayJoe, result, 0.01); // Allowing small margin of error
    }

    // Test TopTechnician_ReturnsTopPosition
    @Test
    public void TopTechnician_ReturnsTopPosition() {
        double[] commissions = {1550.0, 1480.0}; // Hard-coded commission values for Joe and Jane

        int expectedTopTechnicianIndex = 0; // Joe Bloggs has the highest commission

        int result = repairs.TopTechnician(commissions); // Call the method

        assertEquals("The top technician should be Joe Bloggs", expectedTopTechnicianIndex, result); // 0 for Joe
    }
}