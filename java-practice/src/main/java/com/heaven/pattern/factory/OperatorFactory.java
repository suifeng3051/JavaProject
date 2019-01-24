package com.heaven.pattern.factory;

public class OperatorFactory {
	public static final int ASC_ADD=43;
	public static final int ASC_SUB=45;
	public static final int ASC_MUL=42;
	public static final int ASC_DIV=47;
	public static Operation getOperator(char operation){
		
		Operation oper=null;
		switch(operation){
			case ASC_ADD: 
				oper=new OperationAdd();
				break;
			case ASC_SUB: 
				oper=new OperationSub();
				break;
			case ASC_MUL: 
				oper=new OperationMultiple();
				break;
			case ASC_DIV: 
				oper=new OperationDiv();
				break;
		}
		return oper;
	}

}
