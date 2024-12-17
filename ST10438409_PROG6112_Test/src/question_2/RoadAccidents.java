/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//**************************************************************************************//
package question_2;
//*************************************************//
/**
 *
 * @author dylan
 */
//*************************************************//
abstract class RoadAccidents implements IRoadAccidents{
    
    //*************************************************//
    //var's 
    private String vehicleType;
    private String city;
    private int totalAccidents;
    //*************************************************//

    //*************************************************//
    //constructor
    public RoadAccidents(String vehicleType, String city, int totalAccidents) {
        this.vehicleType = vehicleType;
        this.city = city;
        this.totalAccidents = totalAccidents;
    }
    //*************************************************//
    
    //*************************************************//
    //getter methods
    @Override
    public String getAccidentVehicleType() {
        return vehicleType;
    }
    //getter method
    @Override
    public String getCity() {
        return city;
    }
    //getter method
    @Override
    public int getAccidentTotal() {
        return totalAccidents;
    }
    //*************************************************//
}
//***********************************END OF FILE****************************************//

//*************************************************//
//StudentNumber = ST10438409
//Module = PROG 6112
//Task type = Test
//*************************************************//