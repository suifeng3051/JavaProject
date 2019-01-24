package com.heaven.pattern.factory;

import java.math.BigDecimal;

public class OperationMultiple extends Operation{

	@Override
	public BigDecimal getResult() {
		
		return super.operatorA.multiply(super.operatorB);
	}

}
