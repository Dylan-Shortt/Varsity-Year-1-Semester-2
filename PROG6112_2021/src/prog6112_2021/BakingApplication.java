/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//**************************************************************************************//
package prog6112_2021;
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
public class BakingApplication 
{
    //*************************************************//
    public static void main(String[] args) {
        //*************************************************//
        try {
            //*************************************************//
            //declare
            String ingredients = "";
            int  time = 0;
            int difficulty = 0;
            //*************************************************//
            
            //*************************************************//
            //get input
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.print("Enter the ingredients: ");
            ingredients = bufferedReader.readLine();
            
            System.out.print("Enter time to make (in minutes): ");
            time =Integer.parseInt(bufferedReader.readLine());
            
            System.out.print("Enter difficulty level: ");
            difficulty =Integer.parseInt(bufferedReader.readLine());
            //*************************************************//
            
            //*************************************************//
            //create class instansiation 
            ProcessRecipe recipe = new ProcessRecipe(ingredients, time, difficulty);
            //*************************************************//
            
            //*************************************************//
            //print report
            System.out.println(recipe.PrintRecipes());
            //*************************************************//
        } catch (IOException ex) {
            Logger.getLogger(BakingApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        //*************************************************//
        
    }
    //*************************************************//
}
//***********************************END OF FILE****************************************//