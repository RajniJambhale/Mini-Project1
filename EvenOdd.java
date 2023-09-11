package com.miniProject;

public class EvenOdd implements EvenOddInterface
{

private int a;
	
    public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	
    public void evenOdd(int a)
	{
		if(a%2==0)
		{
			System.out.println("It's even number ");
		}
		else
		{
			System.out.println(" It's odd number ");
		}
	}
}
