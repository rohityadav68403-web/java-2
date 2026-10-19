import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Please Enter The A: ");
        int a = input.nextInt();
        System.out.print("Please Enter The B: ");
        int b = input.nextInt();
        System.out.print("Please Enter The C: ");
        int c = input.nextInt();
        System.out.print("Please Enter The D: ");
        int d = input.nextInt();
        System.out.println("Perimeter: "+(a+b+c+d)+"cm");
    }
} 