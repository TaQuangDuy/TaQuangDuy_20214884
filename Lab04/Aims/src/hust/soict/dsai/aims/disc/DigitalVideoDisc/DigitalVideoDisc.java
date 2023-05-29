package hust.soict.dsai.aims.disc.DigitalVideoDisc;

import hust.soict.dsai.aims.media.Disc;
import hust.soict.dsai.aims.media.Playable;

public class DigitalVideoDisc extends Disc implements Playable{


    private String director = "";
    private int length = 0;
    private static int nbDigitalVideoDiscs = 0;


    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public String toString(){
        return String.format("Class: %s,ID: %s, Title: %s , Category %s , Director: %s ,Length %d ,Cost %f",this.getClass(),this.getId(), this.getTitle(),
        this.getCategory(),this.getDirector(),this.getLength(),this.getCost());
    }

    public boolean isMatch(String title){
        return title == this.getTitle();
    }
    public DigitalVideoDisc(String title) {
        this.setTitle(title);
        nbDigitalVideoDiscs += 1;
        this.setId(nbDigitalVideoDiscs); 

    }
    
    public DigitalVideoDisc() {
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
        nbDigitalVideoDiscs += 1;
        this.setId(nbDigitalVideoDiscs);

    }
    
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.setTitle(title);
        this.setCategory(category);
        this.director = director;
        this.length = length;
        this.setCost(cost);
        nbDigitalVideoDiscs += 1;
        this.setId(nbDigitalVideoDiscs);

    }
    public DigitalVideoDisc(float cost) {
        this.setCost(cost);
        nbDigitalVideoDiscs +=1;
        this.setId(nbDigitalVideoDiscs);

    }
    public DigitalVideoDisc(int id, String title, String category, float cost, String director2, int length2) {
        this.setId(id);
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
        this.director = director2;
        this.length = length2;

    }
    public void play(){
        System.out.println("Playing DVD: "+this.getTitle());
        System.out.println("DVD length: "+this.getLength());
    }
    public static void main(String[] args){
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("f1");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("f2");
        System.out.println(dvd1.getId());
        System.out.println(dvd2.getId());

    }
}