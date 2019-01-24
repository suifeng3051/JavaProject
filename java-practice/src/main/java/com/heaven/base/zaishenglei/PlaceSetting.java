package com.heaven.base.zaishenglei;

public class PlaceSetting extends Custom{
	Spoon sp;
	Fork fk;
	Knife kf;
	DinnerPlate dp;
	PlaceSetting(int i){
		super(i+1);
		sp=new Spoon(i+2);
		fk=new Fork(i+3);
		kf=new Knife(i+4);
		dp=new DinnerPlate(i+5);
		System.out.println("PlaceSetting constructor");
	}
	public static void main(String[] args) {
		PlaceSetting ps=new PlaceSetting(9);
	}

}
