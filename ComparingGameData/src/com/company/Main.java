package com.company;

public class Main {

    public static void main(String[] args) {
		String bestSellingData = args[0];
		BestSellingGame.read(bestSellingData);
		BestSellingConsole.read(bestSellingData);
    	BestSelling.describeAll();
    }
}
