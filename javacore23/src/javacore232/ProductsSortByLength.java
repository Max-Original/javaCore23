package javacore232;

import java.util.Comparator;

public class ProductsSortByLength implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		
		int length1 = o1.getLength();
		int length2 = o2.getLength();
		
		if (length1 > length2) {
			return 1;
		} else if (length1 < length2) {
			return -1;
		} else {
			return 0;
		}

	}

}
