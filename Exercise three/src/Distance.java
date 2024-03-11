import java.util.Scanner;
public class Distance {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter miles travelled: ");
        double miles = scanner.nextDouble(); //Input the distance\\
        System.out.println("Enter hours traveled: ");
        double hours = scanner.nextDouble(); //Input the time to travel\\
        System.out.println("Enter petrol used in gallon:");
        double gallon = scanner.nextDouble(); //Input the amount of gallon\\
        double averagehours= miles/hours;
        double averagegalon= miles/gallon;
        System.out.println("Average hours: "+Math.round(averagehours*100.00)/100.00); //Average hours\\
        System.out.println("Average gallons: "+Math.round(averagegalon*100.00)/100.00); //Average gallons\\

    }
}
