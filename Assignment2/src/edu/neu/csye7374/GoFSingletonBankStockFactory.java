package edu.neu.csye7374;

public class GoFSingletonBankStockFactory extends AbstractStockAPIFactory{

	private static GoFSingletonBankStockFactory instance = new GoFSingletonBankStockFactory(); // Eager Singleton initialization
	
	private GoFSingletonBankStockFactory () {}
	
	@Override
	public StockAPI getObject() {
		
		return new BankStock();
	}
	
	public static GoFSingletonBankStockFactory getInstance() {
		return instance;
	   }

}
