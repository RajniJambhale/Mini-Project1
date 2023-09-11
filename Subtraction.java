package com.miniProject;

public class Subtraction implements SubtractionInterface{

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
    public int subtraction(int a, int b)
	{
		return a-b;
	}
	

}
