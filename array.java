import java.util.*;
public class array{
    public static void main(String[] args){
        int[] marks =new int [20];
        marks[1]= 54;
        marks[2]= 34;
        marks[0]= 54;
        marks[3]= 67;
        marks[8]= 99;
        marks[19]= 43;
        marks[14]= 45;
        marks[12]= 32;
        marks[15]= 34;
        System.out.println(marks[15]);
        int[] mark= {1,2,3,4,5,9,6,7,8};
        System.out.print(mark[5]);
        int i=0;
        // array traversal
        while(i< marks.length){

            System.out.println(marks[i]);
            i++;
        }
    }
}