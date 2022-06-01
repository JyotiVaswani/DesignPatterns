package edu.neu.csye7374;

import java.util.Random;

public class BankStock extends StockAPI{

	
	@Override
	public int getMetric() {
		double metric =0.0;
		Random rand = new Random(System.currentTimeMillis());
		for (int i=0; i<10; i++)
		{
			metric+= rand.nextDouble()*1.20;
		}
		double avg=  metric/10;
		double diff = avg - this.getPrice() + 20;
		return (int) diff;
	}


}
