package Collections;

import java.util.Comparator;

public class ComparitorCategoryID implements Comparator<Product>{
	@Override
	public int compare(Product p1, Product p2) {
		int n=p1.category.compareTo(p2.category);
		if(n==0) {
			return Integer.compare(p1.prodId, p2.prodId);
		}
		return n;
	}

}
