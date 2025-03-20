package Collections;

import java.util.Comparator;

public class ComparingCategoryPrice implements Comparator<Product>{

//	@Override
//	public int compare(Product p1, Product p2) {
//		// TODO Auto-generated method stub
//		//make comparison by category
//		//return int , 0,-ve or positive
//		
//		int categoryComparison=p1.category.compareTo(p2.category);
//		if(categoryComparison==0) {
//			return Double.compare(p1.productPrice, p2.productPrice);
//		}
//		return categoryComparison;
//	}
	
	//descending
//	@Override
//	public int compare(Product p1, Product p2) {
//		// TODO Auto-generated method stub
//		//make comparison by category
//		//return int , 0,-ve or positive
//		
//		int categoryComparison=p2.category.compareTo(p1.category);
//		if(categoryComparison==0) {
//			return Double.compare(p2.productPrice, p1.productPrice);
//		}
//		return categoryComparison;
//	}
	
	public int compare(Product p1, Product p2) {

			return Double.compare(p2.productPrice, p1.productPrice);
	
	}

}
