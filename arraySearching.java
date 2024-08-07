import java.util.*;
public class arraySearching{
    public static void main(String[] args){
       
        System.out.println("Enter the number you want to search");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        find(num);
    }
    public static void find(int num){
         int[] arr = {88,66,44,77,37,57,37,58,82,19,47,59,37,84};
        int i=0;
        while(i<= arr.length){
            int num2 = arr[i];
            i++;
            if(num2==num){
                System.out.println("Number found at position: "+(i+1));
                break;
            }
        }
    }
}