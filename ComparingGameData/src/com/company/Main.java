package com.company;

public class Main {

    public static void main(String[] args) {
		String bestSellingData = args[0];
		BestSellingGame.read(bestSellingData);
		bestSellingData= args[1];
		BestSellingConsole.read(bestSellingData);
    	BestSelling.describeAll();
    }
}
