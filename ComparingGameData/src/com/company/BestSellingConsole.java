package com.company;

public class BestSellingConsole extends BestSelling {

    // Fields
    private String ConsoleName;
    private String BestSellingGame;

    // Getters and Setters
    public String getConsoleName() {
        return ConsoleName;
    }

    public void setConsoleName(String consoleName) {
        ConsoleName = consoleName;
    }

    public String getBestSellingGame() {
        return BestSellingGame;
    }

    public void setBestSellingGame(String bestSellingGame) {
        BestSellingGame = bestSellingGame;
    }

    // Constructor
    public BestSellingConsole(int ranking, String name, int unitSold, String releaseDate, String creator, String consoleName, String bestSellingGame) {
        super(ranking, name, unitSold, releaseDate, creator);
        ConsoleName = consoleName;
        BestSellingGame = bestSellingGame;
    }

    // Methods
    public String toString() {
        String description = "\"" + this.getName();
        description = description + "\" has sold " + this.getUnitSold() + " units.";
        description = description + "\" The console was released " + this.getReleaseDate();
        description = description + "\" by " + this.getCreator();
        return description;
    }
}
