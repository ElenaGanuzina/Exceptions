import java.util.Arrays;

/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
Если длины массивов не равны, необходимо как-то оповестить пользователя. 
*/

public class hw1_3 {
    public static void main(String[] args) {
        
        int[] arr1 = {2, 56, 7, 12, 0};
        int[] arr2 = {5, 5, 11, 3};
        //int[] arr2 = {5, 5, 11, 3, 2};
        System.out.println(Arrays.toString(arrayDifference(arr1, arr2)));
        

    }

    public static int[] arrayDifference(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length){
            throw new RuntimeException("Arrays lengths are not equal");
        }
        int[] result = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                result[i] = arr1[i] - arr2[i];
            }
        return result;
    }
}
