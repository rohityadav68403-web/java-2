import java.util.Scanner;

public class Practice_13 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Age: ");
        int Age = input.nextInt();
        if(Age <= 13){
            System.out.print("Child: "+Age+" Years old");
        }
        else  if(Age <= 20){
            System.out.print("Teen: "+Age+" Years old");
        }
        else if (Age <= 60){
            System.out.print("Adult: "+Age+" Years old");
        }
        else {
            System.out.print("Senior: "+Age+" Years old");

        }
    }
}