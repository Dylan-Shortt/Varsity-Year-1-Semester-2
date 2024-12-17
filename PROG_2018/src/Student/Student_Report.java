/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//**************************************************************************************//
package Student;
//*************************************************//
/**
 *
 * @author dylan
 */

//*************************************************//
class Student_Report extends Student implements iReport {

    //*************************************************//
    // Constructor
    public Student_Report(String studentNumber, double testResult, double assignmentResult, double examResult) {
        super(studentNumber, testResult, assignmentResult, examResult);
    }
    //*************************************************//

    //*************************************************//
    // Method to calculate and print the final report
    @Override
    public void print_report() {
        double testWeight = getTestResult() * 0.25;
        double assignmentWeight = getAssignmentResult() * 0.25;
        double examWeight = getExamResult() * 0.50;
        double finalResult = testWeight + assignmentWeight + examWeight;
        //*************************************************//

        //*************************************************//
        System.out.println("Student Number: " + getStudentNumber());
        System.out.println("Test Result (25%): " + testWeight);
        System.out.println("Assignment Result (25%): " + assignmentWeight);
        System.out.println("Exam Result (50%): " + examWeight);
        System.out.println("Final Result: " + finalResult);
        //*************************************************//
    }
}//********************************END OF FILE****************************************//