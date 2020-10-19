package javacore232;

import java.util.Comparator;

public class ProductSortByWidth implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		
		int width1 = o1.getWidth();
		int width2 = o2.getWidth();
		
		if (width1 > width2) {
			return 1;
		} else if (width1 < width2) {
			return -1;
		} else {
			return 0;
		}

	}

}
