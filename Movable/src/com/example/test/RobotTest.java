/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//*************************************************//
package com.example.test;

//*************************************************//
//import robot class
import com.example.machines.Robot;
//*************************************************//
/**
 *
 * @author dylan
 */
//*************************************************//
//main class
public class RobotTest {
    
    //*************************************************//
    //main method
    public static void main(String[] args) {
        
        //*************************************************//
        //create an instance of the robot class
        Robot robot = new Robot();
        //*************************************************//
        
        //*************************************************//
        //run methods from robot (interface) class
        robot.moveForward();
        robot.moveBackward();
        //*************************************************//
    }
    //*************************************************//
    
}
//***********************************END OF FILE****************************************//