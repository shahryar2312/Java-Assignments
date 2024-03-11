import java.util.Scanner;
public class leapYear{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of year: ");
        int y= scanner.nextInt(); //Input the year\\
        int lp= y/4;
        System.out.println("There are " +lp+ " years in " +y+ " years"); //Number of leap year\\
        int d = (365*y)+lp;
        System.out.println("There are " +d+ " days in " +y+ " years"); //Number of days\\
        int h = d*24;
        System.out.println("There are " +h+ " hours in " +y+ " years" ); //Number of hours\\
        int m = h*60;
        System.out.println("There are " +m+ " minutes in " +y+ " years"); //Number of minutes\\












    }
}