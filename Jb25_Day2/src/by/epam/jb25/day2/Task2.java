package by.epam.jb25.day2;

import java.util.Scanner;

public class Task2 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		double a; 
		double b;
		double c;
		double square;
		double result;
		
		System.out.println("¬ведите переменную а");
		a = sc.nextDouble();
		System.out.println("¬ведите переменную b");
		b = sc.nextDouble();
		System.out.println("¬ведите переменную c");
		c = sc.nextDouble();
		
		square = Math.sqrt(Math.pow(a,2)+4*a*c);

		result = ((b+ square)/2*a)-Math.pow(a,3)*c+b;
		
		System.out.println("–езультат: "+ result);
		
	}

}
