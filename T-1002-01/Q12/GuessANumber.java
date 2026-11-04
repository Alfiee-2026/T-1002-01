package Q12;

public class GuessANumber {
    public static void main(String[] args) {
        int numberToGuess = (int) (Math.random() * 100) + 1;
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Welcome to Guess a Number!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfTries++;

            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number " + numberToGuess + " in " + numberOfTries + " tries.");
            }
        }
        scanner.close();
    }
    
}
