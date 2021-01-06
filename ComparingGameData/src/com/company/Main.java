package com.company;

public class Main {

    public static void main(String[] args) {
	BestSelling object1 = new BestSellingConsole("Playstation Series", 155000000,"year 2000", "Sony", "Playstation 2", "GTA San Andreas");
	BestSelling object2 = new BestSellingGame("Minecraft", 200000000, "November 18, 2011", "Mojang", "Mojang Studios", "Mojang Studios");

	System.out.println(object1.getName() + " had sold " + object1.getUnitSold() + " units. The console was released " + object1.getReleaseDate() + " by " + object1.getCreator());
	System.out.println(object2.getName() + " had sold " + object2.getUnitSold() + " units. The game was released " + object2.getReleaseDate() + " by " + object2.getCreator());
    }
}
