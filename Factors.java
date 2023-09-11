package com.miniProject;

public class Factors implements FactorInterface
{

private int a;
	
    public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	
    public void factors(int a)
	{
    	System.out.println("Factors are : ");
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				System.out.println(i);
			}
		}
    	
	}
	
}
