package com.bridge;

public interface IStockService {

	void addstocks(String stockName, int share, long sharePrice);
	void printReport();
	void debit();

}
