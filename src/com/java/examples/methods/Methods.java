package com.java.examples.methods;

class Methods {

	
	public static void main(String[] args){
		
		int position = calculateHighScore(1500);
		displayHighScorePosition("John", position);
		position = calculateHighScore(900);
		displayHighScorePosition("Mat", position);
		position = calculateHighScore(400);
		displayHighScorePosition("Arthur", position);
		position = calculateHighScore(50);
		displayHighScorePosition("Andy", position);
		
	}
	
	public static int calculateHighScore(int score){
		int position = 4;
		if(score >1000){
			position = 1;
		}else if(score >500){
			position = 2;
		}else if(score >100){
			position=3;
		}
		return position;
	}
	
	public static void displayHighScorePosition(String name, int position){
		System.out.println(name + " is in position "+ position + " on the high score position table");
	}
}
