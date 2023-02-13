import java.util.Scanner;

public class Calculator {
            public static void main(String[] args) {
        int n = 0;
        Scanner s = new Scanner(System.in);
            System.out.println("Enter first number");
            int a = s.nextInt();
            System.out.println("Enter first number");

            int b = s.nextInt();
        do {
            System.out.println("Enter 1 for addition \n Enter 2 for subtraction \n Enter 3 for multiplication \n Enter 4 for division \n Enter 5 for Exit");

            n = s.nextInt();
            if(n==5){
                System.out.println(" Exiting the program now ");
            break;
            }


            switch (n) {
                case 1:
                    add(a, b);
                    break;
                case 2:
                    sub(a, b);
                    break;
                case 3:
                    mul(a, b);
                    break;
                case 4:
                    div(a, b);
                    break;
                default:
                System.out.println("Enter valid option");
                break;
            }

        } while(n!=5);}
        public static void add(int a1,int b1)
    {
        int c=a1+b1;
        System.out.println("Addition of " + a1 + " and " + b1 + " is = " + c);
    }
    public static void sub(int a1,int b1)
    {
        int c=a1-b1;
        System.out.println("Subtraction of " + a1 + " and " + b1 + " is = " + c);
    }
    public static void mul(int a1,int b1)
    {
        int c=a1*b1;
        System.out.println("Multiplication of " + a1 + " and " + b1 + " is = " + c);
    }
    public static void div(int a1,int b1)
    {
        int c=a1/b1;
        System.out.println("Division of " + a1 + " and " + b1 + " is = " + c + " and remainder is " + a1%b1);
    }
}
