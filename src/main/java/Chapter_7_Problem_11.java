/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tidal
 */
public class Chapter_7_Problem_11 {
    public static void main(String[] args) {
       double [] numberArray = {1.0,2.0,3.0,4.0,5.0};
       
       double total = getTotal(numberArray);
       System.out.println("The Total of the array is " + total);
       
       double average = getAverage(numberArray);
       System.out.println("The Average of the array is " + average);

       double highestNumber = getHighest(numberArray);
       System.out.println("The highest number in the array is " + highestNumber);
       
       double lowestNumber = getLowest(numberArray);
       System.out.println("The lowest number in the array is " + lowestNumber);
        
        
    }
    
    public static double getTotal(double[] numbers){
    double total = 0;
        for(int index = 0; index < numbers.length; index++){
            total = total + numbers[index];        
        
        }
    return total;
    }
    
    public static double getAverage(double[] numbers){
    double total = getTotal(numbers);
      int arrayLength = numbers.length;
      double average = total / arrayLength;
      return average;
    }
    
    public static double getHighest(double [] numbers){
    double highestNumber = numbers[0];
    
     for(int index = 0; index < numbers.length; index++){
            if (numbers[index] > highestNumber){
           highestNumber = numbers[index]; 
           
            }        
        
        }
    return highestNumber;
    }
       public static double getLowest(double [] numbers){
    double lowestNumber = numbers[0];
    
     for(int index = 0; index < numbers.length; index++){
            if (numbers[index] < lowestNumber){
           lowestNumber = numbers[index]; 
           
            }        
        
        }
    return lowestNumber;
    }
}
