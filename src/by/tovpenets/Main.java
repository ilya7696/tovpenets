package by.tovpenets;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var random = new Random();

        int userChoice, computerChoice;
        while(true) {
            System.out.println("1 -> Камень");
            System.out.println("2 -> Ножницы");
            System.out.println("3 -> Бумага");

            System.out.println("4 -> exit");

            userChoice = scanner.nextInt();
            String mappedUserChoice =
                    userChoice == 1 ? "Камень" :
                            userChoice == 2 ? "Ножницы" :
                                    userChoice == 3 ? "Бумага" : "Exit";

            System.out.println("mappedUserChoice: " + mappedUserChoice);


            if (userChoice == 4) {
                System.out.println("System exit!");
                break;
            }

            computerChoice = random.nextInt(3) + 1;
            String mappedComputerChoice =
                    computerChoice == 1 ? "Камень" :
                            computerChoice == 2 ? "Ножницы" : "Бумага";

            System.out.println("mappedComputerChoice: " + mappedComputerChoice);


            if (userChoice == computerChoice) {
                System.out.println("Ничья !");
                continue;
            }

            if (userChoice == 1) {
                System.out.println("User win!");
                continue;
            }

            if (userChoice == 2) { // пользователь выбрал ножницы
                if (computerChoice == 1) { // компьютер выбрал камень
                    System.out.println("Computer win!");
                } else { // компьютер выбрал бумагу
                    System.out.println("User win!");
                }
                continue;
            }

            if (userChoice == 3) { // пользователь выбрал бумагу
                System.out.println("Computer win!");
            }
        }
        scanner.close();
    }
}