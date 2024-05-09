import java.util.Arrays;

public class passingfunction_array {
    public static void main(String[] args) {
        int[] num ={33,44,55,66,77};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }
    static void change(int[] arr){
        arr[0]=99;
    }
}