/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//*************************************************//
package test_brief_example;
//*************************************************//
/**
 *
 * @author dylan
 */
//*************************************************//
public class Test_Brief_example {
    //*************************************************//
    /**
     * @param args the command line arguments
     */
    //*************************************************//
    public static void main(String[] args) {
        // TODO code application logic here
        
        //*************************************************//
        //declare arrays
        double cameras[][] = {{10500, 9500, 12000}, {8500, 7200, 8000}};
        String[] brands= {"CANON", "SONY", "NIKON"};
        //*************************************************//
        
        //*************************************************/
        //parse values to output method
        reportOutput(cameras, brands);
        //*************************************************//
        
    }
    //*************************************************//
    
    //*************************************************//
    //display report output
    public static void reportOutput(double  cameras[][], String[] brands)
    {
        //*************************************************//
        //output title
        String title = "-------------------------------------------------------------------"
                + "\n" + "CAMERA TECHNOLOGY REPORT" + "\n"
                + "-------------------------------------------------------------------";
        System.out.println(title);
        //*************************************************//
        
        //*************************************************//
        //output title for camera's 
        System.out.println("\t\tMIRRORLESS\t\tDSLR");
        //*************************************************//
        
        //*************************************************//
        //output camera's values and brands
        for (int i = 0; i < 3; i++)
        {
            System.out.print(brands[i] + "\t" + "\t");
            
            System.out.print("R" + cameras[0][i] + "\t" + "\t" + "\t");
            System.out.print("R" + cameras[1][i]);
            
            System.out.println();
        }
        System.out.println();
        //*************************************************//
        
        //*************************************************//
        //output results
        String results = "-------------------------------------------------------------------"
                + "\n" + "CAMERA TECHNOLOGY RESULTS" + "\n"
                + "-------------------------------------------------------------------";
        System.out.println(results);
        //*************************************************//
        
        //*************************************************//
        //output report of results
        double difference = 0;
        double highestDifference = 0;
        String highestBrand = "";
        //*************************************************//
        
        //*************************************************//
        for (int i = 0; i < 3; i++)
        {
            //*************************************************//
            //print brand
            System.out.print(brands[i] + "\t");
            //*************************************************//
            
            //*************************************************//
            //get difference 
            difference = cameras[0][i] - cameras[1][i];
            //*************************************************//
            
            //*************************************************//
            //display difference 
            System.out.print("R" + difference);
            //*************************************************//
            
            //*************************************************//
            if(difference >= 2500)
            {
                //*************************************************//
                System.out.print(" ***");
                //*************************************************//
            }
            //*************************************************//
            
            //*************************************************//
            // Check if the current difference is higher than the highestDifference
            if (difference > highestDifference) 
            {
                //*************************************************//
                highestDifference = difference; // Update the highest difference
                highestBrand = brands[i];       // Save the brand with the highest difference
                //*************************************************//
            }
            //*************************************************//
            
            //new line
            System.out.println();
        }
        //*************************************************//
        
        //*************************************************//
        //find greates differnce 
        System.out.println("CAMERA WITH THE MOST COST DIFFERENCE: " + highestBrand);
        System.out.println("-------------------------------------------------------------------");
        //*************************************************//
    }
    //*************************************************//
    
}
//***********************************END OF FILE****************************************//