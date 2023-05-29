package hust.soict.dsai.aims.store.Store;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.Disc;
import hust.soict.dsai.aims.media.Media;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();
    public int getQty(){
        return this.itemsInStore.size();
    }
    public boolean addMedia(Media media){
        for(Media name:itemsInStore){
            if (media.equals(name)){
                return false;
            }
        }
        itemsInStore.add(media);
        return true;
    }
    public boolean removeMedia(Media media){
        for (Media name :itemsInStore){
            if (media.equals(name)){
                itemsInStore.remove(media);
                return true;
            }
        }
        return false;
    }
    public boolean checkMedia(Media media){
        for (Media name : itemsInStore){
            if (media.equals(name)){
                return true;
            }
        }
        return false;
        
    }
    public Media searchByTitle(String title) {
        for (Media media: itemsInStore){
            if (media.getTitle().equals(title)){
                return media;
            }
        }
        return null;
    }
    public void available(){
        System.out.println("-----Items in store------");
        for (Media media: itemsInStore){
            System.out.println(media.toString());
        }

    }
    public static void main(String[] args){
        Store store = new Store();
        Media med1 = new Disc();
        Media med2 = new Disc();
        store.addMedia(med1);
        store.addMedia(med2);
        store.removeMedia(med2);
        System.out.println(store.getQty());

    }
    
}