package prog6112_a1_st10438409_q2;
//*****************************************//
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;
//*****************************************//

//*****************************************//
public class GameTest {
//*****************************************//

    //*****************************************//
    private Game instance;
    //*****************************************//
    //*****************************************//
    @Before
    public void setUp() {
        instance = new Game("TestUser");
    }
    //*****************************************//
    //*****************************************//
    @After
    public void tearDown() {
        instance = null;
    }
    //*****************************************//
    //*****************************************//
    /**
     * Test of firstPopulatingGameBoard method, of class Game.
     */
    @Test
    public void testFirstPopulatingGameBoard() {
        System.out.println("firstPopulatingGameBoard");
        String[][] result = instance.firstPopulatingGameBoard();

        //*****************************************//
        // Validate the game board size
        assertEquals(10, result.length);
        assertEquals(10, result[0].length);
        //*****************************************//
        // Validate the initial values
        int number = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                assertEquals("[" + number + "]", result[i][j]);
                number++;
            }
        }
        //*****************************************//
    }
    //*****************************************//
    //*****************************************//
    /**
     * Test of returnGameBoard method, of class Game.
     */
    @Test
    public void testReturnGameBoard() {
        System.out.println("returnGameBoard");
        instance.firstPopulatingGameBoard();
        String result = instance.returnGameBoard();

        //*****************************************//
        // Construct the expected board string
        StringBuilder expResult = new StringBuilder();
        int number = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                expResult.append("[").append(number).append("]");
                number++;
            }
            expResult.append("\n");
        }
        //*****************************************//
        //*****************************************//
        assertEquals(expResult.toString(), result);
        //*****************************************//
    }
    //*****************************************//
    //*****************************************//
     @Test
    public void testDiceRoll_EnterValidNumber() throws IOException {
        System.out.println("diceRoll - Enter Valid Number");

        String input = "enter\n3\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        int result = instance.diceRoll(in);

        assertEquals(3, result);
    }

    @Test
    public void testDiceRoll_EnterInvalidNumber() throws IOException {
        System.out.println("diceRoll - Enter Invalid Number");

        String input = "enter\n10\nenter\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        int result = instance.diceRoll(in);

        assertEquals(5, result);
    }

    @Test
    public void testDiceRoll_Roll() throws IOException {
        System.out.println("diceRoll - Roll");

        String input = "roll\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        int result = instance.diceRoll(in);

        assertTrue(result >= 1 && result <= 6);
    }

    @Test
    public void testDiceRoll_InvalidResponse() throws IOException {
        System.out.println("diceRoll - Invalid Response");

        String input = "invalid\nenter\n2\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        int result = instance.diceRoll(in);

        assertEquals(2, result);
    }
}
//****************************************End of file****************************************//