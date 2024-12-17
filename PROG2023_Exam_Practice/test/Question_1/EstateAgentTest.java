package Question_1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dylan
 */
public class EstateAgentTest {

    private EstateAgent instance;
    private String[] headings = {"JAN", "FEB", "MAR"};
    private String[] estateAgents = {"Joe Bloggs", "Jane Doe"};
    private double[][] propertySales = {
        {100, 50, 200},   // Sales data for agent 1
        {300, 400, 100}   // Sales data for agent 2
    };

    public EstateAgentTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new EstateAgent(headings, estateAgents, propertySales);
    }

    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of EstateAgentSales method, of class EstateAgent.
     */
    @Test
    public void testCalculateTotalSales_ReturnsTotalSales() {
        System.out.println("EstateAgentSales");
        double[] salesData = {100, 50, 200};  // Example sales data
        double expResult = 350.0;
        double result = instance.EstateAgentSales(salesData);
        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of EstateAgentCommission method, of class EstateAgent.
     */
    @Test
    public void testCalculateTotalCommission_ReturnsCommission() {
        System.out.println("EstateAgentCommission");
        double salesTotal = 350.0;
        double expResult = 7.0; // 2% of 350 is 7.0
        double result = instance.EstateAgentCommission(salesTotal);
        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of TopEstateAgent method, of class EstateAgent.
     */
    @Test
    public void testTopAgent_ReturnsTopPosition() {
        System.out.println("TopEstateAgent");
        double[] totalSales = {350.0, 800.0}; // Agent 2 has the highest sales
        int expResult = 1; // Agent 2's index is 1
        int result = instance.TopEstateAgent(totalSales);
        assertEquals(expResult, result);
    }
}
