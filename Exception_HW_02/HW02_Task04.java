/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
*/

package Exception_HW.Exception_HW_02;


import java.util.Scanner;


public class HW02_Task04 {
    public static void main(String[] args) {
        try {
            String input = getInputFromUser("Введите данные: ");
            if (input.isEmpty()) {
                throw new Exception("Пустая строка! Необходимо ввести данные! Порпобуйте еще раз. ");
            }
            System.out.println("Вы ввели следующие данные: " + input);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static String getInputFromUser(String text) {
        Scanner sc = new Scanner(System.in);
        System.out.print(text);
        return sc.nextLine();
    }
}
