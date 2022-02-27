package lesson1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] srgs) {
        Scanner scan = new Scanner(System.in);
        while (true) {

            System.out.println("введите число от 1 до 12 (введите 0 для выхода)");
            int i = scan.nextInt();
            if (i > 12 | i < 0) {
                System.out.println("неверный ввод");
                System.out.println("\n");
                continue;
            }
            if (i == 0) {
                System.out.println("досвидания)");
                return;
            }
            switch (i) {
                case 1 -> System.out.println("Зима: 12 - дек: 1 - янв: 2 - февр");
                case 2 -> System.out.println("Зима: 12 - дек: 1 - январь: 2 - февр");
                case 3 -> System.out.println("Весна: 3 - март: 4 - апрель: 5 - май");
                case 4 -> System.out.println("Весна: 3 - март: 4 - апрель: 5 - май");
                case 5 -> System.out.println("Весна: 3 - март: 4 - апрель: 5 - май");
                case 6 -> System.out.println("Лето: 6 - июнь: 7 - июль: 8 - август");
                case 7 -> System.out.println("Лето: 6 - июнь: 7 - июль: 8 - август");
                case 8 -> System.out.println("Лето: 6 - июнь: 7 - июль: 8 - август");
                case 9 -> System.out.println("Осень: 9 - сент: 10 - окт: 11 - ноябрь");
                case 10 -> System.out.println("Осень: 9 - сент: 10 - окт: 11 - ноябрь");
                case 11 -> System.out.println("Осень: 9 - сент: 10 - окт: 11 - ноябрь");
                case 12 -> System.out.println("Зима: 12 - дек: 1 - янв: 2 - февр");
            }
            if (i >= 3 && i <= 5) {
                System.out.println("Весна: 3 -март: 4 - апрель: 5 -май");
            } else if (i >= 6 && i <= 8) {
                System.out.println("лето: 6 - июнь: 7 - июль: 8- август");
            } else if (i >= 9 && i <= 11) {
                System.out.println("осень: 9 - сентябрь: 10 - октябрь: 11 - ноябрь");
            } else if (i >= 12 && i < 2)
            System.out.println("зима: 12 - декабрь: 1 - январь: 2 - февраль");
        }
    }
}