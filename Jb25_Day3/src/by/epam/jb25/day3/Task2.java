package by.epam.jb25.day3;

import java.util.Scanner;

public class Task2 {


	public static void main(String[] args) {
		double f;
		double x; 
		double a = 0; //������ �������
		double b = 50; //����� �������
		double h; //���
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����� �");
		x=sc.nextDouble();
		System.out.println("������� ����� ���� h");
		h=sc.nextDouble();
		
		
		while (x<b){
			x=x+h;
			f = 2*Math.tan(x/2)+1;
			System.out.println(x + "|" +f);
		}	
		

	}

}
