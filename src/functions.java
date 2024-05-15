import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        //Q: take two input and print the sum
        sum();
        //returning a interger
        int ans= sum2();
        System.out.println("the sum is:"+ans);
        //returning a string
        String message = greet();
        System.out.println("the message :"+message);
    }
    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number: ");
        int num1=input.nextInt();
        System.out.println("enter second number: ");
        int num2 = input.nextInt();
        int sum = num1+num2;
        System.out.println("the sum is:"+sum);
    }
    static int sum2(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number: ");
        int num1=input.nextInt();
        System.out.println("enter second number: ");
        int num2 = input.nextInt();
        int sum = num1+num2;
        return sum;

    }
    static String greet(){
        String greeting="hello";
        return greeting;
    }
}
