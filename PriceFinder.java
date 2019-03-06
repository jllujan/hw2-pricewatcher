package base;

public class PriceFinder {
	
	// reset price to random double between 3,000 and 2,000
	public double randomPrice(double startingPrice) {
		double percentOfChange = .5;
		
		return (Math.random() * startingPrice + (startingPrice * percentOfChange)) + (startingPrice - (startingPrice * percentOfChange));
	}
}
