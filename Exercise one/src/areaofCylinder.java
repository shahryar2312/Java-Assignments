import java.util.Scanner;
public class areaofCylinder {
    public static void main(String[] args)
    {
        double pie = 3.1416;
        //Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        // Prompt the user for the diameter
        System.out.println("The diameter of the can : ");
        double d = scanner.nextDouble();
        double r= d/2;
        // Prompt the user for the height
        System.out.println("The height of the can: ");
        double h = scanner.nextDouble();
        //Calculate the volume
        double v = (((r)*(r))*h*pie );
        System.out.println("Volume = " +Math.round(v*100.00)/100.00); // round up by using math round
        double a = (2*pie*r*h);
        System.out.println("Area =  " +Math.round(a*100.00)/100.00); // round up by using math round




    }




}