import java.util.Scanner;

public class Program_4_calculator_division {
    public static void main(String[] args){
        System.out.println("Substraction");
        System.out.println("Enter the first number");
        Scanner num1 = new Scanner(System.in);
        int writenum1 = num1.nextInt();
        System.out.println("Enter the second number");
        Scanner num2 = new Scanner(System.in);
        int writenum2 = num2.nextInt();
        int ans = writenum1*writenum2;
        System.out.println("Your answer is "+ans);
        
    }
}