package hust.soict.dsai.aims.Aims;


import hust.soict.dsai.aims.cart.Cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.Media;

import hust.soict.dsai.aims.store.Store.Store;

public class Aims {
	private  Cart cart = new Cart();
	private  Store store = new Store();
	
	public Aims(Cart cart, Store store) {
		this.cart = cart;
		this.store = store;
	}
	
	public Aims() {
	}

	public static void showMenu() {
		System.out.println("------AIMS-------: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");

	}
	public static void storeMenu() {
		System.out.println("------Store Menu-------");
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	public static void mediaDetailsMenu() {
		System.out.println("------Media detail------");
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	public static void cartMenu() {
		System.out.println("-------Cart detail------");
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
	}
	public  void selectInMenu() {
		
		Aims.showMenu();
		int selection = Integer.valueOf(System.console().readLine());
		switch(selection) {
			case 0: {
				System.out.println("Thank you, see you again!");
				System.exit(0);
				break;}
			case 1: // display all the items in the store and goto storeMenu
			{	
				store.available();
				selectInStoreMenu();
				break;
			}
			case 2: // allow the user to add a media to or remove a media from the store
			{
				System.out.println("Add(a) or Remove(r) item in Store?");
				String select = System.console().readLine();
				
				if(select.compareTo("r")==0) {
					System.out.println("Enter title of media");
					String title = System.console().readLine();
					Media x = store.searchByTitle(title);
					store.removeMedia(x);
				}
				else if(select.compareTo("a")==0) {
					System.out.println("Enter type of media:");
					String type = System.console().readLine();
					if (type.equals("CD")){
						System.out.println("Enter title of CD:");
						String title = System.console().readLine();
						Media x = new CompactDisc(title);
						store.addMedia(x);
					}
					else if (type.equals("DVD")){
						System.out.println("Enter title of DVD: ");
						String title = System.console().readLine();
						Media x = new DigitalVideoDisc(title);
						store.addMedia(x);
					}
					else{
						System.out.println("Enter title of Book:");
						String title = System.console().readLine();
						Media x = new Book(title);
						store.addMedia(x);
					}
				}
				selectInMenu();
				break;
				
			}
			case 3: // information of the current cart and go to cartMenu
			{
				cart.displayCart();
				selectInCartMenu();
				break;
			}
		}

	}
	
	public void selectInStoreMenu() {
		
		
		Aims.storeMenu();
		int selection = Integer.valueOf(System.console().readLine());
		switch(selection) {
			case 0: selectInMenu(); break; //Back
			case 1:  //See a media's details
			{
				System.out.println("Enter title: ");
				String title = System.console().readLine();
				Media x = store.searchByTitle(title);
				if(x!=null) {
					System.out.println(x.toString());
					selectInMediaDetailsMenu(x);
				}
				else{
					System.out.println("not found, please re-enter!");
					selectInStoreMenu();
				}
				break;
			}
			case 2: //Add a media into the cart
			{
				System.out.println("Title of media:");
				String title = System.console().readLine();
				Media x = store.searchByTitle(title);
				if (x== null) System.out.println("sorry, the media is not in the store.");
				else {
					cart.addMedia(x);
					store.removeMedia(x);
				}
				selectInStoreMenu();
				break;
			}	
			case 3: //Play a media
			{
				System.out.println("Title of media:");
				String title = System.console().readLine();
				Media x = store.searchByTitle(title);
				if (x != null){
					if(x instanceof DigitalVideoDisc) {
						DigitalVideoDisc x_dvd = (DigitalVideoDisc)x;
						x_dvd.play();
					}
					else if(x instanceof CompactDisc) {
						CompactDisc x_cd = (CompactDisc)x;
						x_cd.play();
					}
					else System.out.println("Book cannot play!");
				}
				else{
					System.out.println("Your media is not on the store");
				}
				selectInStoreMenu();
				break;
			}
			case 4:{//see current cart
				cart.displayCart();
				selectInStoreMenu();
			}
			default:
			{System.out.println("The selection is invalid!");
			selectInStoreMenu();}
		}
		
	}
	
	public void selectInMediaDetailsMenu(Media x) {
		Aims.mediaDetailsMenu();
		int selection = Integer.valueOf(System.console().readLine());
		switch(selection) {
			case 0: selectInStoreMenu(); break; //back
			case 1: //add to cart
			{boolean flag = cart.addMedia(x);
			if (flag){
				System.out.println(String.format("Number of medias: %d", cart.getItemsOrdered().size()));
			}
			selectInStoreMenu();
			break;
			}
			case 2: // play
			{if(x instanceof DigitalVideoDisc) {
				DigitalVideoDisc x_dvd = (DigitalVideoDisc)x;
				x_dvd.play();
			}
			else if(x instanceof CompactDisc) {
				CompactDisc x_cd = (CompactDisc)x;
				x_cd.play();
			}
			else 
				{System.out.println("Book cannot play! Try again!");}
			selectInStoreMenu();
			break;
			}
			default:{
				System.out.println("The selection is invalid!");
				selectInMediaDetailsMenu(x);
				break;
			}
		}
	}
	
	public  void selectInCartMenu() {
		int select;
		
		Aims.cartMenu();
		select = Integer.valueOf(System.console().readLine());
		switch(select) {
			case 0:{ //back
				selectInMenu();
				break;
			}
			case 1:{ //filter , not finish
				System.out.println("Enter choice: cost or title ? :");
				String choice = System.console().readLine();
				if (choice.equals("title")){
					System.out.println("Enter the title:");
					String title = System.console().readLine();
					for (Media media:cart.getItemsOrdered()){
						if (media.getTitle().equals(title)){
							System.out.println(media.toString());
						}
					}
				}
				else {
					System.out.println("Enter the cost:");
					float cost = Float.parseFloat(System.console().readLine());
					for (Media media: cart.getItemsOrdered()){
						if (media.getCost()==cost){
							System.out.println(media.toString());
						}
					}
				}
				selectInCartMenu();
				break;
			}
			case 2:{ // sort
				System.out.println("Enter choice: cost or title ?:");
				String choice = System.console().readLine();
				if (choice.equals("cost")){
					cart.sortCost();
					System.out.println("Successfully sort by cost");
				}
				else if (choice.equals("title")){
					cart.sortTitle();
					System.out.println("Successfully sort by title");
				}	
				selectInCartMenu();
				break;
			}
			case 3: { //remove 
				System.out.println("Enter title of Media: ");
				String media = System.console().readLine();
				Media x = cart.searchByTitle(media);
				if (x!=null){
					cart.removeMedia(x);
					store.addMedia(x);
					selectInMenu();
				}
				else {
					System.out.println("The media is not on the cart");
					selectInCartMenu();
				}

				break;
			}
			case 4: { //play
				System.out.println("Title of media:");
				String title = System.console().readLine();
				Media x = store.searchByTitle(title);
				if (x != null){
					if(x instanceof DigitalVideoDisc) {
						DigitalVideoDisc x_dvd = (DigitalVideoDisc)x;
						x_dvd.play();
					}
					else if(x instanceof CompactDisc) {
						CompactDisc x_cd = (CompactDisc)x;
						x_cd.play();
					}
					else System.out.println("Book cannot play!");
				}
				else{
					System.out.println("Your media is not on the store");
				}
				selectInCartMenu();
				break;
			}
			case 5: { //place order and empty current cart
				System.out.println("An order is created");
				cart.emptyCart();
				selectInMenu();
				break;
			}
		}
	}
	public static void main(String[] args) {
		Book book1 = new Book("messi");
		Book book2 = new Book("ansu");
		Cart cart = new Cart();
		Store store = new Store();
		store.addMedia(book1);
		store.addMedia(book2);
		Aims aims = new Aims(cart,store);

		aims.selectInMenu();

		
	}
}