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
public class RoadAccidentReport extends RoadAccidents{

    //*************************************************//
    //constructor method
    public RoadAccidentReport(String vehicleType, String city, int totalAccidents) {
        super(vehicleType, city, totalAccidents);
    }
    //*************************************************//
    
    //*************************************************//
    //print accident report method
    public void printAccidentReport()
    {
        System.out.println();
        System.out.println("VEHICLE ACCIDENT REPORT");
        System.out.println("*****************************");
        System.out.println("VEHICLE TYPE: " + super.getAccidentVehicleType());
        System.out.println("CITY: " + super.getCity());
        System.out.println("ACCIDENT TOTAL: " + super.getAccidentTotal());
        System.out.println("*****************************");
    }
    //*************************************************//
    
}
//***********************************END OF FILE****************************************//

//*************************************************//
//StudentNumber = ST10438409
//Module = PROG 6112
//Task type = Test
//*************************************************//