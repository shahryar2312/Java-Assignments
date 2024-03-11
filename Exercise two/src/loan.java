import java.util.Scanner;
public class loan {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("The Loan amount is: €");
        double loan= scanner.nextDouble(); //Input of amount of loan\\
        System.out.print("The rate of interest: ");
        double rateofinterest= scanner.nextDouble(); //Input rate of interest\\
        System.out.print("The amount of time: ");
        double time= scanner.nextDouble(); //Input time\\
        double interest = loan*time*(rateofinterest/100); //Interest\\
        double totalLoan = loan+interest;//We add loan with interest\\
        System.out.println("The total amount of Loan is: €"+Math.round(totalLoan*100.00)/100.00); //Total amount of loan\\





    }
}
