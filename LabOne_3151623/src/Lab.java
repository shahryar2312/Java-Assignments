/*
My name is Kazi Shahryar Rahman and my Student ID: 3151623. The assignment contains 5 tasks and I gave information above
 the programs.
*/
import java.util.Scanner;
public class Lab {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);






    /*
    The program calculates the volume and whole surface area of the ball. We take the diameter as an input. We get the
    volume and whole surface area of the ball. We used math.pow for the power of the diameter. We used Math.round to get
    2 decimal point.
     */


        /*System.out.println("Enter the diameter of the ball: ");
        double d = sc.nextDouble();
        double pie = 3.1416;
        double v = (pie*(Math.pow(d,3)/6));
        double a = (pie*(Math.pow(d,2)));
        System.out.println("The volume of the ball is: "+Math.round(v*100.00)/100.00);
        System.out.println("The surface area of the whole sphere is: "+Math.round(a*100.00)/100.00);*/


    /*
    In the program, we see the Caeser Cipher encode a letter by shifting a number to a number of places.
    Here we take the input of a number of places to shift, and we also take the character. We get the output of the new
    character. We did casting with char.*/

        System.out.println("Enter the amount of positions to shift: ");
        int shift = sc.nextInt();
        System.out.println("Enter the character to encode: ");
        char alphabet = sc.next().charAt(0);
        char encoded = (char)(shift + alphabet);
        System.out.println(alphabet+" encode is " +encoded);







    /*
    In the program we need to calculate the area of the wall. Then we calculate the amount of tin is needed to complete
    the painting. Here we take the height and width of the wall as input. And we get the output of area and tins of the
    paint. We use Math.ceil as 1 tin contains 2.5 litres. But we can't have the tin in decimal. So we need another tin
    if we need.
     */

        /*System.out.print("Enter your wall's width in meter: ");
        double width = sc.nextDouble();
        System.out.print("Enter your wall's height in meter: ");
        double height = sc.nextDouble();
        double area = width*height;
        int tin= (int) Math.ceil((area/(13*2.5)));
        System.out.println("The wall is "+area+ " sqm");
        System.out.println("You will need "+(tin)+" tins of paint");*/




    /*
    In the program, it calculates the total bill including service charge and the bill which is need to be paid by each
    person. We take total bill, service charge and number of people. And we get the output of the total bill with
    service charge and the bill which is need to be paid by each person. We used Math.round to get 2 decimal point.
     */

       /* System.out.print("Enter bill amount: €");
        double bill = sc.nextDouble();
        System.out.print("Enter the number of people: ");
        int people = sc.nextInt();
        System.out.print("Enter the service charge: ");
        double service = sc.nextDouble();
        double totalBill = bill+(bill*(service/100));
        double perPerson = totalBill/people;
        System.out.println("Total bill including service charge : €"+Math.round(totalBill*100.00)/100.00);
        System.out.println("Each Person Should Pay: €"+Math.round(perPerson*100.00)/100.00);*/








    /*
    In the program, it calculates the difference between the two person's year and months. Here we get the difference of
    the years and months as output. We put the absolute value so that the difference is not negative.
     */
       /* System.out.print("Enter the year and months(1-12): ");
        int yearFirst = sc.nextInt();
        int monthsFirst = sc.nextInt();
        System.out.print("Enter the year and months: ");
        int yearSecond = sc.nextInt();
        int monthsSecond = sc.nextInt();
        int yearDiff = yearSecond - yearFirst;
        int monthDiff = monthsSecond - monthsFirst;
        if (monthDiff < 0) {
            yearDiff--;
            monthDiff += 12;
        }
        System.out.println("The difference is " + Math.abs(yearDiff) + " years " + Math.abs(monthDiff) + " months");

    */
    }
}

