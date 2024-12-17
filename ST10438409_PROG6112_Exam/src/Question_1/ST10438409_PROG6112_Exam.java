/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//**************************************************************************************//
package Question_1;
//*************************************************//
/**
 *
 * @author dylan
 */
//*************************************************//
public class ST10438409_PROG6112_Exam {
    //*************************************************//
    /**
     * @param args the command line arguments
     */
    //*************************************************//
    
    //*************************************************//
    // static arrays
    static String[] title = {"JAN", "FEB", "MAR"};
    
    static String[] movies = {"Napoleon", "Oppenheimer"};
    
    static int[][] movieSales = {{3000, 1500, 1700}
                                , {3500, 1200, 1600}};
    //*************************************************//
    
    //*************************************************//
    public static void main(String[] args) {
        // TODO code application logic here
        
        //*************************************************//
        //main instances of classes
        ST10438409_PROG6112_Exam mainInstance = new ST10438409_PROG6112_Exam();
        MovieTickets tickets = new MovieTickets(title, movies, movieSales);
        //*************************************************//
        
        //*************************************************//
        //produce  movie report
        tickets.movieReport();
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