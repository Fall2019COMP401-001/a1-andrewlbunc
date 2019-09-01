package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		// *Find number of objects in store, list their names and prices
		int itemsInStock = scan.nextInt();
		String[] itemsList = new String[itemsInStock];
		double[] itemsPrice = new double[itemsInStock];
		for (int i = 0; i < itemsInStock; i++) {
			itemsList[i] = scan.next();
			itemsPrice[i] = scan.nextDouble();
		}
		// *Find names of customers and how much they spend
		int customers = scan.nextInt();
		String[] customerNames = new String[customers];
		double[] customerSpending = new double[customers];
		for (int i = 0; i < customers; i++) {
			customerNames[i] = scan.next() + " " + scan.next();
			// *Determine how much each person spends
			int itemsBought = scan.nextInt();
			for (int j = 0; j < itemsBought; j++) {
				int itemAmount = scan.nextInt();
				String itemName = scan.next();
				customerSpending[i] += compare(itemsList, itemsPrice,
						itemAmount, itemName);
			}
		}
		scan.close();
		System.out.println(biggest(customerNames, customerSpending));
		System.out.println(smallest(customerNames, customerSpending));
		System.out.println(average(customerSpending));
	}
	/* compare
	 * Function: to look at the String values given by the itemName variable
	 * and find the itemPrice associated with that String, then add the 
	 * price of that item to customerSpending
	 * 
	 * Input: The list and prices of all items in stock, and the amount
	 * of the item the customer purchases
	 * 
	 * Output: The price of the customer's purchase
	 */
	static double compare(String[] list, double[] price, int amount, String name) {
		for (int i = 0; i < list.length; i++) {
			if (name.equals(list[i])) {
				return (amount * price[i]);
			}
		}
		return 0;
	}
	
	/* biggest
	 * Function: Takes in the array of customer names and their corresponding "receipts"
	 * to see which customer has spent the most money.
	 * 
	 * Input: Array of customer names and their spending amounts
	 * 
	 * Output: The name and amount spent of the customer with the greatest spending
	 */
	static String biggest(String[] names, double[] spent) {
		int mostSpent = 0;
		for (int i = 0; i < spent.length; i++) {
			if (spent[i] > spent[mostSpent]) {
				mostSpent = i;
			}
		}
		return "Biggest: " + names[mostSpent] + " (" + String.format("%.2f",spent[mostSpent]) + ")";
	}
	
	/* smallest
	 * Function: Takes in customer names and pricing arrays to determine who 
	 * has spent the least amount of money
	 * 
	 * Input: Array of customer names and their spending amounts 
	 * 
	 * Output: The name and amount spent of the customer who paid the least
	 */
	static String smallest (String[] names, double[] spent) {
		int leastSpent = 0;
		for (int i = 0; i < spent.length; i++) {
			if (spent[i] < spent[leastSpent]) {
				leastSpent = i;
			}
		}
		return "Smallest: " + names[leastSpent] + " (" + String.format("%.2f",spent[leastSpent]) + ")";
	}
	
	/* average
	 * Function: Takes in customer spending amounts to find their average
	 * 
	 * Input: Array of customer spending
	 * 
	 * Output: The average amount of money spent based on all customers
	 */
	static String average (double[] spent) {
		double total = 0;
		for (int i = 0; i < spent.length; i++) {
			total += spent[i];
		}
		return "Average: " + String.format("%.2f", total / spent.length);
	}
}
