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
abstract class Student {
    //*************************************************//
    //var's
    private String studentNumber;
    private double testResult;
    private double assignmentResult;
    private double examResult;
    //*************************************************//
    
    //*************************************************//
    // Constructor
    public Student(String studentNumber, double testResult, double assignmentResult, double examResult) {
        this.studentNumber = studentNumber;
        this.testResult = testResult;
        this.assignmentResult = assignmentResult;
        this.examResult = examResult;
    }
    //*************************************************//

    //*************************************************//
    // Get methods
    public String getStudentNumber() {
        return studentNumber;
    }
    //*************************************************//
    //*************************************************//
    public double getTestResult() {
        return testResult;
    }
    //*************************************************//
    //*************************************************//
    public double getAssignmentResult() {
        return assignmentResult;
    }
    //*************************************************//
    //*************************************************//
    public double getExamResult() {
        return examResult;
    }
    //*************************************************//
}
//***********************************END OF FILE****************************************//