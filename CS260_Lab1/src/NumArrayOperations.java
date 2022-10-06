import java.util.Random;

public class NumArrayOperations implements INumArrayOperations{
    
    static Random rand = new Random();

    public static void AverageOddNums(Object[] array){
        double total = 0;
        int oddCount = 0;
        int size = array.length;
        double average;
        System.out.println("The odd numbers: ");
        for(int i=0; i<size; i++){
            if(((Integer)array[i])%2!=0){
                total = total + (Integer)array[i];
                oddCount++;
                System.out.print(array[i]+"; ");
            }
        }
        average = total/oddCount;
        System.out.println("The average of all the odd numbers: "+ average);
    }
    public static Object[] InitiateArray(){
        int randSize = rand.nextInt(100);
        Object[] randArray = new Object[randSize];
        for(int i = 0; i<randArray.length; i++){
            randArray[i] = rand.nextInt(1000);    
        }
        ArrayDisplay.Display(randArray, false);
        System.out.println("The size of an array: "+randSize);
        return randArray;
    }
}
