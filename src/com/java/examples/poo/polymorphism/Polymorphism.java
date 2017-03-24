package com.java.examples.poo.polymorphism;

class Movie {

	private String movie;

	public Movie(String movie) {
		super();
		this.movie = movie;
	}

	public String plot() {
		return "not plot here!";
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

}

class Jaws extends Movie {

	public Jaws() {
		super("Jaws");
	}

	public String plot() {
		return "Sharks eats a lot of people!";
	}

}

class IndependenceDay extends Movie {

	public IndependenceDay() {
		super("Independence Day");
	}

	@Override
	public String plot() {
		return "Aliens attempt to take over the planet earth!";
	}

}

class MazeRunner extends Movie {

	public MazeRunner() {
		super("Maze runner");
	}

	@Override
	public String plot() {
		return "Kids try and escape a maze!";
	}

}

class StarWars extends Movie {

	public StarWars() {
		super("Star wars");
	}

	@Override
	public String plot() {
		return "Imperial forces try to take over the universe!";
	}

}

class Forgetable extends Movie {

	public Forgetable() {
		super("Forgetable");
	}

}

public class Polymorphism {

	public static void main(String args[]) {

		for (int i = 0; i < 11; i++) {
			Movie movie = randomMovie();
			System.out.println("Movie #" + i + ":" + movie.getMovie() + "\n" + "Plot:" + movie.plot() + "\n");
		}
	}

	public static Movie randomMovie() {
		int randonNumber = (int) (Math.random() * 5) + 1;
		System.out.println("Random number was:" + randonNumber);

		switch (randonNumber) {
		case 1:
			return new Jaws();
		case 2:
			return new IndependenceDay();
		case 3:
			return new MazeRunner();
		case 4:
			return new StarWars();
		case 5:
			return new Forgetable();
		}
		return new Movie("Not a Case!");
	}
}
