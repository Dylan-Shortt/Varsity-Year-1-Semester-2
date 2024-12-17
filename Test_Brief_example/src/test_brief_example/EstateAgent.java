/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//**************************************************************************************//
package test_brief_example;
//*************************************************//
/**
 *
 * @author dylan
 */
//*************************************************//
abstract class EstateAgent {
    
    //*************************************************//
    //var's
    private String name;
    private double price;
    //*************************************************//
    
    //*************************************************//
    public EstateAgent(String name, double price) {
        this.name = name;
        this.price = price;
    }
    //*************************************************//
    
    //*************************************************//
    public String getAgentName() {
        return name;
    }
    //*************************************************//

    //*************************************************//
    public double getPropertyPrice() {
        return price;
    }
    //*************************************************//
    
    //*************************************************//
    public double getAgentCommsion()
    {
        return getPropertyPrice() * 0.2;
    }
    //*************************************************//
    
}
//***********************************END OF FILE****************************************//