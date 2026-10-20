import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Your Base in cms: ");
        double a = input.nextDouble();
        System.out.print("Please Enter The Your Height in css: ");
        double b = input.nextDouble();
        System.out.println("The Area Of Treangle is: "+((a*b)/2));

    }
}