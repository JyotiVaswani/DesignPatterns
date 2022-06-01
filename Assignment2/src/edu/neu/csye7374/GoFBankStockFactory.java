package edu.neu.csye7374;

public class GoFBankStockFactory extends AbstractStockAPIFactory{

	public StockAPI getObject() {
		
		return new BankStock();
	}

}
