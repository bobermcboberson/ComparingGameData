package com.company;

public class BestSellingGame extends BestSelling {

    // Fields
    private String Developer;
    private String Publisher;

    // Constructor
    BestSellingGame(String name, int unitSold, String releaseDate, String creator, String developer, String publisher) {
        super(name, unitSold, releaseDate, creator);
        Developer = developer;
        Publisher = publisher;
    }

    // Getters and Setters
    public String getDeveloper() {
        return Developer;
    }

    public void setDeveloper(String developer) {
        Developer = developer;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    // Methods
    public String toString() {
        String description = "\"" + this.getName();
        description = description + "\" has sold " + this.getUnitSold() + " units.";
        description = description + "\" The game was released " + this.getReleaseDate();
        description = description + "\" by " + this.getCreator();
        return description;
    }
}
