package com.company;

public class BestSellinggames extends BestSelling {

    // Fields
    private String Developer;
    private String Publisher;

    // Constructor
    BestSellinggames(String name, int unitSold, String releaseDate, String creator, String developer, String publisher) {
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
}
