package edu.neu.csye7374;

public class GoFTelecomStockFactory extends AbstractStockAPIFactory{

	public StockAPI getObject() {
		
		return new TelecomStock();
	}
}