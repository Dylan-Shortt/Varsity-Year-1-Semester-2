/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//**************************************************************************************//
package Question_2;
//*************************************************//

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dylan
 */
//*************************************************//

//*************************************************//
public class Movie_Tickets {
    //*************************************************//
    public static void main(String[] args) {
        
        try {
            //*************************************************//
            //Var's for testing
            String name;
            String movie;
            int age;
            double price;
            //*************************************************//
            
            //*************************************************//
            //define buffered reader to get user input
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            //*************************************************//
            
            //*************************************************//
            //testing output / input from user
            System.out.print("Enter the customer name: ");
            name = bufferedReader.readLine();
            
            System.out.print("Enter the movie: ");
            movie = bufferedReader.readLine();
            
            System.out.print("Enter the customer age: ");
            age = Integer.parseInt(bufferedReader.readLine());
            
            System.out.print("Enter the movie cost: ");
            price = Double.parseDouble(bufferedReader.readLine());
            //*************************************************//
            
            //*************************************************//
            //create ticket
            TicketSales ticketSales = new TicketSales(name, movie, age, price);
            System.out.println();
            //*************************************************//
            
            //*************************************************//
            //print ticket for the customer
            ticketSales.print_tickets();
            //*************************************************//
        } catch (IOException ex) {
            Logger.getLogger(Movie_Tickets.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //*************************************************//
}
//***********************************END OF FILE****************************************//