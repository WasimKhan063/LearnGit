import java.util.*;
public class deleteInArray{
    public static void main(String[] args){

        int[] arr={2,4,6,2,6,2,9,8,5,2};
        int num = 2;
        int oc = occur(num, arr);
        // System.out.println(oc);
        newarr(arr,oc, num);
    }      
    public static int occur(int num, int[] arr){
        int i=0, j=0;;
        while(i<arr.length){
            if (num == arr[i]){
                j++;
            }
            i++;
        }
        return j;
    }
    public static void newarr(int[] arr,int num1,int num2){
        int len = arr.length-num1;
        int i=0;
        int j=0;
        int[] newarray = new int[arr.length-num1];
        while(i<arr.length){
            if(num2 != arr[i]){
                newarray[j]= arr[i];
                j++;
            }
            i++;
        }
        int k=0;
        while(k<newarray.length){
            System.out.print(newarray[k] + " ");
            k++;
        }
    }
}