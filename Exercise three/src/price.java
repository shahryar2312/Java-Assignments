import java.util.Scanner;
public class price {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter item, price, discounted price: ");
        String item = scanner.next(); //Input the item name\\
        double price = scanner.nextDouble(); //Input the price\\
        double dprice = scanner.nextDouble(); //Input discount price\\
        double discount= 100-((dprice/price)*100); //Discount percentage\\
        System.out.println(item+" is "+Math.round(discount*100.00)/100.00+" % off this week"); //Print out the discount percentage\\


    }
}
