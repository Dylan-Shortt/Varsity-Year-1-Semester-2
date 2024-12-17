/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//**************************************************************************************//
package Question_1;
//*************************************************//
/**
 *
 * @author dylan
 */
//*************************************************//
public class MovieTickets implements IMovieTickets{

    //*************************************************//
    //var's
    private String[] title;
    private String[] movies;
    private int[][] movieSales;
    private int[] totalSales;
    //*************************************************//
    
    //*************************************************//
    //constructor
    public MovieTickets(String[] title, String[] movies, int[][] movieSales) {
        this.title = title;
        this.movies = movies;
        this.movieSales = movieSales;
        this.totalSales = new int[movies.length];
    }
    //*************************************************//
    
    //*************************************************//
    //movie report
    public void movieReport() 
    {
        //*************************************************//
        //print report title
        System.out.println("MOVIE TICKET SALES REPORT - 2024");
        //*************************************************//
        
        //*************************************************//
        //print title
        System.out.printf("%-20s %-20s %-20s %-20s%n", "", title[0], title[1], title[2]);
        System.out.println("----------------------------------------------------------------------------");
        //*************************************************//
        
        //*************************************************//
        //print report on movie sales
        for (int i = 0; i < movies.length; i++)
        {
            System.out.printf("%-20s %-20s %-20s %-20s%n", movies[i], movieSales[i][0], movieSales[i][1], movieSales[i][2]);
        }
        //*************************************************//
        System.out.println();
        
        //**************************************************************************************//
        
        //*************************************************//
        //print the total movie sales for movie
        for (int i = 0; i < movies.length; i++)
        {
            totalSales[i] = TotalMoviesSales(movieSales[i]);
            System.out.printf("%-1s %-1s%n", "Total movie ticket sales for " + movies[i], " " + totalSales[i]);
        }
        System.out.println();
        //*************************************************//
        
        //*************************************************//
        //print the top preforming movie
        System.out.println(TopMovie(movies, totalSales));
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    //return total sales for one movie
    @Override
    public int TotalMoviesSales(int[] movieTicketSales) {
        
        //*************************************************//
        //find total sales
        int total = 0;
        
        for (int i = 0; i < movieTicketSales.length; i++)
        {
            total += movieTicketSales[i];
        }
        
        return total;
        //*************************************************//
        
    }
    //*************************************************//

    //*************************************************//
    //print the highest selling movie
    @Override
    public String TopMovie(String[] movies, int[] totalSales) 
    {
        //*************************************************//
        //setup before looping through to check for the highest value
        int highestSale = totalSales[0];
        int highestIndex = 0;
        String message = "Top performing movie: ";
        //*************************************************//
        
        //*************************************************//
        //print the movie that has the highest selling tickets
        for (int i = 0; i < movies.length; i++)
        {
            //*************************************************//
            //check for highest value
            boolean condition = highestSale < totalSales[i];
            if(condition)
            {
                //if_ the new value is higher than the current max value
                //then save the new highest value and set the new highest index to the current movie                
                highestSale = totalSales[i];
                highestIndex = i;
            }
            //*************************************************//
        }
        //*************************************************//
        
        //*************************************************//
        //update message
        message += movies[highestIndex];
        //*************************************************//
        
        //*************************************************//
        //return movie
        return message;
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