 //--------------------------------------------------TASK 1




import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 7;
        int totalAttempts = 0;
        int roundsWon = 0;
        //DISPLAY  A STATEMENT RELATED TO THE TASK & TASK(GAME) INSTRUCTIONS ! HERE THE TASK IS NUMBER GAME
        System.out.println("Welcome to the my Number Guessing Game!");
        System.out.println("You have " + maxAttempts + " attempts to guess the number between " + minRange + " and " + maxRange + ".");
        
        boolean playAgain = true;

        // HERE DISPLAY GAME LOOP
        
        while (playAgain) {
            //HERE GENERATE THE RANDOM NUMBER FOR THE USER TO GUESS.
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            boolean roundWon = false;
            
            System.out.println("New Round: Guess the number!");
            
            while (attempts < maxAttempts) {
                int userGuess = getUserGuess(scanner, minRange, maxRange);
                attempts++;

                //DISPLAY IF USER'S GUESS IS RIGHT(CORRECT) THEN ALSO DISPLAY BELOW MESSAGE.
                
                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    totalAttempts += attempts;
                    roundsWon++;
                    roundWon = true;
                    break;
                    //EXIT THE ROUND IF THE GUESS IS CORRECT.
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Please Try again....");
                } else {
                    System.out.println("Too high! Please Try again....");
                }
            }
            // here inform the user when they run out of the game(attempts).
            if (!roundWon) {
                System.out.println("Out of attempts. The correct number was: " + targetNumber);
            }
            
            playAgain = playAnotherRound(scanner);
        }
        // here display game over message.
        
        System.out.println("Game Over!");
        System.out.println("Rounds won: " + roundsWon);
        System.out.println("Total attempts made: " + totalAttempts);
    }
    
    private static int getUserGuess(Scanner scanner, int minRange, int maxRange) {
        int guess;
        while (true) {
            System.out.print("Enter your guess (" + minRange + " - " + maxRange + "): ");
            guess = scanner.nextInt();
            if (guess >= minRange && guess <= maxRange) {
                return guess;
            } else {
                System.out.println("Please enter a valid number within the range.");
            }
        }
    }
    
    private static boolean playAnotherRound(Scanner scanner) {
        while (true) {
            System.out.print("Play another round? (yes/no): ");
            String response = scanner.next().toLowerCase();
            if (response.equals("yes")) {
                return true;
            } else if (response.equals("no")) {
                return false;
            }
        }
    }
}