import java.util.Random;

public class RandomNumGame {
    public static void main(String[] args) {
        System.out.println("Welcome to Anug's Random Number Game!");
        System.out.println("Please Select a number from 1-10 :");
        // System.out.println(generateRandomNumber());

    }

    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(11);
    }
}
