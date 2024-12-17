/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//*************************************************//
package com.example.machines;
//*************************************************//

//*************************************************//
//imports the interface
import movable.Movable;
//*************************************************//

/**
 *
 * @author dylan
 */
//*************************************************//
//class
public class Robot implements Movable{
    
   //*************************************************//
   //update interface method
   public static void moveForward()
   {
       System.out.println("Robot moving forward");
   }
   //*************************************************//
    
   //*************************************************//
   public static void moveBackward()
   {
       System.out.println("Robot moving backward");
   }
   //*************************************************//
    
}
//***********************************END OF FILE****************************************//