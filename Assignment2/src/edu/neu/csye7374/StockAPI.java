/**
 * 
 */
package edu.neu.csye7374;

import java.util.Random;

/**
 * @author jyoti
 *
 */
public abstract class StockAPI implements Tradable{

	private String ID;
	private double price;
	private String description;
	private double bid;
	private String tradeType;
	

	public String getTradeType() {
		return tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		int metric = getMetric();
		this.price = price+metric;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public abstract int getMetric();
//	{
//		double metric =0.0;
//		Random rand = new Random(System.currentTimeMillis());
//		for (int i=0; i<10; i++)
//		{
//			metric+= rand.nextDouble();
//		}
//		double avg=  metric/10;
//		double diff = avg - this.getPrice();
//		return (int) diff;
//	}
	
	public double getBid() {
		return bid;
	}
	
	@Override
	public String toString()
	{
		return "StockID: "+this.ID+ ", price: "+this.price + ", Metric: "+this.getMetric()+ ", description: "+this.description;
	}
	
	@Override
	public void setBid(double bid) {
		this.bid = bid;
	}
	
}
