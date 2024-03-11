import java.util.Scanner;
public class exerciseone {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name, age, date of birth:");
        String name= scanner.next(); //Input the name\\
        int age = scanner.nextInt(); //Input the age\\
        String date = scanner.next(); //Input the date\\
        System.out.println("Welcome "+name+" you were born in "+date+ " and are "+age+ " years old"); //Comes the result\\



    }
}