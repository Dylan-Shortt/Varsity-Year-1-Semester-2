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
abstract class EstateAgent implements iEstateAgent{
    
    //*************************************************//
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
    @Override
    public String getAgentName() {
        return name;
    }
    //*************************************************//
    
    //*************************************************//
    @Override
    public double getPropertyPrice() {
        return price;
    }
    //*************************************************//
    
    //*************************************************//
    @Override
    public double getAgentCommission()
    {
        return getPropertyPrice() * 0.2;
    }
    //*************************************************//
    
}
//***********************************END OF FILE****************************************//