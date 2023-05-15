package hust.soict.dsai.test.store.StoreTest;
import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store.Store;
public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("ABC");
		store.addDVD(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("XYZ");
		store.addDVD(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("123");
		store.addDVD(dvd3);

        store.removeDVD(dvd2);
        store.removeDVD(dvd1);
        store.removeDVD(dvd3);
    }
}