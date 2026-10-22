import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Principle amuont: ");
        int p = input.nextInt();
        System.out.print("Now, Tell me your Rate of Enterest: ");
        float t = input.nextFloat();
        System.out.print("Now, Tell me for how many Years are you bording: ");
        float r = input.nextFloat();
        System.out.println("Simple Interest: "+((p*t*r)/100));
    }
}
