/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//**************************************************************************************//
package prog6112_2021;
//*************************************************//
/**
 *
 * @author dylan
 */
//*************************************************//
public class ProcessRecipe extends Recipes{

    //*************************************************//
    //constructor
    public ProcessRecipe(String ingredients, int time, int difficulty) {
        //*************************************************//
        //parse to super class
        super(ingredients, time, difficulty);
        //*************************************************//
    }
    //*************************************************//
    
    //*************************************************//
    //print output of recipe
    public String PrintRecipes()
    {
        String message = "";
        
        //*************************************************//
        //create output message
        message = "*************************************************";
        message += "\nINGREDIENTS: " + super.getIngredients();
        message += "\nTIME TO MAKE: " + super.getTime();
        message += "\nDIFFICULTY LEVEL: " + super.getDifficulty();
        message += "\n*************************************************";
        //*************************************************//
        
        return message;
    }
    //*************************************************//
    
}
//***********************************END OF FILE****************************************//