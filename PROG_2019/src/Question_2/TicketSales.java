/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//**************************************************************************************//
package Question_2;
//*************************************************//
/**
 *
 * @author dylan
 */
//*************************************************//
                    //extends the ticket class
public class TicketSales extends Tickets{
    //*************************************************//
    //constructor
    public TicketSales(String name, String movieTitle, int age, double price) {
        super(name, movieTitle, age, price);
    }
    //*************************************************//
    
    //*************************************************//
    //override interface method
    @Override
    public void print_tickets()
    {
        //*************************************************//
        System.out.println("CUSTOMER: " + super.getName());
        System.out.println("MOVIE: " + super.getMovieTitle());
        System.out.println("COST: R " + super.getPrice());
        //*************************************************//
        
        //*************************************************//
        double discount = 0;
        //*************************************************//
        
        //*************************************************//
        //check discount 
        if(super.getAge() >= 65)
        {
            //*************************************************//
            discount = (super.getPrice() * 0.1);
            //*************************************************//
        }
        //*************************************************//
        //*************************************************//
        System.out.println("DISCOUNT: R " + discount);
        System.out.println("TOTAL: R " + (super.getPrice() - discount));
        //*************************************************//
    }
    //*************************************************//
    
}
//***********************************END OF FILE****************************************//