package com.heaven.pattern.factory;

import java.math.BigDecimal;

public class TestCash {
	public static void main(String[] args) {
		CashSuper normalCash=CashFactory.createCashAccept(CashFactory.NORMAL_TYPE);
		CashSuper rebateCash=CashFactory.createCashAccept(CashFactory.REBALTE_TYPE);
		CashSuper returnCash=CashFactory.createCashAccept(CashFactory.RETURN_TYPE);
		System.out.println(normalCash.acceptCash(new BigDecimal(1000)));
		System.out.println(rebateCash.acceptCash(new BigDecimal(1000)));
		System.out.println(returnCash.acceptCash(new BigDecimal(1000)));

		
	}

}
