import java.util.Scanner;

public class Practice_20 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Your Number: ");
        int num = input.nextInt();
        if((num & 1) == 0){
            System.out.print("Even Number: "+num);
        }
        else {
            System.out.print("Odd Number: "+num);
        }

    }
}