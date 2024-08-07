import java.util.*;
public class prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int i=2;
        if(num<2){
            System.out.println(num+" is not a prime number");
        }else if(num==2){
            System.out.println(num+" is a prime number.");

        }else{
        while(i<num){
            int num2 = num%i;
            if (num2 != 0){
                System.out.println(num+" is a prime number.");
                break;
            }
            else if(num2 == 0){
                System.out.println(num+" is not a prime number");
                break;
            }
            i++;
        }
        }
    }
    
    
}