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
public class Technician implements ITechnician{

    //*************************************************//
    //constructor
    public Technician() {
    }
    //*************************************************//

    //*************************************************//
    @Override
    public double CalculatePay(String repairCost, String rate) {
        double pay = (Double.parseDouble(repairCost)) * ((Double.parseDouble(rate))*0.01);
        return pay;
    }
    //*************************************************//

    @Override
    public boolean ValidateDate(String location, String name, String cost, String rate) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
//***********************************END OF FILE****************************************//