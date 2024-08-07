import java.util.*;
public class pattern2{
    public static void main(String[]args){
        pattern();
    }
    public static void pattern(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int num = sc.nextInt();
        int i= 1;
        while(i<(num+1)){
            int j=num;
            while(j>=i){
                System.out.print(" *");
                j--;
            }
            System.out.println();
            i++;
        }
    }
}