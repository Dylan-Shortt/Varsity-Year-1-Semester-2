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
public interface ITechnician {
    
    double CalculatePay(String repairCost, String rate);
    boolean ValidateDate(String location, String name, String cost, String rate);
    
}
//***********************************END OF FILE****************************************//