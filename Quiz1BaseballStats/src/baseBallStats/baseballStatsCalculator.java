package baseBallStats;


import java.util.Scanner;


public class baseballStatsCalculator {
	

	private double atBats;
	
	private double hits;
	
	private double doubles;
	
	private double triples;
	
	private double homeRuns;
	
	private double runs; 
	
	private double walks;
	
	public static void main(String[] args) {
		
		Scanner statsIn = new Scanner(System.in);
		
		baseballStatsCalculator statStore = new baseballStatsCalculator();
		
		System.out.println("Enter statistics in this order: At Bats, Hits, Doubles, Triples, Home Runs, Runs, Walks.");

		statStore.atBats = statsIn.nextDouble();
		statStore.hits = statsIn.nextDouble();
		statStore.doubles = statsIn.nextDouble();
		statStore.triples = statsIn.nextDouble();
		statStore.homeRuns = statsIn.nextDouble();
		statStore.runs = statsIn.nextDouble();
		statStore.walks = statsIn.nextDouble();
		statsIn.close();
		
		System.out.print("Batting average: " + statStore.battingAverage() + ", On base percentage: " + statStore.onBasePercentage() + ", Total bases: " + statStore.totalBases() + ", Slugging percentage: " + statStore.sluggingPercentage() + ", On base + slugging percentage: " + statStore.onBaseSluggingPercentage());
	}
	
	public baseballStatsCalculator() {
	
	}
		
	public double battingAverage() {
		
		return (this.hits / this.atBats);
		
	}

	public double onBasePercentage() {
		
		return ((this.hits + this.walks) / (this.atBats + this.walks));

	}
	
	public double totalBases() {
		
		return (this.doubles * 2 + this.triples * 3 + this.homeRuns * 4+(this.hits-(this.doubles + this.triples + this.homeRuns)));
	
	}
	
	public double onBaseSluggingPercentage() {
		
		return (this.onBasePercentage() + this.sluggingPercentage());
		
	}
	
	public double sluggingPercentage() {
		
		return (this.totalBases() / this.atBats);
		
	}


}

