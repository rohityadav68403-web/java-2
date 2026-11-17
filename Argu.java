import java.util.OptionalInt;

public class Argu {
    static void main(String[] args) {
        System.out.println(SumTwoNumber(21,56));
        System.out.println(SumTwoNumber(11,15));
        System.out.println(SumTwoNumber(-56,56));



    }

    static int SumTwoNumber(int First,int Second) {
        System.out.println("Please First Number Received: "+First);
        System.out.println("Please Second Number Received: "+Second);

        return First + Second;

    }
}