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

		System.out.println("������ 1 ��� ������ �������");
		System.out.println("������ 2 ��� �������� ��������� �������");
		System.out.println("������ 3 ��� ������� ��  �������");
		System.out.println("������ 4 ��� �������� ��������� �������");
		System.out.println("������ 5 ��� ������� ��������� �������");
		System.out.println("������ 6 ��� ������ �������� � �������");
		System.out.println("������ 7 ��� �������� �������� � �������");
		System.out.println("������ 8 ��� ������� ������ ���������");

	}
}
