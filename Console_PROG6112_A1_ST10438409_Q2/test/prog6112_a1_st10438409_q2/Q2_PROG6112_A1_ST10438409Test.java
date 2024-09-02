package prog6112_a1_st10438409_q2;
//*************************************************//
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
//*************************************************//
/**
 * Test class for Q2_PROG6112_A1_ST10438409.
 */
public class Q2_PROG6112_A1_ST10438409Test {
//*************************************************//
    public Q2_PROG6112_A1_ST10438409Test() {
    }
//*************************************************//
    @BeforeClass
    public static void setUpClass() {
    }
//*************************************************//
    @AfterClass
    public static void tearDownClass() {
    }
//*************************************************//
    @Before
    public void setUp() {
    }
//*************************************************//
    @After
    public void tearDown() {
    }
//*************************************************//
    //*************************************************//
    /**
     * Test of getUsername method, of class Q2_PROG6112_A1_ST10438409.
     */
    @Test
    public void testGetUsername() throws IOException {
        System.out.println("getUsername");
        //*************************************************//
        // Simulate user input
        String simulatedInput = "TestUser\n";
        InputStream sysInBackup = System.in; // Backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(in);
        //*************************************************//

        //*************************************************//
        // Create a BufferedReader using the simulated input
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        String expResult = "TestUser";
        String result = Q2_PROG6112_A1_ST10438409.getUsername(bufferedReader);
        assertEquals(expResult, result);
        //*************************************************//
        System.setIn(sysInBackup); // Restore System.in
    }
    //*************************************************//
}
//*************************************************END of file***********************************************//
