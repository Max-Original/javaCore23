package javacore23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Goverment {

	private static Goverment goverment;

	private List<Faction> faction = new ArrayList<>();

	public static synchronized Goverment getGoverment() {
		if (goverment == null) {
			goverment = new Goverment();
		}
		return goverment;
	}

	private Goverment() {
	}

	public void addFaction() {
		System.out.println("������ ��� ������� ��� ������ ������");
		Scanner scanner = new Scanner(System.in);
		String nameFraction = scanner.next();
		Faction newFaction = new Faction(nameFraction);
		faction.add(newFaction);
	}

	public void showFactions() {
		System.out.println(faction);
	}

	public void deleteFaction() {
		showFactions();
		System.out.println("������ ������ ������� ��� ������ ��������");
		Scanner scanner = new Scanner(System.in);
		int vudaluIndex = scanner.nextInt();
		faction.remove(vudaluIndex);
	}

	public void specificFaction() {
		System.out.println("������ ������ ������� ��� ������ �������");
		Scanner scanner = new Scanner(System.in);
		int vuveduIndex = scanner.nextInt();
		System.out.println(faction.get(vuveduIndex));
	}

	public void specificFactionAddDeputy() {
		System.out.println("������ ������ ������� �� ��� ������ ������ ��������");
		Scanner scanner = new Scanner(System.in);
		int vuveduIndex = scanner.nextInt();
		faction.get(vuveduIndex).addDeputy();
	}

	public void specificFactionRemoveDeputy() {
		System.out.println("������ ������ ������� � ��� ������ �������� ��������");
		Scanner scanner = new Scanner(System.in);
		int vuveduIndex = scanner.nextInt();
		faction.get(vuveduIndex).deleteDepytata();
	}

	public void bribaTakerOfFaction() {
		System.out.println("������ ������ ������� � ��� ������ ������� ���������");
		Scanner scanner = new Scanner(System.in);
		int vuveduIndex = scanner.nextInt();
		faction.get(vuveduIndex).showAllBribeTakers();
	}

	public void headBribaTakerOfFaction() {
		System.out.println("������ ������ ������� � ��� ������� ��� ���������");
		Scanner scanner = new Scanner(System.in);
		int vuveduIndex = scanner.nextInt();
		faction.get(vuveduIndex).showHeadBribeTaker();
	}

	public void showDeputyOfFraction() {
		System.out.println("������ ������ ������� � ��� �������� ��������");
		Scanner scanner = new Scanner(System.in);
		int vuveduIndex = scanner.nextInt();
		faction.get(vuveduIndex).showDeputativ();
	}

	public void ClearFraction() {
		System.out.println("������ ������ ������� � ��� �������� ��������");
		Scanner scanner = new Scanner(System.in);
		int vuveduIndex = scanner.nextInt();
		faction.get(vuveduIndex).deleteAllDeputativ();
	}

	public void showAllBrideTakers() {
//		for (int i = 0; i < faction.size(); i++) {
//			faction.get(i).showAllBribeTakers();
//		}
		List<Faction> collect = faction.stream().peek(run -> run.showAllBribeTakers()).collect(Collectors.toList());
	}
}
