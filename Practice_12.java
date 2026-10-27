import java.util.Scanner;

public class Practice_12 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter The Marks: ");
        float Mark = input.nextFloat();
        if(Mark >= 90){
            System.out.print("Grade A:  "+Mark);
        }
        else  if(Mark >= 75){
            System.out.print("Grade B: "+Mark);
        }
        else if (Mark >= 60){
            System.out.print("Grade C: "+Mark);
        }
        else if(Mark >= 30){
            System.out.print("Grade D: "+Mark);
        }
        else {
            System.out.print("Grade F: "+Mark);

        }
    }
}