package APlazuk.workshops;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumbers {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNumber = r.nextInt(100)+1;
        guessNumber(randomNumber);
    }
        public static void guessNumber(int randomNumber){

            Scanner scanner = new Scanner(System.in);
            System.out.print("Zgadnij liczbę: ");

            while (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("To nie jest liczba. Zgadnij liczbę");
            }
            int a = scanner.nextInt();

            //sprawdzanie warunków
            numberCheck(randomNumber, a);
        }

    private static void numberCheck(int randomNumber, int a) {
        if (a < randomNumber){
            System.out.println("Za mało!");
            guessNumber(randomNumber);
        } else if (a>randomNumber){
            System.out.println("Za dużo!");
            guessNumber(randomNumber);
        } else {
            System.out.println("Zgadłeś!");
        }
    }


}


