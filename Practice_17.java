import java.util.Scanner;

public class Practice_17 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Your Number: ");
        int a = input.nextInt();
        System.out.print("Bitwise NOT Operator: "+(~a));
    }
}