import java.util.*;
public class searchingInMDArray{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
        // System.out.println(arr[2][2]);
        print( arr); //traversel
        System.out.println("Enter the no. you want to search:");
        int num = sc.nextInt();
        search(num, arr);
    }
    public static void print( int[][] arr){
        int i=0;
        while(i< arr.length){
            int j=0;
            while(j< arr[i].length){
                System.out.print(" "+arr[i][j]);
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void search(int num, int[][] arr){        
        int i=0;
        while(i< arr.length){
            int j=0;
            while(j<arr[i].length){
                int num1 = arr[i][j];
                if(num==num1){
                    System.out.println("No. found at :"+ (i+1)+","+(j+1));
                    break;
                }
                j++;
            }
            i++;
        }
    }
}

/*
import java.util.*;
public class searchingInMDArray{
       static int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        // System.out.println(arr[2][2]);
        print(); //traversel
        System.out.println("Enter the no. you want to search:");
        int num = sc.nextInt();
        search(num);
    }
    public static void print(){
        int i=0;
        while(i< arr.length){
            int j=0;
            while(j< arr[i].length){
                System.out.print(" "+arr[i][j]);
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void search(int num){        
        int i=0;
        while(i< arr.length){
            int j=0;
            while(j<arr[i].length){
                int num1 = arr[i][j];
                if(num==num1){
                    System.out.println("No. found at :"+ i+","+j);
                    break;
                }
                j++;
            }
            i++;
        }
    }
}
*/