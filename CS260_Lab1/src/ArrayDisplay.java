public class ArrayDisplay implements IArrayDisplay {

    public static void Display(Object[] array, boolean begin){
        if(begin == true){System.out.println("Beginning Array:");}
        else{System.out.println("End Array:");}
        int count = 1;
        for (Object object : array) {
            System.out.println("#"+count+": "+object);
            count++;
        }
        System.out.println("\n"+"\n");
    }
        
}
