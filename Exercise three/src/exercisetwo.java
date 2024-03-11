import java.util.Scanner;
public class exercisetwo {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any two number:");
        double a = scanner.nextDouble(); //Input first number\\
        double b = scanner.nextDouble();//Input second number\\
        double sum = a+b; //Addition of the numbers\\
        double mul = a*b; //Multiplication of the numbers\\
        double dif = a-b; //Subtraction of the numbers\\
        System.out.println("Sum is "+Math.round(sum*100.00)/100.00); //We get the result two decimal\\
        System.out.println("Product is "+Math.round(mul*100.00)/100.00);
        System.out.println("Difference is "+Math.round(dif*100.00)/100.00);
    }
}
