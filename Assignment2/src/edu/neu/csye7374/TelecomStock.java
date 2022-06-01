package edu.neu.csye7374;

import java.util.Random;

public class TelecomStock extends StockAPI {

	@Override
	public int getMetric() {
		double metric =0.0;
		Random rand = new Random(System.currentTimeMillis());
		for (int i=0; i<10; i++)
		{
			double start = rand.nextDouble()*0.8;
			double end = rand.nextDouble()*20;
			double random = new Random(System.currentTimeMillis()+9).nextDouble();
		    metric = start + (random * (end - start));	
			//metric+= rand.nextDouble()*0.8;
		}
		double avg=  metric/10;
		double diff = avg - this.getPrice() + 30;
		return (int) diff;
		
	}
		

}
