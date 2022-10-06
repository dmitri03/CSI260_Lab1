public class App {
    public static void main(String[] args){
        System.out.println("Randomly generated elements from an array of random (up to 100) length");        //show array
        Object[] array = NumArrayOperations.InitiateArray();
        System.out.println("#1 -- Write a java method that swaps the first 2 elements of an array with the last 2 elements");
        ObjectArrayOperations.Swap2Eles(array);        
        System.out.println("#2 -- Write a method to return the elements in the middle of the array. If the array has an event number of elements, you will have 2 middle elements. Return the first one.");
        ObjectArrayOperations.GetMidEle(array);
        System.out.println("#3 -- Write a method that removes the first element of an array. Knowing that you cannot have empty cell within an array. So you will have to fill the empty spot by shifting process");
        ObjectArrayOperations.RmFirstEl(array);
        System.out.println("#4 -- Write a method to the average value of only the odd ones.");
        NumArrayOperations.AverageOddNums(array);
    }
}
