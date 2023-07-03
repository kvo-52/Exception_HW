/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
Если длины массивов не равны, необходимо как-то оповестить пользователя.
*/

package Exception_HW.Exception_HW_01;

public class HW01_Task02 {
     public static void main(String[] args) {
        int[] result = subtractArrays(new int[]{21, 34, 74, 59, 6, 17}, new int[]{3, 44, 15, 6, 7});
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] subtractArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }
        
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }

        return result;
    }
}
