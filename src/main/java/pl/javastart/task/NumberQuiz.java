package pl.javastart.task;

import java.util.Scanner;

public class NumberQuiz {
    private Scanner scanner = new Scanner(System.in);
    private int userInput;
    private int minNumber = 100;
    private int maxNumber = 200;

    public void setMinNumber(int minNumber) {
        this.minNumber = minNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public void start() {
        do {
            getUserInput();

            if (isInRange()) {
                if (isDivisibleBy3()) {
                    System.out.println("Twoja liczba " + userInput + " jest OK");
                } else {
                    System.out.println("Liczba nie jest podzielna przez 3");
                }
            } else if (userInput < minNumber) {
                System.out.println("Podana liczba jest za mała");
            } else {
                System.out.println("Podana liczba jest za duża");
            }
        } while (!isInRange() || !isDivisibleBy3());

        closeScanner();
    }

    private void getUserInput() {
        System.out.println("Podaj liczbę");
        userInput = scanner.nextInt();
    }

    private boolean isDivisibleBy3() {
        return userInput % 3 == 0;
    }

    private boolean isInRange() {
        return userInput >= minNumber && userInput <= maxNumber;
    }

    private void closeScanner() {
        scanner.close();
    }
}
