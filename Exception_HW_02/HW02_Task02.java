/*
Если необходимо, исправьте данный код

try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}

В изначальном коде исправлена ошибка деления на ноль. 
В блоке try происходит попытка деления элемента массива intArray[8] на переменную d, 
которая равна нулю. Такое деление вызывает исключение ArithmeticException. 
В блоке catch этот тип исключения перехватывается и выводится сообщение "Catching exception: " + e, 
где e - объект исключения. 
В коде все в порядке, кроме одного - переменная intArray не была объявлена и инициализирована
*/

package Exception_HW.Exception_HW_02;

public class HW02_Task02 {
    public static void main(String[] args) {
        try {
            int[] intArray = { 25,45,85,6,74,321 }; // объявление и инициализация массива
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    } 
}
