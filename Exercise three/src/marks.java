import java.util.Scanner;
public class marks {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 5 numbers:");
        double a = scanner.nextDouble(); //Input the first assignment's mark\\
        double b = scanner.nextDouble(); //Input the second assignment's mark\\
        double c = scanner.nextDouble(); //Input the third assignment's mark\\
        double d = scanner.nextDouble(); //Input the fourth assignment's mark\\
        double e = scanner.nextDouble(); //Input the fifth assignment's mark\\
        double first = a*(15.0/100.0); //We get the first whole mean\\
        double second = b*(15.0/100.0); //We get the second whole mean\\
        double third = c*(20.0/100.0); //We get the third whole mean\\
        double fourth = d*(20.0/100.0); //We get the fourth whole mean\\
        double fifth = e*(30.0/100.0); //We get the fifth whole mean\\
        double average = (first+second+third+fourth+fifth); //Adding the whole mean all together\\
        System.out.println("The average grade is "+Math.round(average*100.00)/100.00);





    }

}
