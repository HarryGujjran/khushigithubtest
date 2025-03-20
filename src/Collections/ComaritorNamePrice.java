package Collections;

import java.util.Comparator;

public class ComaritorNamePrice implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		int n=p1.prodName.compareTo(p2.prodName);
		if(n==0) {
			return Double.compare(p1.productPrice, p2.productPrice);
		}
		return n;
	}

}
