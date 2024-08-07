import java.util.*;
public class AVGofArray{
    public static void main(String[] args){
        int[] arr = {2,3,56,76,43,2,65,45,6,6,563,544};
        // int[] arr = {10,20,30};
        int avg = average(arr);
        System.out.println(avg);
    }
    public static int average(int[] arr){
        // System.out.print(arr[3]);
        int i=0;
        int sum=0;
        // System.out.println(arr.length);
        while(i<arr.length){
             sum = sum + arr[i];
            i++;
        }
        // System.out.println(sum);
        return (sum/arr.length);
    }
}