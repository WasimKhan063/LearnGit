import java.util.*;
public class IfElse{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String a = sc.nextLine();
        System.out.println("If the persion is male enter true else enter false.");
        Boolean C = sc.nextBoolean();

        if(C){
            System.out.println("Mr. " + a);
        }
        else{
            System.out.println("Ms. " + a);
        }

    }
}