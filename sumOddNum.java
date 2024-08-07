//1 to specified no.
// An = a+(n-1)d
// Sn = (n/2)(a+l)
import java.util.*;
public class sumOddNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last odd no.");
        int l = sc.nextInt();
          // Total odd no. between 1 to l
        int n = (l-1)/2 + 1;
        System.out.println("Total odd no. between 1 to "+ l + "= " + n);
        // sum of n odd no from 1 to l
        int sum = (n/2)*(1+l);
        System.out.println(sum);
        int oddsum = oddsum(l);
        System.out.println(oddsum);
    }
    public static int oddsum(int a ){
        int num = a;
        int i = 1;
        int sum=0;
        while(i<=num){
            sum += i;
            i += 2;
        }
        return sum;
    }
}
