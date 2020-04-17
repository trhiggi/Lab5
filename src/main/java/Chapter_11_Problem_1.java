/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tidal
 */
public class Chapter_11_Problem_1 {
    public static void main(String[] args) {
        double [] testScores = {98.3, 88.2, 22.1, 100.0};
        
        TestScores myTestScores = new TestScores(testScores);
        
       double average = myTestScores.getAverage(testScores); 
       System.out.println("The Average of the test scores was " + average);
    }
   
}
