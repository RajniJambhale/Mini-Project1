package com.miniProject;

public class Average implements AverageInterface
{

	int no1;
	int no2;
	int no3;
	int no4;
	int no5;
	public int getNo1() {
		return no1;
	}
	public void setNo1(int no1) {
		this.no1 = no1;
	}
	public int getNo2() {
		return no2;
	}
	public void setNo2(int no2) {
		this.no2 = no2;
	}
	public int getNo3() {
		return no3;
	}
	public void setNo3(int no3) {
		this.no3 = no3;
	}
	public int getNo4() {
		return no4;
	}
	public void setNo4(int no4) {
		this.no4 = no4;
	}
	public int getNo5() {
		return no5;
	}
	public void setNo5(int no5) {
		this.no5 = no5;
	}
	
	public double average(int no1,int no2,int no3,int no4,int no5)
	{
		int TotalSum = no1+no2+no3+no4+no5;
		System.out.println("Total sum is : "+TotalSum);
		double average = TotalSum/5;
		return average;
	}
}
