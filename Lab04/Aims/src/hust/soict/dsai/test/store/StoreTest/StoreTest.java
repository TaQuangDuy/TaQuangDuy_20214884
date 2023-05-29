package hust.soict.dsai.test.store.StoreTest;
import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store.Store;

public class StoreTest {
    public static void main (String[] args){
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(20);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(35);
        Store store = new Store();
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        System.out.println(store.getQty());

        store.removeMedia(dvd2);
        System.out.println(store.getQty());

    }
}