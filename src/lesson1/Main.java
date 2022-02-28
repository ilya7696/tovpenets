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


    // Написать программу для вывода названия поры года по номеру месяца.
    // При решении используйте оператор if-else-if.

    private static void getTimeOfTheYearByMonthNumber() {
        var scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца!");
        int monthNumber = scanner.nextInt();

        String timeOfTheYear;
        if (monthNumber >= 3 && monthNumber <= 5) {
            timeOfTheYear = "Весна";
        } else if (monthNumber >= 6 && monthNumber <= 8) {
            timeOfTheYear = "Лето";
        } else if (monthNumber >= 9 && monthNumber <= 11) {
            timeOfTheYear = "Осень";
        } else if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
            timeOfTheYear = "Зима";
        } else {
            timeOfTheYear = "Неправильный ввод: " + monthNumber;
        }

        System.out.println("Пора года: " + timeOfTheYear);
        scanner.close();
    }


    // Напишите программу, которая будет принимать на вход число и на
    // выход будет выводить сообщение четное число или нет.
    // Для определения четности числа используйте операцию получения
    // остатка от деления - операция выглядит так: '% 2').

    private static void evenOrOdd() {
        var scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();

        // (условие, вернет true или false) ? (то что выполнится если true) : (то что выполнится если false)
        String result = number % 2 == 0 ? "Четное" : "Нечетное";
        System.out.println("Результат: " + result);

        scanner.close();
    }


    // Для введенного числа t (температура на улице) вывести
    // Если t>–5, то вывести «Тепло».
    // Если –5>= t > –20, то вывести «Нормально».
    // Если –20>= t, то вывести «Холодно».

    private static void hotOrCold() {
        var scanner = new Scanner(System.in);
        System.out.println("Введите температуру!");
        int temperature = scanner.nextInt();

        String result = "";
        if (temperature > -5) {
            result = "Тепло";
        } else if (-5 >= temperature && temperature > -20) {
            result = "Нормально";
        } else if (-20 >= temperature) {
            result = "Холодно";
        }

        System.out.println("Результат: " + result);

        scanner.close();
    }


    // По введенному номеру определить цвет радуги (1 – красный, 4 – зеленый и т. д.).
    private static void colorOfRainbowByNumber() {
        var scanner = new Scanner(System.in);
        System.out.println("""
                Введите номер цвета радуги!
                    1 -> красный
                    2 -> оранжевый
                    3 -> желтый
                    4 -> зеленый
                    5 -> голубой
                    6 -> синий
                    7 -> фиолетовый
                """);
        int numberOfColor = scanner.nextInt();

        String color =
                switch (numberOfColor) {
                    case 1 -> "Красный";
                    case 2 -> "Оранжевый";
                    case 3 -> "Желтый";
                    case 4 -> "Зеленый";
                    case 5 -> "Голубой";
                    case 6 -> "Синий";
                    case 7 -> "Фиолетовый";
                    default -> "Неправильный ввод: " + numberOfColor;
                };
        System.out.println("Цвет: " + color);
        scanner.close();
    }


    // При помощи цикла for вывести на экран нечетные числа от 1 до 99.
    // При решении используйте операцию инкремента (++).

    private static void forEven100() {
        for (int i = 0; i < 100; i++)
            if (i % 2 == 0) System.out.println(i);
    }

}

    // Необходимо вывести на экран числа от 5 до 1.
    // При решении используйте операцию декремента (--).

    private static void forFrom5To1() {
        for (int i = 5; i > 0; i--) System.out.println(i);
    }


    // Напишите программу, где пользователь вводит любое целое положительное число.
    // А программа суммирует все числа от 1 до введенного пользователем числа.
    // Для ввода числа воспользуйтесь классом Scanner.

    private static void forFrom1ToUserInput() {
        var scanner = new Scanner(System.in);
        System.out.println("Введите число!");
        int number = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i < number; i++) sum = sum + i;
        System.out.println("Сумма: " + sum);

        scanner.close();

    }

    // Необходимо, чтоб программа выводила на экран вот такую
    // последовательность: 7 14 21 28 35 42 49 56 63 70 77 84 91 98.
    // В решении используйте цикл while.

    private static void whileFrom7To98() {
        int number = 7;
        while (number <= 98) {
            System.out.println(number);
            number = number + 7;
        }
    }
    // Вывести 10 первых чисел последовательности 0, -5,-10,-15..

    private static void first10Numbers() {
        int number = 0;
        for(int i = 0; i < 10; i++) {
            System.out.println(number);
            number = number - 5;
        }}

    // Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
    private static void squareFrom10To20() {
        for (int i = 10; i <= 20; i++) System.out.println(i * i);
    }
}
}





