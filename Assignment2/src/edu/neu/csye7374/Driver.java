package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class Driver {

	public static void main(String[] args) {
		StockMarket.demo(); }
//		
//		//creating market
//		StockMarket SM = StockMarket.getInstance();
//		System.out.println("Stocks: ");
//		SM.showStocks();
//		System.out.println("TradedStocks: ");
//		SM.showTrades();
//		
//		
//		// Using GoFFactory Pattern method
//		
//		AbstractStockAPIFactory f1 = new GoFBankStockFactory();
//		AbstractStockAPIFactory f2 = new GoFTelecomStockFactory();
//		StockAPI s1 = f1.getObject();
//		StockAPI s2 = f1.getObject();
//		StockAPI s3 = f2.getObject();
//		StockAPI s4 = f2.getObject();
//		s1.setID("Bank Of America");s1.setPrice(13.0);s1.setDescription("BOfA");s1.setBid(0.0);s1.setTradeType(null);
//		s2.setID("Chase");s2.setPrice(17.0);s2.setDescription("Chase Bank in USA");s2.setBid(0.0);s2.setTradeType(null);
//		s3.setID("ATnT");s3.setPrice(22.0);s3.setDescription("largest telecom in USA");s3.setBid(0.0);s3.setTradeType(null);
//		s4.setID("Tmobile");s4.setPrice(9.0);s4.setDescription("telecom in USA");s4.setBid(0.0);s4.setTradeType(null);
//		SM.addStock(s1);
//		SM.addStock(s2);
//		SM.addStock(s3);
//		SM.addStock(s4);		
//	
//		//viewing stocks
//		System.out.println("First display of stock market");
//		SM.showStocks();
//		
//		System.out.println("--------------------------------------------------------------------");	
//		// simulation of trading on s1
//		for (int i=0; i<3; i++)
//		{
//			double start = s1.getPrice();
//			double end = s1.getPrice()+s1.getMetric();
//			double random = new Random(System.currentTimeMillis()+9).nextDouble();
//			double bid_now = start + (random * (end - start));
//			System.out.println("Bidding on BofA: "+bid_now);
//			System.out.println("After bid on BofA of stock market");
//			s1.setBid(bid_now);
//			SM.showStocks();
//			System.out.println("After trade on BofA of stock market");
//			SM.trade(s1);
//			SM.showTrades();	
//		}
//		
//		System.out.println("--------------------------------------------------------------------");
//		// simulation of trading on s2
//		for (int i=0; i<3; i++)
//		{
//			double start = s2.getPrice();
//			double end = s2.getPrice()+s2.getMetric();
//			double random = new Random(System.currentTimeMillis()+7).nextDouble();
//			double bid_now = start + (random * (end - start));
//			System.out.println("Bidding on Chase: "+bid_now);
//			System.out.println("After bid on Chase of stock market");
//			s2.setBid(bid_now);
//			SM.showStocks();
//			System.out.println("After trade on Chase of stock market");
//			SM.trade(s2);
//			SM.showTrades();	
//		}
//		System.out.println("--------------------------------------------------------------------");
//		// simulation of trading on s3
//		for (int i=0; i<3; i++)
//		{
//			double start = s3.getPrice();
//			double end = s3.getPrice()+s3.getMetric();
//			double random = new Random(System.currentTimeMillis()+13).nextDouble();
//			double bid_now = start + (random * (end - start));
//			System.out.println("Bidding on ATnT: "+bid_now);
//			System.out.println("After bid on ATnT of stock market");
//			s3.setBid(bid_now);
//			SM.showStocks();
//			System.out.println("After trade on ATnT of stock market");
//			SM.trade(s3);
//			SM.showTrades();	
//		}
//		System.out.println("--------------------------------------------------------------------");
//		// simulation of trading on s4
//		for (int i=0; i<3; i++)
//		{
//			double start = s4.getPrice();
//			double end = s4.getPrice()+s4.getMetric();
//			double random = new Random(System.currentTimeMillis()+19).nextDouble();
//			double bid_now = start + (random * (end - start));
//			System.out.println("Bidding on Tmobile: "+bid_now);
//			System.out.println("After bid on Tmobile of stock market");
//			s4.setBid(bid_now);
//			SM.showStocks();
//			System.out.println("After trade on Tmobile of stock market");
//			SM.trade(s4);
//			SM.showTrades();	
//		}
//
//		//viewing stocks
//		SM.showStocks();
//		System.out.println("Adding another stocks using GoF+Singleton");
//
//		System.out.println("************************************************************************");	
//// *****************************************************************************************************************************		
//		// Using GoFFactory Pattern method + Singleton
//		
//		AbstractStockAPIFactory f3 = GoFSingletonBankStockFactory.getInstance();
//		AbstractStockAPIFactory f4 = GoFSingletonTelecomFactory.getInstance();
//		StockAPI s5 = f3.getObject();
//		StockAPI s6 = f3.getObject();
//		StockAPI s7 = f4.getObject();
//		StockAPI s8 = f4.getObject();
//		s5.setID("Santander Bank");s5.setPrice(13.0);s5.setDescription("SB");s5.setBid(0.0);s5.setTradeType(null);
//		s6.setID("Needham Bank");s6.setPrice(17.0);s6.setDescription("Needham Bank in USA");s6.setBid(0.0);s6.setTradeType(null);
//		s7.setID("Mint");s7.setPrice(22.0);s7.setDescription("fresh telecom in USA");s7.setBid(0.0);s7.setTradeType(null);
//		s8.setID("H2O");s8.setPrice(9.0);s8.setDescription("cheapest in USA");s8.setBid(0.0);s8.setTradeType(null);
//		SM.addStock(s5);
//		SM.addStock(s6);
//		SM.addStock(s7);
//		SM.addStock(s8);
//		
//		//viewing stocks
//		SM.showStocks();
//		
//		System.out.println("--------------------------------------------------------------------");	
//		// simulation of trading on s5
//		for (int i=0; i<3; i++)
//		{
//			double start = s5.getPrice();
//			double end = s5.getPrice()+s5.getMetric();
//			double random = new Random(System.currentTimeMillis()+9).nextDouble();
//			double bid_now = start + (random * (end - start));
//			System.out.println("Bidding on Santander: "+bid_now);
//			System.out.println("After bid on Santander of stock market");
//			s5.setBid(bid_now);
//			SM.showStocks();
//			System.out.println("After trade on Santander of stock market");
//			SM.trade(s5);
//			SM.showTrades();	
//		}
//		
//		System.out.println("--------------------------------------------------------------------");
//		// simulation of trading on s6
//		for (int i=0; i<3; i++)
//		{
//			double start = s6.getPrice();
//			double end = s6.getPrice()+s6.getMetric();
//			double random = new Random(System.currentTimeMillis()+7).nextDouble();
//			double bid_now = start + (random * (end - start));
//			System.out.println("Bidding on Needham: "+bid_now);
//			System.out.println("After bid on Needham of stock market");
//			s6.setBid(bid_now);
//			SM.showStocks();
//			System.out.println("After trade on Needham of stock market");
//			SM.trade(s6);
//			SM.showTrades();	
//		}
//		System.out.println("--------------------------------------------------------------------");
//		// simulation of trading on s7
//		for (int i=0; i<3; i++)
//		{
//			double start = s7.getPrice();
//			double end = s7.getPrice()+s7.getMetric();
//			double random = new Random(System.currentTimeMillis()+13).nextDouble();
//			double bid_now = start + (random * (end - start));
//			System.out.println("Bidding on Mint: "+bid_now);
//			System.out.println("After bid on Mint of stock market");
//			s7.setBid(bid_now);
//			SM.showStocks();
//			System.out.println("After trade on Mint of stock market");
//			SM.trade(s7);
//			SM.showTrades();	
//		}
//		System.out.println("--------------------------------------------------------------------");
//		// simulation of trading on s8
//		for (int i=0; i<3; i++)
//		{
//			double start = s8.getPrice();
//			double end = s8.getPrice()+s8.getMetric();
//			double random = new Random(System.currentTimeMillis()+19).nextDouble();
//			double bid_now = start + (random * (end - start));
//			System.out.println("Bidding on H2O: "+bid_now);
//			System.out.println("After bid on H2O of stock market");
//			s8.setBid(bid_now);
//			SM.showStocks();
//			System.out.println("After trade on H2O of stock market");
//			SM.trade(s8);
//			SM.showTrades();	
//		}
//
//		
//		
//		System.out.println("--------------------------------------------------------------------");
//		System.out.println("End of day Display of stock market");
//		SM.showStocks();
//		System.out.println("End of day trades executed");
//		SM.showTrades();
// }
}
	
