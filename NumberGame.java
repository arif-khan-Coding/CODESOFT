import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {
        int maxAttempts = 6;
        int score = 0;
        int roundsWon = 0;

        Scanner sc = new Scanner(System.in);

        boolean playAgain = true;
        while (playAgain) {
            int numberToGuess = (int)(Math.random() * 100) +1;
            int attempts = 0;

            while (attempts < maxAttempts) {
                System.out.println("Enter your Guessed Number between 1 - 100 .");
                int guess = sc.nextInt();
                attempts++;

                if(guess == numberToGuess) {
                    System.out.println("Congratulation ! you guessed the correct Number in "+attempts+" attempts.");
                    score += maxAttempts - attempts;
                    roundsWon++;
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Too Low ! Try again.");
                } else {
                    System.out.println("Too High ! Try Again.");
                }
            }
            if (attempts == maxAttempts ) {
                System.out.println("Sorry , You didn't guess the correct Number .The Correct answer was "+numberToGuess);
            }
            System.out.println("Do you want to play again (Yes / No) : ");
            String str = sc.next();

            if(str.equalsIgnoreCase("no")) {
                playAgain = false;
            }
        }
        System.out.println("Your final score is "+score+" and you won "+roundsWon + " rounds.");
    }
}