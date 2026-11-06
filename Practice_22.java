public class Practice_22 {
    static void main() {
//        System.out.println("Code State");
//        greetUser();
//        System.out.println("Code Complete");
        PrintLift();
        //PrintRevese();
        //PrintRight();

    }
    public static void PrintLift() {
        int num = 0;
        while (num < 5){
            System.out.print("*");
            int i = 0;
            while (i < num){
                System.out.print(" *");
                i++;
            }
            System.out.println(" ");
            num++;

        }





    }
    public static void PrintRevese() {
                System.out.println("* * * * *");
                System.out.println("* * * *");
                System.out.println("* * *");
                System.out.println("* *");
                System.out.println("*");
    }
    public static void PrintRight() {
            System.out.println("        *");
            System.out.println("      * *");
            System.out.println("    * * *");
            System.out.println("  * * * *");
            System.out.println("* * * * *");
    }

    }
