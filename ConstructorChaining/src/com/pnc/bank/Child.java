package com.pnc.bank;

public class Child extends Parent{
	Child(){
		this(10);
		System.out.println("0 arguemt Child Constructor");
	}
	Child(int a){
		this(10,20);
		System.out.println("1 argument Child constructor");
	}
	Child(int a, int b){
		super();
		System.out.println("2 argument Child Constructor");
	}
}
