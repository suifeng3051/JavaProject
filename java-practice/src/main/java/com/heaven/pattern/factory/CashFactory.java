package com.heaven.pattern.factory;
/**类型工厂：根据具体的应用类型返回相应的实例**/
public class CashFactory {
	public static final int NORMAL_TYPE=1;
	public static final int REBALTE_TYPE=2;
	public static final int RETURN_TYPE=3;
	
	public static CashSuper createCashAccept(int type){
		switch(type){
		case NORMAL_TYPE:
			return new CashNormal();
		case REBALTE_TYPE:
			return new CashRebate(0.8f);
		case RETURN_TYPE:
			return new CashReturn(300,200);
		default:
		return new CashNormal();
		}
		
	}

}
