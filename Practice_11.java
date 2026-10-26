import java.util.Scanner;

public class Practice_11 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Year: ");
        int Year = input.nextInt();
        if(Year % 400 == 0 || (Year % 4 == 0 && Year % 100 != 0)){
            System.out.print("Leap Year: "+Year);
        }
         else{
            System.out.print("Not Leap Year: "+Year);
        }
    }
}