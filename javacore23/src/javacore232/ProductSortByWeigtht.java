package javacore232;

import java.util.Comparator;

public class ProductSortByWeigtht implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		
		int weight1 = o1.getWeight();
		int weight2 = o2.getWeight();
		
		if (weight1 > weight2) {
			return 1;
		} else if (weight1 < weight2) {
			return -1;
		} else {
			return 0;
		}

	}
}
