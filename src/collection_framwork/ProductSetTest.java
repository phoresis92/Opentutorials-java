package collection_framwork;

import java.util.HashSet;
import java.util.Set;

class Product{
	
	int code;
	String title;
	double price;
	
	Product(int code, String title, double price){
		this.code = code;
		this.title = title;
		this.price = price;
	}
	
	public String toString() {
		return code+title+price ;
	}
	
	public int hashCode() {
		return code;
	}

	public boolean equals(Object obj) {
		Product other = (Product)obj;
		return title.equals(other.title);
	}

	
}


public class ProductSetTest {
	
	public static void main(String[] args) {
		
		Set<Product> set = new HashSet<Product>();
		
		Product p1 = new Product(100, "�Ｚtv", 100000);
		Product p2 = new Product(200, "����tv", 100000);
		Product p3 = new Product(100, "�Ｚtv", 300000);
		Product p4 = new Product(400, "�Ｚ������", 100000);
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
		System.out.println(set.size());
		
		for(Product p : set) {
			System.out.println(p);
		}
		
		
	}

}
