/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//*************************************************//
package test_brief_example;
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
    public String printPropertyReport()
    {
        //*************************************************//
        String message = "";
        
        message = "Agent: " + super.getAgentName() + "\n";
        message += "Property sale: R" + super.getPropertyPrice() + "\n";
        message += "Commission: R" + super.getAgentCommsion();
        //*************************************************//
        
        return message;
    }
    //*************************************************//
    
}
//***********************************END OF FILE****************************************//