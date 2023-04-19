/*
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
 * и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. 
 * Если длины массивов не равны, необходимо как-то оповестить пользователя. 
 * Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
 */

public class hw1_4 {
    public static void main(String[] args) {
        
        int[] arr1 = {16, 5, 33, 0, 70};
        int[] arr2 = {9, 0, 11, 20};
        //int[] arr2 = {9, 0, 11, 20, 5};
        //int[] arr1 = null;
        int[] result = arrayDivision(arr1, arr2);
        for (int i : result) {
            System.out.print(i + " ");
        }

    }

    public static int[] arrayDivision(int[] arr1, int[] arr2){
        if (arr1 == null || arr2 == null){
            throw new RuntimeException("One or both of the arrays is null");
        }

        if(arr1.length != arr2.length){
            throw new RuntimeException("Arrays lengths are not equal");
        }
        
        int[] result = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                if(arr2[i]== 0){
                    throw new RuntimeException("Division by 0 is prohibited");
                }
                result[i] = arr1[i] / arr2[i];
            }
        return result;
    }


    
}
