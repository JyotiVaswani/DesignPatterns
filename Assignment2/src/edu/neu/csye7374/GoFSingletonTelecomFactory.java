package edu.neu.csye7374;

public class GoFSingletonTelecomFactory extends AbstractStockAPIFactory{

	private static GoFSingletonTelecomFactory instance = null; // Lazy Singleton initialization
	
	private GoFSingletonTelecomFactory () {}
	
	@Override
	public StockAPI getObject() {
		
		return new TelecomStock();
	}
	
	public static GoFSingletonTelecomFactory getInstance() {
		if (instance == null) {
			instance = new GoFSingletonTelecomFactory();
		}
		return instance;
	   }
}
