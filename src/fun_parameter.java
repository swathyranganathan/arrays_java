import java.util.Scanner;

public class fun_parameter {
    public static void main(String[] args) {
        int answer = sum(66,89);
        System.out.println(answer);

        String message= mygreet("swathy");
        System.out.println(message);

        Scanner input=new Scanner(System.in);
        System.out.println("enter the word: ");
        String newmessage=input.next();
        String update=messu(newmessage);
        System.out.println(update);

    }
    //passing the value of numbers when you are calling the method in main()
    static int sum(int a, int b){
        int ans = a+b;
        return ans;
    }
    //String Function
    static String mygreet(String naam){  //
        String mes = "Hello "+naam;
        return mes;
    }

    static String messu(String newmessage){
        String m="your message:  "+newmessage;
        return m;
    }

    //  In java there is no "pass by reference" only "pass by value"

}
