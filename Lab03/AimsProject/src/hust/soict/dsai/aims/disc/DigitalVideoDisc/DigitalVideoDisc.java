package hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class DigitalVideoDisc {
    private static int nbDigitalVideoDiscs = 0; // Class attribute
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int id; // Instance attribute

    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
        this.id = ++nbDigitalVideoDiscs; // Update id and nbDigitalVideoDiscs
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs; // Update id and nbDigitalVideoDiscs
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs; // Update id and nbDigitalVideoDiscs
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs; // Update id and nbDigitalVideoDiscs
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public int getId() {
        return id;
    }

    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    // New method to check if the disc title matches a given string
    public boolean isMatch(String title) {
        return this.title.equalsIgnoreCase(title);
    }

    // Override the toString method to display the disc properties
    @Override
    public String toString() {
        return "DVD - Title: " + title + " - Category: " + category +
                " - Director: " + director + " - Length: " + length +
                " - Price: $" + cost;
    }
}