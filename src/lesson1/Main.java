package lesson1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] srgs) {

        var scanner = new Scanner(System.in);

        System.out.println("Введите номер месяца!");
        var monthNumber = scanner.nextInt();

        String monthName =
                switch (monthNumber) {
                    case 1 -> "Январь";
                    case 2 -> "Февраль";
                    case 3 -> "Март";
                    case 4 -> "Апрель";
                    case 5 -> "Май";
                    case 6 -> "Июнь";
                    case 7 -> "Июль";
                    case 8 -> "Август";
                    case 9 -> "Сентябрь";
                    case 10 -> "Октябрь";
                    case 11 -> "Ноябрь";
                    case 12 -> "Декабрь";
                    default -> "Неправильный ввод: " + monthNumber;
                };
        System.out.println("Имя месяца: " + monthName);
        scanner.close();
    }
}