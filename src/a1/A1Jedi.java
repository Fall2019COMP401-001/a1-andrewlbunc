package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		// Much of the same code from Adept
		// *Find number of objects in store, list their names and prices (prevent
		// type mismatch
				int itemsInStock = scan.nextInt();
				int[] individualItems = new int[itemsInStock];
				// *Ensure there are no null pointers
				for (int i = 0; i < individualItems.length; i++) {
					individualItems[i] = 0;
				}
				String[] itemsList = new String[itemsInStock];
				double[] itemsPrice = new double[itemsInStock];
				for (int i = 0; i < itemsInStock; i++) {
					itemsList[i] = scan.next();
					itemsPrice[i] = scan.nextDouble();
				}
				// *Find names of customers and how much they spend
				int customers = scan.nextInt();
				int[] customersBought = new int[itemsInStock];
				String[] customerNames = new String[customers];
				for (int i = 0; i < customers; i++) {
					customerNames[i] = scan.next() + " " + scan.next();
					// *Determine how many of each object was purchased
					int itemsBought = scan.nextInt();
					for (int j = 0; j < itemsBought; j++) {
						int itemAmount = scan.nextInt();
						String itemName = scan.next();
						purchase(itemsList, individualItems, itemAmount, itemName);
						number(itemsList, itemName, customersBought);
					}
				}
		scan.close();
		for (int i = 0; i < individualItems.length; i++) {
			if (individualItems[i] == 0) {
				System.out.println("No customers bought " + itemsList[i]);
			} else {
				System.out.println(customersBought[i] + " customers bought " 
			+ individualItems[i] + " " + itemsList[i]);
			}
		}
	}
	
	/* purchase
	 * Function: To find the particular item the customer has purchased
	 * and add to its total number purchased
	 * 
	 * Input: The array of all items purchased, along with how many of that item
	 * have been purchased so far and the amount of a certain item a customer
	 * is purchasing
	 * 
	 * Output: None, only made to update the value of the number of particular objects
	 * that have been purchased
	 */
	static void purchase(String[] list, int[] individual, int amount, String name) {
		for (int i = 0; i < list.length; i++) {
			if (name.equals(list[i])) {
				individual[i] += amount;
			}
		}
	}
	
	/* number
	 * Function: Determine the number of customers who have purchased a particular item
	 * 
	 * Input: The array of all items stocked in the store and the name of the item
	 * a customer is purchasing
	 * 
	 * Output: None, only to update the value of the number of customers that have
	 * bought a stocked item
	 */
	static void number(String[] list, String name, int[] buyers) {
		for (int i = 0; i < list.length; i++) {
			if (name.equals(list[i])) {
				buyers[i]++;
			}
		}
	}
}
