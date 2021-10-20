package shoppingCart;

public class Sports {


	   private int Id;
	   private String Name;
	   private String Decription;
	   private int Price;
	   
	   public Sports() 
	    {
			super();
			// TODO Auto-generated constructor stub
		}
	   
	   public Sports(int id, String name, String decription, int price)
	   {
		super();
		Id = id;
		Name = name;
		Decription = decription;
		Price = price;
	   }

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDecription() {
		return Decription;
	}

	public void setDecription(String decription) {
		Decription = decription;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Sport [Id=" + Id + ", Name=" + Name + ", Decription=" + Decription + ", Price=" + Price + "]";
	}
 
}
