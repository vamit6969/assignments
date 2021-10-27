package assign_12_oct;

import java.util.Arrays;
import java.util.List;

public class Product 
{
	private int productId;
	private String productName;
	private String productDescription;
	private String productType;
	
	private Product() {}
	
	public Product(Product.Builder builder) 
	{
		this();
		this.productId=builder.productId;
		this.productName=builder.productName;
		this.productDescription=builder.productDescription;
		this.productType=builder.productType;
	}
	

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}



	private static class Builder{
		private int productId;
		private String productName;
		private String productDescription;
		private String productType;
		
		public Builder() {
			
		}
		
		public Builder setProductId(int productId) {
			this.productId = productId;
			return this;
		}
		public Builder setProductName(String productName) {
			this.productName = productName;
			return this;
		}
		public Builder setProductDescription(String productDescription) {
			this.productDescription = productDescription;
			return this;
		}
		public Builder setProductType(String productType) {
			this.productType = productType;
			return this;
		}
		
		public Product build() {
			return new Product(this);
		}
		
	}
	
	public static List<Product> getProductList(){
		return Arrays.asList(
				new Product.Builder().setProductId(01)
									.setProductName("Iphone 12")
									.setProductDescription("Standard Edition")
									.setProductType("SmartPhones")
									.build(),
				new Product.Builder().setProductId(02)
									.setProductName("Samsung s1")
									.setProductDescription("Stylish Look")
									.setProductType("SmartPhones")
									.build(),
				new Product.Builder().setProductId(03)
									.setProductName("Vivo v21 5g")
									.setProductDescription("Qualcomm Snapdragon 712 Processor")
									.setProductType("SmartPhones")
									.build(),
				new Product.Builder().setProductId(03)
									.setProductName("Oppo renno6")
									.setProductDescription("Tripple Rear Camera")
									.setProductType("SmartPhones")
									.build()								
				);
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDescription="
				+ productDescription + ", productType=" + productType + "]\n";
	}
	
	
	
}