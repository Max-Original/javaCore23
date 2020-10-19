package javacore23;

import java.util.Scanner;

public class Deputy extends Human {

	private String lastName;
	private String firstName;
	private int age;
	private boolean bribeTaker;
	private Integer sizeBride;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBribeTaker() {
		return bribeTaker;
	}

	public void setBribeTaker(boolean bribeTaker) {
		this.bribeTaker = bribeTaker;
	}

	public Integer getSizeBride() {
		return sizeBride;
	}

	public void setSizeBride(Integer sizeBride) {
		this.sizeBride = sizeBride;
	}

	public Deputy(int weight, int height, String lastName, String firstName, int age, boolean bribeTaker) {
		super(weight, height);
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.bribeTaker = bribeTaker;
		this.sizeBride = sizeBride;
	}

	public void giveBride() {
		if (bribeTaker == false) {
			System.out.println("Це останній депутат який не бере хабарів, давайте збережем його разом");
		} else {
			System.out.println("Скільки?");
			Scanner scanner = new Scanner(System.in);
			int sizebride = scanner.nextInt();
			if (sizebride > 5000) {
				System.out.println("Депутат сяде");
			} else {
				this.sizeBride = sizebride;
			}
		}
	}

	@Override
	public String toString() {
		return "Deputy [weight=" + weight + ", height=" + height + " lastName=" + lastName + ", firstName=" + firstName
				+ ", age=" + age + ", bribeTaker=" + bribeTaker + ", sizeBride=" + sizeBride + "]";
	}

}
