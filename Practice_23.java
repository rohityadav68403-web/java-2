import java.util.Scanner;

public class Practice_23 {
    public static void main(String[] args) {
        greet();
        int a = readNumber();
        int b = readNumber();

        System.out.println("Sum of the numbers is: " +(a+b));
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int number = input.nextInt();
        return number;
    }

    public static void greet() {
        System.out.println("Welcome to Calculator\n");
    }


}