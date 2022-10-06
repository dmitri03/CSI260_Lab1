public class ObjectArrayOperations implements IObjectArrayOperations {
    
    static Object[] copyArray;
    int startIndex;
    int endIndex;
    static int size;
    // static ArrayDisplay disp;

    public static Object[] Swap2Eles(Object[] array){

        ArrayDisplay.Display(array,true);
        
        size = array.length;
        Object ele1 = array[0];
        Object ele2 = array[1];
        Object eleN1 = array[size-2];
        Object eleN2 = array[size-1];

        array[0] = eleN1;
        array[1] = eleN2;
        array[size-2] = ele1;
        array[size-1] = ele2;

        ArrayDisplay.Display(array, false);

        return array;
    }

    // public static Object[] Swap2Ele(Object[] array){
    //     return null;
    // }

    
    public static Object[] RmFirstEl(Object[] array){
        ArrayDisplay.Display(array,true);
        size = array.length;
        copyArray = new Object[size-1];
        for (int i=1; i<size; i++) {
            copyArray[i-1] = array[i];
        }
        ArrayDisplay.Display(copyArray,false);
        return copyArray;
    }

    public static void GetMidEle(Object[] array){
        ArrayDisplay.Display(array,true);
        int middleIndex;
        middleIndex = Math.round(array.length/2)-1;
        Object midEle = array[middleIndex];
        System.out.print("Middle element: "+midEle+"\n");
    }

}