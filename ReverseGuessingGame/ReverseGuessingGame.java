import java.util.Scanner;

public class ReverseGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int low = 1;
        int high = 100;
        int attempts = 0;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");

        while (low <= high) {
            int guess = (low + high) / 2;
            attempts++;

            System.out.println("Is your number " + guess + "?");
            System.out.print("Type 'low' if my guess is too low, 'high' if too high, or 'correct': ");
            String feedback = scanner.nextLine().toLowerCase();

            if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed it in " + attempts + " attempts.");
                break;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else {
                System.out.println("Please type only: low, high, or correct.");
            }
        }

        scanner.close();
    }
}
