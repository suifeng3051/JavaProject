package com.heaven.pattern.factory;

import java.math.BigDecimal;

/**
 * @author Administrator
 *对计算器抽象出一个操作运算接口
 */
public abstract class Operation {
	public BigDecimal operatorA;//操作数a
	public BigDecimal operatorB;//操作数b
	public abstract BigDecimal getResult();
	
}
