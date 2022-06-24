import java.util.Random;
import java.util.Scanner;

public class RandomNumGame {
    public static void main(String[] args) {
        System.out.println("Welcome to Anug's Random Number Game!");
        String[] explanationMessage = {
                "Easy : guess a number - program will tell you if it was higher or equal (you win) or lower (computer wins) than the program's number",
                "Meduim : guess a number - program will tell you if it was strictly higher (you win) or lower or equal (computer wins) than the program's number",
                "Hard : guess a number - program will tell you if it was equal (you win) or not (you lose) to the program's number"
        };

        System.out.println("Would you like to play Easy(e), Medium(m), Hard(h) : (input associated letter)");

        try (Scanner scanner = new Scanner(System.in);) {
            String levelInput = scanner.nextLine();

            if (levelInput.equals("e")) {
                System.out.println(explanationMessage[0]);
                easyVersion();  
            } else if (levelInput.equals("m")) {
                System.out.println(explanationMessage[1]);
                mediumVersion();
            } else if (levelInput.equals("h")) {
                System.out.println(explanationMessage[2]);
                hardVersion();
            } else {
                System.out.println("Not a valid key. Run program again");
            }

        }
    }

    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(11);
    }

    public static boolean rangeChecker(int args) {
        if (args > 10 || args < 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void easyVersion() {
        System.out.println("Please Select a number from 1-10 :");

        try (Scanner scanner = new Scanner(System.in);) {
            int num = 0;
            String numInput = scanner.nextLine();
            num = Integer.parseInt(numInput);

            if (rangeChecker(num)) {
                if (num > generateRandomNumber()) {
                    System.out.println("You win!");
                } else {
                    System.out.println("System wins! Better luck next time");
                }
            } else {
                System.out.println("You didnt pick a number in range");
            }
            
        }
    }

    public static void mediumVersion() {
        System.out.println("Please Select a number from 1-10 :");

        try (Scanner scanner = new Scanner(System.in);) {
            int num = 0;
            String numInput = scanner.nextLine();
            num = Integer.parseInt(numInput);

            if (num > generateRandomNumber()) {
                System.out.println("Your number was higher so you WIN!");
            }

            if (num <= generateRandomNumber()) {
                System.out.println("Your number was lower so you LOSE! System has won");
            }
        }
    }

    public static void hardVersion() {
        System.out.println("Please Select a number from 1-10 :");

        try (Scanner scanner = new Scanner(System.in);) {
            int num = 0;
            String numInput = scanner.nextLine();
            num = Integer.parseInt(numInput);

            if (num == generateRandomNumber()) {
                System.out.println("You win!");
            } else {
                System.out.println("System wins! Better luck next time");
            }
        }
    }
}
