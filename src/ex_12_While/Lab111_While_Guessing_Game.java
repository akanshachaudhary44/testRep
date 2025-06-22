package ex_12_While;
import java.util.Random;
import java.util.Scanner;

public class Lab111_While_Guessing_Game {
    public static void main(String[] args) {
        //Guess a no 1 to 100
        //Random = 1 to 100
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; //0 to 100
        System.out.println(numberToGuess);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int guess;
        int attempts = 0;
        while (true) {
            System.out.println("Enter the guess");
            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low, try again");
            }
            else if(guess>numberToGuess)
            {
                System.out.println("Too high, try again");
            }
            else {
                System.out.println(attempts);
                break;
            }
        }




    }
}
