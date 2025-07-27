import java.util.Scanner;

public class Main {
    public  static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        boolean isStudent = false;
        String favoriteSubject;
        double cgpa;
        char grade;

        System.out.print("What is your name: ");
        name = scanner.nextLine();

        System.out.print("Are you a student? (true/false): ");
        isStudent = scanner.nextBoolean();
        scanner.nextLine();

        System.out.print("Which is your favorite subject: ");
        favoriteSubject = scanner.nextLine();

        System.out.print("Enter your cgpa: ");
        cgpa = scanner.nextDouble();

        System.out.print("Enter your favorite subject's grade: ");
        grade = scanner.next().charAt(0);

        System.out.println("\nYour name is: " + name);
        System.out.println("You are a student: " + isStudent);
        System.out.println("Your favorite subject is: " + favoriteSubject);
        System.out.println("Your cgpa is: " + cgpa);
        System.out.println("Your favorite subject's grade is: " + grade);
    }
}