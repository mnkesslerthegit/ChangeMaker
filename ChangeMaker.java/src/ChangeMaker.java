import java.util.Scanner;
public class ChangeMaker {
    public static void main(String[] args) {
	System.out.println("enter the price of an item");
	System.out.print("from 25 cents to a dollar, in incriments of cents");
	Scanner scanner = new Scanner(System.in);
	int number = scanner.nextInt();
	int quarters = number/25;
	int qRemainder = number%25;
	int dimes = qRemainder/10;
	int dRemainder = qRemainder%10;
	int nickels = dRemainder/5;
	System.out.print("You bought an item for" + number);
	System.out.println("and you gave me a dollar, so your change is");
	System.out.println(quarters);
	System.out.println(dimes);
	System.out.println(nickels);
	}
}
