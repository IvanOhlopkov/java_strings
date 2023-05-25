package practice.regex;

import java.util.Scanner;

public class PhoneCleanerRegex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                scanner.close();
                break;
            }

            // TODO:напишите ваш код тут, результат вывести в консоль.
            String regex = "[^0-9]";
            String result = input.replaceAll(regex, "");
            String message = "Неверный формат номера";
            if (result.length() == 11 && result.charAt(0) == '7') {
                System.out.println(result);
            }
            if (result.length() == 11 && result.charAt(0) == '8') {
                System.out.println(result.replaceAll(result.substring(0, 1), "7"));
            }
            if (result.length() == 11 && result.charAt(0) == '9') {
                System.out.println(message);
            }
            if (result.length() < 10) {
                System.out.println(message);
            }
            if (result.length() == 10) {
                result = 7 + result;
                System.out.println(result);
            }
            if (result.length() > 11) {
                System.out.println(message);
            }
        }
    }

}
