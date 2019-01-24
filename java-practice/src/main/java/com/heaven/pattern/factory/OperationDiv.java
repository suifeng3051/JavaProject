package com.heaven.pattern.factory;

import java.math.BigDecimal;

public class OperationDiv extends Operation{

	@Override
	public BigDecimal getResult() {
		
		return super.operatorA.divide(super.operatorB);
	}

}
