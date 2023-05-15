package hust.soict.dsai.aims.cart.Cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20; 

    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full");
            return;
        }
        itemsOrdered[qtyOrdered++] = disc;
        System.out.println("The disc has been added");
    }

    // Overloaded addDigitalVideoDisc method that can add multiple discs
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc disc : dvdList) {
            addDigitalVideoDisc(disc);
        }
    }

    // Overloaded addDigitalVideoDisc method that can add two discs at once
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int removedIndex = -1;
        for (int i = 0; i < qtyOrdered; ++i) {
            if (itemsOrdered[i] == disc) {
                removedIndex = i;
            }
        }
        if (removedIndex == -1) {
            return;
        }
        System.out.println("The disc " + (removedIndex + 1) + " has been removed");
        for (int i = removedIndex; i < qtyOrdered; ++i) {
            itemsOrdered[i] = itemsOrdered[i + 1]; 
        }
        qtyOrdered--;
    }

    public float totalCost() {
        float totalCost = 0;
        for (int i = 0; i < qtyOrdered; ++i) {
            totalCost += itemsOrdered[i].getCost();
        }
        return totalCost;
    }

    // New method to print the contents of the cart
    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            DigitalVideoDisc disc = itemsOrdered[i];
            System.out.println((i + 1) + ". DVD - " + disc.toString() + ": " + disc.getCost() + " $");
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }

    // New method to search for a disc by ID
    public void searchByID(int id) {
        boolean found = false;
        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc != null && disc.getId() == id) {
                System.out.println("Found DVD with ID " + id + ": " + disc.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVD found with ID " + id);
        }
    }

    // New method to search for a disc by title
    public void searchByTitle(String title) {
        boolean found = false;
        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc != null && disc.isMatch(title)) {
                System.out.println("Found DVD with title '" + title + "': " + disc.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVD found with title '" + title + "'");
        }
    }
}