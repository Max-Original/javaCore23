package javacore232;

public class Car implements Comparable<Car>{
	
	private String brand;
	private int topSpeed;
	
	public Car(String brand, int topSpeed) {
		super();
		this.brand = brand;
		this.topSpeed = topSpeed;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", topSpeed=" + topSpeed + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + topSpeed;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (topSpeed != other.topSpeed)
			return false;
		return true;
	}

	@Override
	public int compareTo(Car o) {
		return brand.compareTo(o.brand);
	}
}
