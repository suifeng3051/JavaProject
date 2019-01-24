package com.heaven.pattern.factory;

import java.math.BigDecimal;

/**折扣收费子类**/
public class CashRebate extends CashSuper{
	private float debate=1;
	
	CashRebate(float debate){
		this.debate=debate;
	}
	@Override
	public BigDecimal acceptCash(BigDecimal cash) {
		return cash.multiply(new BigDecimal(debate));
	}

}
