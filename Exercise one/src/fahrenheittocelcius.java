import java.util.Scanner;
public class fahrenheittocelcius {
    public static void main(String[] args) {
        //Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        // Prompt the user for Celcius
        System.out.println("Fahrenheit : ");
        double f = scanner.nextDouble();
        //Convert into fahrenheit
        double c = (f-32) /(9.0/5.0);
        System.out.println("Celcius: " +Math.round(c);

    }

}