package com.miniProject;

import java.util.Scanner;

public class Addition implements AdditionInterface{

	
	private int a;
	private int b;
    public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
    public int addition(int a, int b)
	{
		return a+b;
	}
	

}
