import java.util.Scanner;
public class CelciustoFahrenheit {
    public static void main(String[] args) {
        //Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        // Prompt the user for Celcius
        System.out.println("Celcius : ");
        double c = scanner.nextDouble();
        //Convert into fahrenheit
        double f = c * (9.0 / 5.0) + 32;
        System.out.println("Fahrenheit: " + Math.round(f*100.00)/100.00);

    }

}