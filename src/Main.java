import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int age;
        String name;
        boolean isStudent;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Are you a student? (true/false): ");
        isStudent = scanner.nextBoolean();

        // Block 1
        if (age >= 65) {
            System.out.println("You're a senior! 👴");
        }
        else if(age >= 18) {
            System.out.println("You are an adult! 🧑");
        } else if (age < 18) {
            System.out.println("You're a child! 🧒");
        } else if (age == 0) {
            System.out.println("You are a baby! 👶");
        } else {
            System.out.println("You haven't been born yet! 👼");
        }

        // Block 2
        if(name.isEmpty()) {
            System.out.println("You didn't enter your name! 😡");
        } else {
            System.out.println("Hello " + name);
        }

        // Block 3
        if(isStudent) {
            System.out.println("You're a student! 🏫");
        } else {
            System.out.println("You're NOT a student! 🏢");
        }
    }
}