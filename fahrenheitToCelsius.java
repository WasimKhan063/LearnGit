import java.util.*;

public class fahrenheitToCelsius{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        float Fahrenheit = sc.nextFloat();
        // System.out.println("Fahrenheit:"+Fahrenheit);
        float Celsius = (Fahrenheit - 32) * 5/9;
        System.out.printf("Temperature in Celsius:"+ Celsius);
        // System.out.printf("Temperature in Celsius: %.2f%n", Celsius);
        sc.close();  // Close the scanner when done with input

    }
}