package javacore23;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		while (true) {
			menu();

			Scanner scanner = new Scanner(System.in);
			switch (scanner.next()) {
			case "1":
				Goverment.getGoverment().addFaction();
				break;

			case "2":
				Goverment.getGoverment().deleteFaction();
				break;

			case "3":
				Goverment.getGoverment().showFactions();
				break;

			case "4":
				Goverment.getGoverment().ClearFraction();
				break;

			case "5":
				Goverment.getGoverment().specificFaction();
				break;

			case "6":
				Goverment.getGoverment().specificFactionAddDeputy();
				break;

			case "7":
				Goverment.getGoverment().specificFactionRemoveDeputy();
				break;

			case "8":
				Goverment.getGoverment().showAllBrideTakers();
				break;

			}
		}

	}

	public static void menu() {

		System.out.println("Введіть 1 щоб додати фракцію");
		System.out.println("Введіть 2 щоб видалити конкретну фракцію");
		System.out.println("Введіть 3 щоб вивести усі  фракції");
		System.out.println("Введіть 4 щоб очистити конкретну фракцію");
		System.out.println("Введіть 5 щоб вивести конкретну фракцію");
		System.out.println("Введіть 6 щоб додати депутата в фракцію");
		System.out.println("Введіть 7 щоб видалити депутата з фракції");
		System.out.println("Введіть 8 щоб вивести список хабарників");

	}
}
