package javacore232;

import java.util.Scanner;

public class Application2 {
	
	public static void menu() {
		System.out.println("Press 1 to Add Product");
		System.out.println("Press 2 to Remove Product");
		System.out.println("Press 3 to Change Product");
		System.out.println("Press 4 to Sort by name");
		System.out.println("Press 5 to Sort by length");
		System.out.println("Press 6 to Sort by width");
		System.out.println("Press 7 to Sort by weight");
		System.out.println("Press 8 to Show Product by Index");
		System.out.println("Press 9 to Close App");
	}
public static void main(String[] args) {
	
	while (true) {
		menu();
		Scanner scanner = new Scanner(System.in);
		switch (scanner.next()) {
		case "1": {
			Commodity.getCommodity().addProduct();
			break;
		}

		case "2": {
			Commodity.getCommodity().removeProduct();
			break;
		}
		case "3": {
			Commodity.getCommodity().replaceProduct();
			break;
		}
		case "4": {
			Commodity.getCommodity().sortProductByName();
			break;
		}
		case "5": {
			Commodity.getCommodity().sortProductByLength();
			break;
		}
		case "6": {
			Commodity.getCommodity().sortProductByWidth();
			break;
		}
		case "7": {
			Commodity.getCommodity().sortProductByWeight();
			break;
		}
		case "8": {
			Commodity.getCommodity().getProductByIndex();;
			break;
		}
		case "9": {
			Commodity.getCommodity().exitConsolle();
		}
		}
	}
}
}