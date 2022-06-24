import java.util.Random;
import java.util.Scanner;

public class RandomNumGame {
    public static void main(String[] args) {
        System.out.println("Welcome to Anug's Random Number Game!");
        System.out.println("Please Select a number from 1-10 :");
        try (Scanner scanner = new Scanner(System.in);) {
            int num = 0;
            String numInput = scanner.nextLine();
            num = Integer.parseInt(numInput);

            if(num > generateRandomNumber()){ 
                System.out.println("You win!");
            }else{ 
                System.out.println("System wins! Better luck next time"); 
            }
        }

    }

    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(11);
    }
}
