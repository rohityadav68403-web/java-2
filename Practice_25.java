import java.util.Scanner;

public class Practice_25 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Number: ");
        int num = input.nextInt();
        int i = 1;
        while (i <= 10){
            System.out.println(num + "X" + i +"="+(num*i));
            i++;
        }
    }
}