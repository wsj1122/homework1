package homework1;

import java.util.Scanner;

public class SalesTax {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter purchase amount: ");
		double purchaseAmount= input.nextDouble();
		double tax = 0.06 * purchaseAmount;
		System.out.println("Sales tax is $"+ (int)(tax*100)/100.0);
	}

}
