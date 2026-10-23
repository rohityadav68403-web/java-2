import java.util.Scanner;

public class Practice_8 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Fahrenheit(℉): ");
        float f = input.nextFloat();
        float C=(f-32)*5/9;
        System.out.print("Celsius(℃) "+C);
    }
}