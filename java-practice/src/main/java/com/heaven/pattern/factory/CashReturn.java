package com.heaven.pattern.factory;
import java.math.BigDecimal;
/**返利算法子类**/
public class CashReturn extends CashSuper{
	private double moneyCondition=0;
	private double moneyReturn=0;
	
	CashReturn(int moneyCondition,int moneyReturn){
		this.moneyCondition=moneyCondition;
		this.moneyReturn=moneyReturn;
	}
	@Override
	public BigDecimal acceptCash(BigDecimal cash) {
		double needReturn=(cash.longValue()/moneyCondition)*moneyReturn;
		return cash.subtract(new BigDecimal(needReturn));
	}

}
