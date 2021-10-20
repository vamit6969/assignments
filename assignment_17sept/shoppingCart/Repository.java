package shoppingCart;
import java.util.ArrayList;


public class Repository {

	public static ArrayList<Electronics> list1;
	  public static ArrayList<Sports> list2;
	  public static ArrayList<Gadgets> list3;
	  public static ArrayList<Furniture> list4;
	  
	  public static void Repo() 
	  {
		  	  
		  list1 = new ArrayList<Electronics>();
		  
		  Electronics electronic1 = new Electronics();
		  electronic1.setId(1);
		  electronic1.setName("mixer");
		  electronic1.setDecription("Gopi m543 ");
		  electronic1.setPrice(12898);
		  list1.add(electronic1);
		  
		  Electronics electronic2 = new Electronics();
		  electronic2.setId(2);
		  electronic2.setName("Jio Hosport");
		  electronic2.setDecription("M2");
		  electronic2.setPrice(1850);
		  list1.add(electronic2);
		  
		  Electronics electronic3 = new Electronics();
		  electronic3.setId(3);
		  electronic3.setName("Fan");
		  electronic3.setDecription("Hevalls");
		  electronic3.setPrice(2599);
		  list1.add(electronic3);
		  
		  Electronics electronic4 = new Electronics();
		  electronic4.setId(4);
		  electronic4.setName("Extension Board");
		  electronic4.setDecription("Model 876");
		  electronic4.setPrice(599);
		  list1.add(electronic4);
		  
		  Electronics electronic5 = new Electronics();
		  electronic5.setId(5);
		  electronic5.setName("TV");
		  electronic5.setDecription("Bush");
		  electronic5.setPrice(7000);
		  list1.add(electronic5);


	 list2 = new ArrayList<Sports>();

		  Sports  sport1 = new Sports();
		  sport1.setId(1);
		  sport1.setName("Vikki Balls");
		  sport1.setDecription("Tennis Packs of 6");
		  sport1.setPrice(450);
		  list2.add(sport1);
		  
		  Sports sport2 = new Sports();
		  sport2.setId(2);
		  sport2.setName("Stemp");
		  sport2.setDecription("Nick");
		  sport2.setPrice(900);
		  list2.add(sport2);

		  
		  Sports  sport3 = new Sports();
		  sport3.setId(3);
		  sport3.setName("FootBall");
		  sport3.setDecription("8th inch");
		  sport3.setPrice(999);
		  list2.add(sport3);

		  
		  Sports  sport4 = new Sports();
		  sport4.setId(4);
		  sport4.setName("Carrom Board");
		  sport4.setDecription("Playwwod");
		  sport4.setPrice(8999);
		  list2.add(sport4);

		  
		  Sports  sport5 = new Sports();
		  sport5.setId(5);
		  sport5.setName("Bat");
		  sport5.setDecription("Reebook");
		  sport5.setPrice(1599);
		  list2.add(sport5);

	         list3 = new ArrayList<Gadgets>();

			 Gadgets gadget1 = new Gadgets();
			 gadget1.setId(1);
			 gadget1.setName("MicroSD");
			 gadget1.setDecription("Class 10");
			 gadget1.setPrice(4999);
			 list3.add(gadget1);
			 
			 Gadgets gadget2 = new Gadgets();
			 gadget2.setId(2);
			 gadget2.setName("Ballpoint Pen");
			 gadget2.setDecription("Model-402 Wireless");
			 gadget2.setPrice(1499);
			 list3.add(gadget2);
			 
			 Gadgets gadget3 = new Gadgets();
			 gadget3.setId(3);
			 gadget3.setName("Sony camera");
			 gadget3.setDecription("Bmc -100p ");
			 gadget3.setPrice(1999);
			 list3.add(gadget3);
			 
			 Gadgets gadget4 = new Gadgets();
			 gadget4.setId(4);
			 gadget4.setName("Smartphone");
			 gadget4.setDecription("Redmi 4");
			 gadget4.setPrice(4499);
			 list3.add(gadget4);
			 
			 
			 Gadgets gadget5 = new Gadgets();
			 gadget5.setId(5);
			 gadget5.setName("Power Bank");
			 gadget5.setDecription("10000 MAH.");
			 gadget5.setPrice(999);
			 list3.add(gadget5);

	        list4 = new ArrayList<Furniture>();

		 Furniture furniture1 = new Furniture();
		 furniture1.setId(1);
		 furniture1.setName(" Table");
		 furniture1.setDecription("Adjustable Height");
		 furniture1.setPrice(2799);
		 list4.add(furniture1);
		 
		 Furniture furniture2 = new Furniture();
		 furniture2.setId(2);
		 furniture2.setName("Chair");
		 furniture2.setDecription("Rounder");
		 furniture2.setPrice(2850);
		 list4.add(furniture2);

		 
		 Furniture furniture3 = new Furniture();
		 furniture3.setId(3);
		 furniture3.setName("Tv Showcase");
		 furniture3.setDecription("model 7686");
		 furniture3.setPrice(8976);
		 list4.add(furniture3);

		 
		 Furniture furniture4 = new Furniture();
		 furniture4.setId(4);
		 furniture4.setName(" Sofa");
		 furniture4.setDecription("3 Seater Fabric Set");
		 furniture4.setPrice(10000);
		 list4.add(furniture4);

		 
		 Furniture furniture5 = new Furniture();
		 furniture5.setId(5);
		 furniture5.setName("Bad");
		 furniture5.setDecription("Double Bad");
		 furniture5.setPrice(13500);
		 list4.add(furniture5);
	  }
}
