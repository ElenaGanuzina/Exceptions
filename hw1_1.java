import java.util.Arrays;

/*Реализуйте 3 метода, чтобы в каждом из них получить разные исключения */

public class hw1_1 {
    public static void main(String[] args) {
        
        /*
        int[]arr = {7, 10, 0, 2};
        System.out.println(Arrays.toString(division(arr, 1)));
        */

        /*
        int[] numbers = {7, 10, 0, 2};
        System.out.println(isZero(numbers, 8));
        */

        //String name = "lkjsoie";
        String name = null;
        nameLength(name);
        
    }

    public static int[] division(int[] array, int num){
        if(num == 0){
            throw new ArithmeticException("Division by 0 is not permitted");
        }
        int[] arr = new int[array.length];
        for(int i = 0; i < array.length; i++){
            arr[i] = array[i]/num;
        }
        return arr;
    }

    public static boolean isZero(int[] array, int num){
        if(num > array.length){
            throw new ArrayIndexOutOfBoundsException("Non existing index");
        }
        
        if(array[num] == 0){
            return true;
        }else{
            return false;
        }
    } 

    public static void nameLength(String name){
        if(name == null){
            throw new NullPointerException("The name is null");
        }
        System.out.println(name.length());
    }
}
