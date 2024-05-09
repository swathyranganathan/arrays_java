import java.util.Arrays;
import java.util.Scanner;

public class twoD_array {
    public static void main(String[] args) {
        //column with diff length
        int[][] array={
                {2,2,3},  //0th index
                {4,5,6},   //1s index
                {7,8,9,1,10}    //2nd index
        };
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("enter the array of numbers:");
        int[][] arr = new int[3][3];
        //input
        Scanner input= new Scanner(System.in);
       // int [][] arr= input.nextInt()   //don't use int cannot be converted to int[][]
        for(int row=0;row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=input.nextInt();
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();

        }
        //another way
        for (int r=0;r<arr.length;r++){
            System.out.println(Arrays.toString(arr[r]));
        }
        //enhanced for loop
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }


    }
}
