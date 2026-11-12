import java.util.Scanner;

public class Shorthand {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The First Number: ");
        int a = input.nextInt();
        System.out.print("Please Enter The Second Number: ");
        int b = input.nextInt();
        b+=a;
        System.out.println(b);
        b-=a;
        System.out.println(b);
        b*=a;
        System.out.println(b);
        b/=a;
        System.out.println(b);
        b%=a;
        System.out.println(b);
    }
}