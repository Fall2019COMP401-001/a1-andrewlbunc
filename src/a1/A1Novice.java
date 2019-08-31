package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		/* 1. Find out how many customers we need to scan through
		 *  2. Use that number in a loop to go through the shopping list
		 *  of each customer
		 */
		int customers = scan.nextInt();
		for (int i = 0; i < customers; i++) {
			// 3. Gather the first initial and last name of the customer
			String firstName = scan.next();
			char firstInitial = firstName.charAt(0);
			String lastName = scan.next();
			// 4. Find out how many items they purchased
			int items = scan.nextInt();
			// 5. Add up the cost of all items purchased
			double cost = 0;
			for (int j = 0; j < items; j++) {
				int purchases = scan.nextInt();
				// itemName is needed so that type mismatch does not occur
				String itemName = scan.next();
				double price = scan.nextDouble();
				cost += (purchases * price);
			}
			// 6. Print out the "receipt" of the customer
			System.out.println(firstInitial + ". " + lastName + ": " + cost);
		}
		scan.close();
	}
}
