package OasisInfoByte;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int Guessedno = rand.nextInt(100) + 1;
        int tries = 0;
        while (true) {
            System.out.println("Enter the number between 1-100:");
            int number = sc.nextInt();
            tries++;
            if (number >= 1 && number <= 100) {
                if (number == Guessedno) {
                    System.out.println("Entered no matches the Guessed no");
                    System.out.println("You took " + tries +" attempts to guess");
                    break;
                } else if (number > Guessedno) {
                    System.out.println("Entered no is higher than Guessed no");
                } else {
                    System.out.println("Entered no is lower than Guessed no");
                }
            }
            else
            {
                System.out.println("Invalid number has been entered,Enter the no in the range of 1-100");
            }
        }
    }
}
// COMMENT