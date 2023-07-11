package com.pnc.chaining;

public class Test {
	
	public Test(){
		this(10);
		System.out.println("0 argument Constructor");
	}
	public Test(int a){
		this(10, 20);
		System.out.println("1 arguemnt Constructor");
	}
	public Test(int a , int b){
		System.out.println("2 arguemnt Constructor");
	}

}
