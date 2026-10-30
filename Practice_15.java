import java.util.Scanner;

public class Practice_15 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The First Number: ");
        int a = input.nextInt();
        System.out.print("Please Enter The Second Number: ");
        int b = input.nextInt();
        System.out.print("Bitwise OR Operator: "+(a|b));
    }
}