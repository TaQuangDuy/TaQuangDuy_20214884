package hust.soict.dsai.aims.cart.Cart;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>(MAX_NUMBERS_ORDERED);
    
    
    public ArrayList<Media> getItemsOrdered() {
        return itemsOrdered;
    }
    public void emptyCart(){
        this.itemsOrdered = new ArrayList<Media>();
    }
    public boolean addMedia(Media media){
        if (itemsOrdered.size() > 20){
            return false;
        }
        else{
            for (Media name:itemsOrdered){
                if (media.equals(name)){
                    return false;
                }
            }
            itemsOrdered.add(media);
            return true;
        }
    }
    public boolean removeMedia(Media media){
        for (Media name : itemsOrdered){
            if (media.equals(name)){
                itemsOrdered.remove(media);
                return true;
            }
        }
        return false;
    }
    public Media searchByTitle(String title){
        for (Media media: itemsOrdered){
            if (media.getTitle().equals(title)){
                return media;
            }
        }
        return null;
    }
    public void sortTitle(){
        itemsOrdered.sort(Media.COMPARE_BY_TITLE_COST);
    }
    public void sortCost(){
        itemsOrdered.sort(Media.COMPARE_BY_COST_TITLE);
    }
    public float totalCost(){
        float res = 0;
        for (Media name : itemsOrdered){
            float cost = name.getCost();
            res += cost;
        }
        return res;
    }
    public static void main(String[] args){


    }

    public void displayCart() {
        System.out.println("------Items in Cart-------");

        for (Media media: itemsOrdered){
            System.out.println(media.toString());
        }
    }

}