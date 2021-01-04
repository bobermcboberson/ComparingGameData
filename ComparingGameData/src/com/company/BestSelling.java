package com.company;

public class BestSelling {

    // Fields
    private String name;
    private int unitSold;
    private String releaseDate;
    private String creator;

    // Constructor
    public BestSelling(String name, int unitSold, String releaseDate, String creator) {
        this.name = name;
        this.unitSold = unitSold;
        this.releaseDate = releaseDate;
        this.creator = creator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnitSold() {
        return unitSold;
    }

    public void setUnitSold(int unitSold) {
        this.unitSold = unitSold;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}
