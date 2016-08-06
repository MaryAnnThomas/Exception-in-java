package exception2;

import java.util.Scanner;
public class Exception2 {

    
    public static void main(String[] args) {
        int num1,num2,result = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first Number");
        num1 = input.nextInt();
        System.out.println("Enter the second number");
        num2 = input.nextInt();
        try
        {
            System.out.println("Calling try block");
            result = num1/num2;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Calling catch block");
            System.out.println("Cannot divide a number by zero");
            System.out.println(e.getMessage());
            e.printStackTrace();//Prints the entire information of the stack from where the Exception has occured.  
        }
        System.out.println("The result is"+result);
    }
    
}
