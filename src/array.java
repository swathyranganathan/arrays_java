import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0]=34;
        arr[1]=87;
        arr[2]=78;
        arr[3]=98;
        arr[4]=87;
        System.out.println(arr[4]);
        int[]a=new int[5];
        Scanner input =new Scanner(System.in);
        System.out.println("enter 5 integers:");
        for(int i=0;i< a.length;i++){
            a[i]=input.nextInt();
            System.out.print(a[i] + " ");

        }
    }
}
