package com.miniProject;

import java.util.Scanner;

public class Test_Main_Functionalities {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("***** Welcome to console based application *****\n");
		
		System.out.println("1. Addition of two number ");
		System.out.println("2. Subtraction of two number ");
		System.out.println("3. Multiplication of two number ");
		System.out.println("4. Division of two number ");
		System.out.println("5. Modulus of two number ");
		System.out.println("6. Square of number ");
		System.out.println("7. Cube of number ");
		System.out.println("8. Average of numbers ");
		System.out.println("9. Factors of numbers ");
		System.out.println("10. Find out even or odd number ");
		System.out.println("\n-------------------------------------------------------\n");
		
		System.out.println("Enter your choice : ");
		int choice = scanner.nextInt();
		int no1;
		int no2;
		
		int Result=0;
		switch(choice)
		{
		case 1:
			
			System.out.println("Enter first number : ");
			 no1 = scanner.nextInt();
			System.out.println("Enter second number : ");
			no2 = scanner.nextInt();
			Addition addition = new Addition();
			addition.setA(no1);
			addition.setB(no2);
			 Result =addition.addition(no1, no2);
			System.out.println("Addition is : "+Result);
			break;
			
		case 2:
			
			System.out.println("Enter first number : ");
			 no1 = scanner.nextInt();
			System.out.println("Enter second number : ");
			 no2 = scanner.nextInt();
			Subtraction subtraction = new Subtraction();
			subtraction.setA(no1);
			subtraction.setB(no2);
			 Result =subtraction.subtraction(no1, no2);
			System.out.println("Subtraction  is : "+Result);
			break;
			
		case 3:
			
			
			System.out.println("Enter first number : ");
			 no1 = scanner.nextInt();
			System.out.println("Enter second number : ");
			 no2 = scanner.nextInt();
			Multiplication multiplication = new Multiplication();
			multiplication.setA(no1);
			multiplication.setB(no2);
			 Result =multiplication.multiplication(no1, no2);
			System.out.println("Multiplication is : "+Result);
			break;
			
		case 4:
			
			System.out.println("Enter first number : ");
			no1 = scanner.nextInt();
			System.out.println("Enter second number : ");
			no2 = scanner.nextInt();
			Division division = new Division();
			division.setA(no1);
			division.setB(no2);
			Result =division.division(no1, no2);
			System.out.println("Division is : "+Result);
			break;
			
		case 5:
			
			System.out.println("Enter first number : ");
			no1 = scanner.nextInt();
			System.out.println("Enter second number : ");
			no2 = scanner.nextInt();
			Modulus modulus = new Modulus();
			modulus.setA(no1);
			modulus.setB(no2);
			Result =modulus.modulus(no1, no2);
			System.out.println("Modulus is : "+Result);
			break;
		
		case 6:
			
			
			System.out.println("Enter any number : ");
			no1 = scanner.nextInt();
			Square square = new Square();
			square.setA(no1);
			Result =square.square(no1);
			System.out.println("Square is : "+Result);
			break;
			
		case 7:
			
			
			System.out.println("Enter any number : ");
			no1 = scanner.nextInt();
			Cube cube = new Cube();
			cube.setA(no1);
			Result =cube.cube(no1);
			System.out.println("Cube is : "+Result);
			break;
			
			
		case 8:
			
			System.out.println("Enter first number : ");
			 no1 = scanner.nextInt();
			System.out.println("Enter second number : ");
			no2 = scanner.nextInt();
			System.out.println("Enter third number : ");
			int no3 = scanner.nextInt();
			System.out.println("Enter fourth number : ");
			int no4 = scanner.nextInt();
			System.out.println("Enter fifth number : ");
			int no5 = scanner.nextInt();
			
			Average average = new Average();
			average.setNo1(no1);
			average.setNo2(no2);
			average.setNo3(no3);
			average.setNo4(no4);
			average.setNo5(no5);
			
			double Result1 =average.average(no1, no2,no3,no4,no5);
			
			System.out.println("Average is : "+Result1);
			break;
			
		case 9:
			
			System.out.println("Enter any number : ");
			no1 = scanner.nextInt();
			Factors factors = new Factors();
			factors.setA(no1);
			factors.factors(no1);
			break;
			
		case 10:
			
			System.out.println("Enter the number : ");
			no1 = scanner.nextInt();
			EvenOdd evenodd = new EvenOdd();
			evenodd.setA(no1);
			evenodd.evenOdd(no1);
			break;
			
			
		default:
			System.out.println("Incorrect input, Please try again.");
			
		}
		
		
		

	}

}
