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
	}
}
