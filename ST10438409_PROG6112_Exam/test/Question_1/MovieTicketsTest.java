package Question_1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
//**************************************************************************************//
public class MovieTicketsTest {
//**************************************************************************************//    
    private MovieTickets instance;
    private static final String[] TITLES = {"JAN", "FEB", "MAR"};
    private static final String[] MOVIES = {"Napoleon", "Oppenheimer"};
    private static final int[][] MOVIE_SALES = {
        {3000, 1500, 1700},
        {3500, 1200, 1600}
    };
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
        instance = new MovieTickets(TITLES, MOVIES, MOVIE_SALES);
    }
//**************************************************************************************//    
    @After
    public void tearDown() {
        instance = null;
    }
//**************************************************************************************//
    /**
     * Test of TotalMoviesSales method, of class MovieTickets.
     */
    @Test
    public void CalculatedTotalSales_ReturnsExpectedTotalSales() {
        System.out.println("Testing CalculatedTotalSales_ReturnsExpectedTotalSales");

        int[] salesNapoleon = {3000, 1500, 1700};
        int expectedTotalNapoleon = 6200;
        int resultNapoleon = instance.TotalMoviesSales(salesNapoleon);
        assertEquals(expectedTotalNapoleon, resultNapoleon);

        int[] salesOppenheimer = {3500, 1200, 1600};
        int expectedTotalOppenheimer = 6300;
        int resultOppenheimer = instance.TotalMoviesSales(salesOppenheimer);
        assertEquals(expectedTotalOppenheimer, resultOppenheimer);
    }
//**************************************************************************************//
    /**
     * Test of TopMovie method, of class MovieTickets.
     */
    @Test
    public void TopMovieSales_ReturnsTopMovie() {
        System.out.println("Testing TopMovieSales_ReturnsTopMovie");

        int[] totalSales = {6200, 6300};
        String expectedTopMovie = "Top performing movie: Oppenheimer";
        String resultTopMovie = instance.TopMovie(MOVIES, totalSales);
        assertEquals(expectedTopMovie, resultTopMovie);
    }
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