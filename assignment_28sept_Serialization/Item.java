package assignment_28sept_Serialization;
/* Create a class Item with following attributes

   itemId int
   itemDescription String
   itemQuantityAvailable int
   itemUnitPrice double
   itemDiscountPercentage int

 Serialize List of Items(at least 4 items) and deserialize those items and print on console.
 * 
 */

import java.io.Serializable;

public class Item implements Serializable
{
	  
	  private int itemId ;
	  private   String  itemDescription ;
	  private int  itemQuantityAvailable ;
	  private  double itemUnitPrice ;
	  private int itemDiscountPercentage ;
	  
	  public Item() {
			super();
			// TODO Auto-generated constructor stub
		}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public int getItemQuantityAvailable() {
		return itemQuantityAvailable;
	}

	public void setItemQuantityAvailable(int itemQuantityAvailable) {
		this.itemQuantityAvailable = itemQuantityAvailable;
	}

	public double getItemUnitPrice() {
		return itemUnitPrice;
	}

	public void setItemUnitPrice(double itemUnitPrice) {
		this.itemUnitPrice = itemUnitPrice;
	}

	public int getItemDiscountPercentage() {
		return itemDiscountPercentage;
	}

	public void setItemDiscountPercentage(int itemDiscountPercentage) {
		this.itemDiscountPercentage = itemDiscountPercentage;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemDescription=" + itemDescription + ", itemQuantityAvailable="
				+ itemQuantityAvailable + ", itemUnitPrice=" + itemUnitPrice + ", itemDiscountPercentage="
				+ itemDiscountPercentage + "]";
	}
	  
	  
}