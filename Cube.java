package com.miniProject;

public class Cube implements CubeInterface{

private int a;
	
    public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	
    public int cube(int a)
	{
		return a*a*a;
	}
	
}
