package interfacedemo;

import java.util.ArrayList;
import java.util.Scanner;

public class IPhoneApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		

		IPhone p1 = null; // must be declared to null for additional features to be added

		ArrayList<IPhone> phoneList = new ArrayList<IPhone>();
		String cont = "y";
		while (cont.equalsIgnoreCase("y")) {
			int userModel = Validator.getInt(scan, "Please enter a model #: (1/2/3) ", 1, 3);
			p1 = IPhoneCreator.getProduct(p1, userModel); // had to assign to a variable to reuse later
			System.out.println("User choice selected: " + p1);
			phoneList.add(p1);
			cont = Validator.getString(scan, "\nAdd another phone to your list? (y/n) ");
		}
		System.out.println("\nHere's your list: ");

		int listNums = 1;
		for (IPhone phone : phoneList) {
			System.out.println(listNums++ + ". " + phone);
		}
		System.out.println("\n" + getTotal(phoneList));
		System.out.println("\nNew phones left in stock: ");
		System.out.println("6S: " + IPhoneCreator.new6S);
		System.out.println("7P: " + IPhoneCreator.new7P);
		System.out.println("X: " + IPhoneCreator.newX);

		System.out.println("\nGoodbye!");

	}

	public static String getTotal(ArrayList<IPhone> phones) {
		double total = 0;
		for (IPhone phone : phones) {
			if (phone instanceof IPhone6S) {
				IPhone6S p = (IPhone6S) phone;
				total += p.getPrice();
			} else if (phone instanceof IPhone7P) {
				IPhone7P p = (IPhone7P) phone;
				total += p.getPrice();
			} else {
				IPhoneX p = (IPhoneX) phone;
				total += p.getPrice();
			}

		}
		double tax = total * .06;
		double total2 = total + tax;
		return String.format("Subtotal: $%.2f\nTax: $%.2f\nGrand Total: $%.2f", total, tax, total2);
	}

}
