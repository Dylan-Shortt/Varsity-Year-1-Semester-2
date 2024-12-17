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
abstract class Recipes {
    
    //*************************************************//
    //create variables
    private String ingredients;
    private int time;
    private int  difficulty;
    //*************************************************//

    //*************************************************//
    //create superclass constructor
    public Recipes(String ingredients, int time, int difficulty) {
        this.ingredients = ingredients;
        this.time = time;
        this.difficulty = difficulty;
    }
    //*************************************************//

    //*************************************************//
    //create getter methods for each variable
    public String getIngredients() {
        return ingredients;
    }
    //*************************************************//
    //*************************************************//
    public int getTime() {
        return time;
    }   
    //*************************************************//
    //*************************************************//
    public int getDifficulty() {
        return difficulty;
    }
    //*************************************************//
    
}
//***********************************END OF FILE****************************************//