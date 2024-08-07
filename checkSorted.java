import java.util.*;
public class checkSorted{
    public static void main(String[] args){

        int[] arr={1,2,3,4,5,6,2,4};
        // int num = 2;
        boolean isinc = increasing( arr);
        boolean isdec = decresing( arr);
        if(isinc || isdec){
            System.out.println("sorted");
        }else{
            System.out.println("Not sorted");
        }
    }      
    public static boolean increasing( int[] arr){
        int i=1;
        while(i<arr.length){
            if (arr[i]<=arr[i-1]){
                return false;
            }
            i++;
    }
    return true;
    }
     public static boolean decresing( int[] arr){
        int i=1;
        while(i<arr.length){
            if (arr[i]>=arr[i-1]){
                return false;
            }
            i++;
    }
    return true;
    }
}