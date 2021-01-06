package com.company;

public class BestSellingConsole extends BestSelling {

    private String ConsoleName;
    private String BestSellingGame;

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

    public BestSellingConsole(String name, int unitSold, String releaseDate, String creator, String consoleName, String bestSellingGame) {
        super(name, unitSold, releaseDate, creator);
        ConsoleName = consoleName;
        BestSellingGame = bestSellingGame;



    }
}
