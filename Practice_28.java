import java.util.Scanner;

public class Practice_28 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number: ");
        int num = input.nextInt();
        int Sum = Sumdigit(num);
        System.out.println("Sum of Digit Is: "+Sum);
    }
    public static int Sumdigit(int num){
        int Sum = 0;
        while (num > 0){
            Sum += num % 10;
            num /= 10;

        }
        return Sum;
    }
}