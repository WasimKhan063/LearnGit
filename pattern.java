import java.util.*;

public class pattern{
    public static void main(String[] args){
        rightangularpiramid1();
        rightangularpiramid2();
    }
    public static void rightangularpiramid1(){  
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();

        int r = 1;
        while(r <= rows){
            System.out.print(r);
            int i = 1;
            while(i<=r){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            r++;
        }
        System.out.println();
    }
    
    public static void rightangularpiramid2(){
        int row = 0; 
       while(row<5){
        int i = 0;
        while(i<=row){
            System.out.print(" *");
            i++;
        }
        row++;
        System.out.println();
       }
    }
}