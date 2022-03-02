package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // arrayPlusUserInput();
        // chess();
        // multiplyElementsOfArray();
        // sumOfArray();
        // printDiagonalOfArray();
        // sortArray();
    }


    // Создать трехмерный массив из целых чисел.
    // С помощью циклов пройтись по всему массиву и увеличить каждый элемент на заданное число.
    // Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.
    private static void arrayPlusUserInput() {
        var scanner = new Scanner(System.in);
        int[][][] ints = {
                {
                        {1, 2, 3, 4},
                        {4, 13, 532, 2, -12}
                },
                {
                        {45, 123, 33, -231},
                        {323, 12, 562, -456, -12}
                }
        };

        printArray(ints);

        System.out.println("\n\nВведите число для увеличения!");
        int input = scanner.nextInt();


        for (int i = 0; i < ints.length; i++) {
            int[][] firstInts = ints[i];

            for (int j = 0; j < firstInts.length; j++) {
                int[] secondInts = firstInts[j];

                for (int k = 0; k < secondInts.length; k++) {
                    int num = secondInts[k];

                    System.out.printf("Элемент:\n  i = %d\n  j = %d\n  k = %d\n  num = %d\n\n", i, j, k, num);

                    secondInts[k] = num + input;
                }
            }
        }

        printArray(ints);

        scanner.close();
    }

    private static void printArray(int[][][] array) {
        System.out.print("[");

        for (int[][] firstInts : array) {
            System.out.print("  [\n");
            for (int[] secondInts : firstInts) {
                System.out.print("      [");
                for (int secondInt : secondInts) {
                    System.out.print("{");
                    System.out.print(secondInt + "}");
                }
                System.out.print("]\n");
            }
            System.out.print("  ]\n");
        }

        System.out.print("]\n");
    }

    //Шахматная доска
    //    Создать программу для раскраски шахматной доски с помощью цикла.
    //    Создать двумерный массив String'ов 8х8. С помощью циклов задать
    //    элементам циклам значения B(Black) или W(White). Результат работы
    //    программы:
    //    W B W B W B W B
    //    B W B W B W B W
    //    W B W B W B W B
    //    B W B W B W B W
    //    W B W B W B W B
    //    B W B W B W B W
    //    W B W B W B W B
    //    B W B W B W B W
    private static void chess() {
        String[][] chess = new String[8][8];
        for (int i = 0; i < chess.length; i++) {
            String[] row = chess[i];
            for (int j = 0; j < row.length; j++) {
                System.out.print(
                        row[j] = i % 2 == 0
                                ? j % 2 == 0 ? "W " : "B "
                                : j % 2 == 0 ? "B " : "W ");
            }
            System.out.println();
        }
    }

    // Умножение двух матриц
    //    Создайте два массива целых чисел размером 3х3 (две матрицы).
    //    Напишите программу для умножения двух матриц.
    //    Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
    //    Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
    //    Ожидаемый результат: 1 2 3 1 1 1 0 0 0
    private static void multiplyElementsOfArray() {
        int[][] mB = {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}
        };

        int[][] mA = {
                {1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}
        };

        int[][] res = new int[mA.length][mB[0].length];

        for (int i = 0; i < mA.length; i++)
            for (int j = 0; j < mB[0].length; j++)
                for (int k = 0; k < mB.length; k++)
                    res[i][j] += mA[i][k] * mB[k][j];

        for (int[] re : res) {
            for (int j = 0; j < res[0].length; j++)
                System.out.format("%6d ", re[j]);
            System.out.println();
        }
    }

    // Создайте двумерный массив целых чисел.
    // Выведите на консоль сумму всех элементов массива.
    private static void sumOfArray() {
        int[][] ints = {
                {1, 2, 3, 4},
                {4, 13, 532, 2, -12},
                {45, 123, 33, -231},
                {323, 12, 562, -456, -12}
        };

        long sum = 0;

        for (int[] numbers : ints)
            for (int number : numbers)
                sum += number;

        System.out.println("Сумма: " + sum);
    }

    // Создайте двумерный массив.
    // Выведите на консоль диагонали массива.
    private static void printDiagonalOfArray() {
        int[][] ints = {
                {1,   2,   3,   4},
                {4,   13,  532, -12},
                {45,  123, 33,  -231},
                {323, 12,  562, -456}
        };

        System.out.println("Сверху слева вниз вправо");
        for (int i = 0, index = 0; i < ints.length; i++, index++)
            for (int j = 0; j < ints[i].length; j++)
                if (index == j)
                    System.out.print(ints[i][j] + " ");

        System.out.println("\nСверху справа вниз влево");
        for (int i = 0, index = ints.length-1; i < ints.length; i++, index--)
            for (int j = 0; j < ints[i].length; j++)
                if (index == j)
                    System.out.print(ints[i][j] + " ");
    }

    // Создайте двумерный массив целых чисел.
    // Отсортируйте элементы в строках двумерного массива по возрастанию.
    private static void sortArray() {
        int[][] ints = {
                {1,   2,   3,   4},
                {4,   13,  532, -12},
                {45,  123, 33,  -231},
                {323, 12,  562, -456}
        };

        for (int i = 0; i < ints.length; i++) {
            int[] numbers = ints[i];
            Arrays.sort(numbers);
            ints[i] = numbers;
        }
        System.out.println("[");
        for (int[] numbers : ints) {
            System.out.print("    [");

            for (int number : numbers)
                System.out.print("{" + number + "} ");

            System.out.println("]");
        }
        System.out.println("]");
    }
}