package hust.soict.dsai.aims.Aims;

import hust.soict.dsai.aims.cart.Cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        // Create a new cart
        Cart cart = new Cart();
        
        // Create some digital video discs
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        
        // Add the discs to the cart
        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);
        
        // Print the total cost of the items in the cart
        System.out.println("Total cost is " + cart.totalCost());
        
        // Remove some discs from the cart
        cart.removeDigitalVideoDisc(dvd2);
        cart.removeDigitalVideoDisc(dvd3);
    }
}