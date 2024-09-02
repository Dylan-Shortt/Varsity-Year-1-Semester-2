//**************************************************************************************//
package prog6112_a1_st10438409_q2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
//**************************************************************************************//

//**************************************************************************************//
public class PlayerTest {
//**************************************************************************************//
    private Player instance;
//**************************************************************************************//
    public PlayerTest() {
    }
//**************************************************************************************//
    @BeforeClass
    public static void setUpClass() {
    }
//**************************************************************************************//
    @AfterClass
    public static void tearDownClass() {
    }
//**************************************************************************************//
    @Before
    public void setUp() {
        instance = new Player("TestPlayer");
    }
//**************************************************************************************//
    @After
    public void tearDown() {
        instance = null;
    }
//**************************************************************************************//
    /**
     * Test of getPosition method, of class Player.
     */
    @Test
    public void testGetPosition() {
        System.out.println("getPosition");
        int expResult = 0;
        int result = instance.getPosition();
        assertEquals(expResult, result);
    }
    
//**************************************************************************************//
    /**
     * Test of movePlayer method, of class Player.
     */
    @Test
    public void testMovePlayer() {
        System.out.println("movePlayer");
        int roll = 5;
        instance.movePlayer(roll);
        int expResult = 5;
        int result = instance.getPosition();
        assertEquals(expResult, result);

        roll = 95;
        instance.movePlayer(roll);
        expResult = 100;
        result = instance.getPosition();
        assertEquals(expResult, result);
    }
//**************************************************************************************//    
    /**
     * Test of getGameBoardData method, of class Player.
     */
    @Test
    public void testGetGameBoardData() {
        System.out.println("getGameBoardData");
        instance.firstPopulatingGameBoard();
        Object[][] boardData = instance.getGameBoardData();
        
        // Check that the board has the correct size
        assertEquals(10, boardData.length);
        assertEquals(10, boardData[0].length);

        // Check specific snake and ladder positions
        assertEquals("Snake", boardData[3][5]);
        assertEquals("Ladder", boardData[4][2]);
    }
//**************************************************************************************//
    /**
     * Test of diceRoll method, from Game class.
     */
    @Test
    public void testDiceRoll() throws Exception {
        System.out.println("diceRoll");
        Game gameInstance = new Game("TestGame");

        // Test manual entry
        InputStream sysInBackup = System.in; // Backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("enter\n5\n".getBytes());
        System.setIn(in);
        int expResult = 5;
        int result = gameInstance.diceRoll();
        assertEquals(expResult, result);

        // Test random roll
        in = new ByteArrayInputStream("roll\n".getBytes());
        System.setIn(in);
        result = gameInstance.diceRoll();
        assertTrue(result >= 1 && result <= 6);

        System.setIn(sysInBackup); // Restore System.in
    }
//**************************************************************************************//
}
//*************************************************End of file*************************************************//
