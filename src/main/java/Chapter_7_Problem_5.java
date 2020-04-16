
public class Chapter_7_Problem_5 {
    public static void main(String[] args) {
     int[] integerArray = {1,2,3,4,5,6,7,8,9,10};   
     int number = 5;
     
     int[] greaterNumbers = numbersLargerThanN(integerArray, number);
     for(int index = 0; index < greaterNumbers.length; index++){
         if (greaterNumbers[index] != 0){
         System.out.println(greaterNumbers[index]);
         }
     }
    }
    
    public static int [ ] numbersLargerThanN(int[] integerArray, int number) {
        int[] arrayToBeReturned = new int[integerArray.length];
        int arrayToBeReturnedIndex = 0;
        
        for(int index = 0; index < integerArray.length; index++)
            if (integerArray[index] > number){
            arrayToBeReturned[arrayToBeReturnedIndex] = integerArray[index];
            arrayToBeReturnedIndex++;
            }
           return arrayToBeReturned;
}
    
}
