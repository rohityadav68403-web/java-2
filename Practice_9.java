import java.util.Scanner;

public class Practice_9 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number: ");
        int a = input.nextInt();
        if(a > 0){
            System.out.print("Number Positive: "+a);
        }
        else if (a == 0){
            System.out.print("Number Negative: "+a);
        }
        else{
            System.out.print("Number Zero: "+a);
        }
    }
}