/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//**************************************************************************************//
package Estate;

//*************************************************//
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
//*************************************************//

//*************************************************//
/**
 *
 * @author dylan
 */
//*************************************************//
public class RunApplication {
    //*************************************************//
    public static void main(String[] args) {
        
        //*************************************************//
        try {
            //*************************************************//
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            //*************************************************//
            
            //*************************************************//
            System.out.print("Enter the current name: ");
            String name = bufferedReader.readLine();
            //*************************************************//
            
            //*************************************************//
            System.out.print("Enter price: ");
            double price = Double.parseDouble(bufferedReader.readLine());
            //*************************************************//
            
            //*************************************************//
            EstateAgentSales sales = new EstateAgentSales(name, price);
            //*************************************************//
            
            //*************************************************//
            sales.printPropertyReport();
            //*************************************************//
            
        } catch (IOException ex) {
            Logger.getLogger(RunApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        //*************************************************//   
        
    }
    //*************************************************//
    
}
//***********************************END OF FILE****************************************//