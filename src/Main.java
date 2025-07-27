import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String character;
        int number;
        String saysSomething;
        boolean trueOrFalse;

        System.out.print("Enter a character (name): ");
        character = scanner.nextLine();

        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer

        System.out.print("Enter something the character says: ");
        saysSomething = scanner.nextLine();

        System.out.print("Did it really happen? (true/false): ");
        trueOrFalse = scanner.nextBoolean();

        System.out.println("\nOne morning, " + character + " went for a walk.");
        System.out.println("They found " + number + " small boxes under a tree.");
        System.out.println(saysSomething + "!" + " they said.");
        System.out.println("A dog nearby started barking loudly.");
        System.out.println("Was all of this real? " + trueOrFalse + ".");
        System.out.println("It was a strange day.");
    }
}
