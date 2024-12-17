/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//*************************************************//
package jframe_example_registration_form;
//*************************************************//
/**
 *
 * @author dylan
 */
public class Registered {
    //*************************************************//
    // Class variables
    private String name;
    private String mobile;
    private String gender;
    private String dob;
    private String address;
    //*************************************************//

    //*************************************************//
    //name, mobile, gender, dob, address
    // Constructor to initialize the class variables
    public Registered(String name, String mobile, String gend, String day, String address) {
        this.name = name;
        this.mobile = mobile;
        this.gender = gend;
        this.dob = day;
        this.address = address;
    }
    //*************************************************//

    //*************************************************//
    // Getters and setters for each variable
    public String getName() {
        return name;
    }
    //*************************************************//

    //*************************************************//
    public void setName(String name) {
        this.name = name;
    }
    //*************************************************//

    //*************************************************//
    public String getMobile() {
        return mobile;
    }
    //*************************************************//
    
    //*************************************************//
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    //*************************************************//

    //*************************************************//
    public String getAddress() {
        return address;
    }
    //*************************************************//

    //*************************************************//
    public void setAddress(String address) {
        this.address = address;
    }
    //*************************************************//

    //*************************************************//
    //default construtor
    public Registered() {
    }
    //*************************************************//

    //*************************************************//
    //method to make a string output of the user
    @Override
    public String toString() {
        return "Registered User \n" + "Name : " + name + "\nMobile : " + mobile + "\nGender : " + gender + "\nDOB : " + dob + "\nAddress : " + address;
    }
    //*************************************************//
}
//***********************************END OF FILE****************************************//