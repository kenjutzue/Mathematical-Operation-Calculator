import java.util.Scanner;

class MathOp {
    public void addition(int num1, int num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    public void subtraction(int num1, int num2) {
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    public void multiplication(int num1, int num2) {
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }

    public void division(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Dividend cannot be zero!!");
            return;
        }
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MathOp algorithm = new MathOp();
        int choice;
        int num1, num2;

        do {
            menu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice < 5) {
                System.out.print("Please enter two numbers.\nNum1: ");
                num1 = scanner.nextInt();
                System.out.print("Num2: ");
                num2 = scanner.nextInt();
            } else {
                num1 = num2 = 0; // Default values if choice is invalid
            }

            switch (choice) {
                case 1:
                    algorithm.addition(num1, num2);
                    break;
                case 2:
                    algorithm.subtraction(num1, num2);
                    break;
                case 3:
                    algorithm.multiplication(num1, num2);
                    break;
                case 4:
                    algorithm.division(num1, num2);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            if (choice != 5) {
                System.out.println("Press Enter to return to Menu.");
                scanner.nextLine(); // Consume the newline character
                scanner.nextLine(); // Wait for user to press Enter
            }

        } while (choice != 5);

        scanner.close();
    }

    public static void menu() {
        System.out.println("===============================");
        System.out.println("|   Mathematical Operation   |");
        System.out.println("===============================");
        System.out.println(" 1.) Addition ");
        System.out.println(" 2.) Subtraction ");
        System.out.println(" 3.) Multiplication ");
        System.out.println(" 4.) Division ");
        System.out.println(" 5.) Exit ");
        System.out.println("*******************************");
    }
}
