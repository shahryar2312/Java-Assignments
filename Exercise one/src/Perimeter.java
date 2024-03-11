import java.util.Scanner;
public class Perimeter{
    public static void main(String[] args)
    {
        //Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        // Prompt the user for the length
        System.out.println("Length : ");
        double l = scanner.nextDouble();
        // Prompt the user for the width
        System.out.println("Width: ");
        double w = scanner.nextDouble();
        //Calculate the perimeter
        double p = 2*(l+w);
        System.out.println("Perimeter = " + p);





    }
}