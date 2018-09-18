package baseballstats;


import java.util.Scanner;


public class baseballstatscalculator {
	

	private double atbats;
	
	private double hits;
	
	private double doubles;
	
	private double triples;
	
	private double homeruns;
	
	private double runs; 
	
	private double walks;
	
	
	
	public baseballstatscalculator() {
	
	}
		
	public double battingaverage() {
		
		return (this.hits / this.atbats);
		
	}

	public double onbasepercentage() {
		
		return ((this.hits + this.walks) / (this.atbats + this.walks));

	}
	
	public double totalbases() {
		
		return (this.doubles * 2 + this.triples * 3 + this.homeruns * 4 + (this.hits - (this.doubles + this.triples + this.homeruns)));
	
	}
	
	public double onbasesluggingpercentage() {
		
		return (this.onbasepercentage() + this.sluggingpercentage());
		
	}
	
	public double sluggingpercentage() {
		
		return (this.totalbases() / this.atbats);
		
	}
	
	public static void main(String[] args) {
		
		
		Scanner inputs = new Scanner(System.in);
		
		
		baseballstatscalculator outputs = new baseballstatscalculator();
		
		
		System.out.println("Enter statistics for: At Bats, Hits, Doubles, Triples, Home Runs, Runs, Walks.");
		
		
		outputs.atbats = inputs.nextDouble();
		outputs.hits = inputs.nextDouble();
		outputs.doubles = inputs.nextDouble();
		outputs.triples = inputs.nextDouble();
		outputs.homeruns = inputs.nextDouble();
		outputs.runs = inputs.nextDouble();
		outputs.walks = inputs.nextDouble();
		inputs.close();
		
		System.out.print("Batting Average: " + outputs.battingaverage() + ", On Base Percentage: " + outputs.onbasepercentage() + ", Total Bases: " + outputs.totalbases() + ", Slugging Percentage: " + outputs.sluggingpercentage() + ", On Base + Slugging Percentage: " + outputs.onbasesluggingpercentage());
	}

}

