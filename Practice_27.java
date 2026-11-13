import java.util.Scanner;

public class Practice_27 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number: ");
        int num = input.nextInt();
        long fact = Factorile(num);
        System.out.println("Factorile is: " +fact);
    }
    public static long Factorile(int num){
        if (num < 2){
            return 1;
        }
        long fact = 1;
        int i = 2;
        while (i <= num){
            fact *= i;
            i++;
        }
        return fact;

    }
}