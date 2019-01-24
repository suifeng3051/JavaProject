package com.heaven.pattern.factory;

import java.math.BigDecimal;
/**正常收费子类**/
public class CashNormal extends CashSuper{

	@Override
	//直接返回实际金额即可
	public BigDecimal acceptCash(BigDecimal cash) {
		
		return cash;
	}

}
