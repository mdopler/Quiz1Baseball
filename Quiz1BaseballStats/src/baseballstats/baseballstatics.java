package baseballstats;


import java.util.Scanner;


public class baseballstatics {
	

	private double atbats;
	
	private double hits;
	
	private double doubles;
	
	private double triples;
	
	private double homeruns;
	
	private double runs; 
	
	private double walks;
	
	
	
	public baseballstatics() {
	
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
		
		
		baseballstatics outputs = new baseballstatics();
		
		
		System.out.println("Enter number of at bats:");
		
		
		outputs.atbats = inputs.nextDouble();
		
		System.out.println("Enter bumber of hits:");
		
		outputs.hits = inputs.nextDouble();
		
		System.out.println("Enter number of doubles:");
		
		outputs.doubles = inputs.nextDouble();
		
		System.out.println("Enter number of triples:");
		
		outputs.triples = inputs.nextDouble();
		
		System.out.println("Enter number of home runs:");
		
		outputs.homeruns = inputs.nextDouble();
		
		System.out.println("Enter number of runs:");
		
		outputs.runs = inputs.nextDouble();
		
		System.out.println("Enter number of walks:");
		
		outputs.walks = inputs.nextDouble();
		
		inputs.close();
		
		
		System.out.print("Batting Average: " + outputs.battingaverage() + ", On Base Percentage: " + outputs.onbasepercentage() + ", Total Bases: " + outputs.totalbases() + ", Slugging Percentage: " + outputs.sluggingpercentage() + ", On Base + Slugging Percentage: " + outputs.onbasesluggingpercentage());
	}

}

