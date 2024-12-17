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

//abstract class type
abstract class Tickets implements iTickets{
    
    //*************************************************//
    //var's
    private String name;
    private String movieTitle;
    private int age;
    private double price;
    //*************************************************//

    //*************************************************//
    //constructor
    public Tickets(String name, String movieTitle, int age, double price) {
        this.name = name;
        this.movieTitle = movieTitle;
        this.age = age;
        this.price = price;
    }
    //*************************************************//

    //*************************************************//
    //get methods for the variables
    public String getName() {
        return name;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public int getAge() {
        return age;
    }

    public double getPrice() {
        return price;
    }
    //*************************************************//
    
}
//***********************************END OF FILE****************************************//