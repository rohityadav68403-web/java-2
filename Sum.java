import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter The First Number: ");
        int numFirst = sc.nextInt();
        System.out.print("Please Enter The Second Number: ");
        int numSecond = sc.nextInt();
        int Sum = numFirst+numSecond;
        System.out.println(Sum);
    }
    
}