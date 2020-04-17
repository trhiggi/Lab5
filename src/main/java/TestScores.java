/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tidal
 */
public class TestScores {
       private double testScores[];

    public TestScores(double[] testScores) {
        this.testScores = testScores;
    }

    public double[] getTestScores() {
        return testScores;
    }

    public void setTestScores(double[] testScores) throws InvalidTestScoreException {
      for(int index = 0; index < testScores.length; index++){
      if(testScores[index] < 0 || testScores[index] >100){
      throw new InvalidTestScoreException("This array contains test scores that are not valid.");
      }
      else
        this.testScores = testScores;
      }
    }
    public static double getAverage(double[] testScores){
        double total = 0;
        for(int index = 0; index < testScores.length; index++){
            total = total + testScores[index];        
        
        }
      int arrayLength = testScores.length;
      double average = total / arrayLength;
      return average;
    }
}


