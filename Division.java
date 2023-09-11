package com.miniProject;

public class Division implements DivisionInterface
{

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
    public int division(int a, int b)
	{
    	try {
            return a / b;
        } catch (ArithmeticException e) {
            
            throw new RuntimeException("Division by zero is not allowed.");
        }
	}
}
