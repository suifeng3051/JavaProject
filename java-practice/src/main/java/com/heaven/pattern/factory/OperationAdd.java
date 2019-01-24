package com.heaven.pattern.factory;

import java.math.BigDecimal;

public class OperationAdd extends Operation{

	@Override
	public BigDecimal getResult() {
		return super.operatorA.add(super.operatorB);
	}

}
