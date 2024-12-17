/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//**************************************************************************************//
package Estate;
//*************************************************//
/**
 *
 * @author dylan
 */
//*************************************************//
public class EstateAgentSales extends EstateAgent{

    //*************************************************//
    public EstateAgentSales(String name, double price) {
        super(name, price);
    }
    //*************************************************//
    
    //*************************************************//
    public void printPropertyReport()
    {
        //*************************************************//
        String message = "";
        //*************************************************//
        
        //*************************************************//
        message = "Name: " + super.getAgentName();
        message += "\nProperty price: " + super.getPropertyPrice();
        message += "\nCommission: " + super.getAgentCommission();
        System.out.println(message);
        //*************************************************//
    }
    //*************************************************//
    
}
//***********************************END OF FILE****************************************//