package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Polymorphism {
    public static void main(String[] args){
        List<Media> mediae = new ArrayList<>();
        CompactDisc cd = new CompactDisc();
        DigitalVideoDisc dvd = new DigitalVideoDisc();
        Book book = new Book();
        mediae.add(cd);
        mediae.add(dvd);
        mediae.add(book);
        Track track = new Track("Spider man", 20);
        cd.addTrack(track);
        for (Media med :mediae){
            System.out.println(med.toString());
        }
        }
}