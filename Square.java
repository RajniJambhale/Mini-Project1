package com.miniProject;

public class Square implements SquareInterface
{

	private int a;
	
    public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	
    public int square(int a)
	{
		return a*a;
	}

}
