/* 7 Write a Java program to check whether the triangle is equilateral, isosceles or scalene triangle.*/

import java.util.*;

class TriangleType7
{
		public static void main(String[]args)
		{
			Scanner sc = new Scanner(System.in);

			System.out.print("\n\t\t\tEnter side 1 :  ");
			int a = sc.nextInt();
	
			System.out.print("\t\t\tEnter side 2  :   ");
			int b = sc.nextInt();

			System.out.print("\t\t\tEnter side 3  : ");
			int c = sc.nextInt();
			System.out.println("\t\t\t===============");

			if(a<b+c && b<a+c && c<a+b)
			{
				if(a==b && b==c)
				{
				  System.out.println("\t\t\tEquilateral triangle");
				 }
			      	 else if(a==b || b==c || c==a)
					 {
						System.out.println("\t\t\tIsosceles triangle");
				        }
							else
							  System.out.println("\t\t\tScalene triangle");
		     }
					else
						System.out.println("\t\t\tCannot form a triangle");
	
		}
}