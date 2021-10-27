package assign_12_oct;
/*
 *Create a list of objects of class Product using Builder design pattern.

 int productId
 int productDescription
 int productType
 */
 
import java.util.List;
public class MainOfproduct 
{
	public static void main(String[] args) {
		List<Product> productList = Product.getProductList();
		productList.forEach(System.out::println);
	}
}