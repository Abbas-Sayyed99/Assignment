/* 3 If the three sides of a triangle are entered through the keyboard,
write a program to check whether the triangle is valid or not. The
triangle is valid if the sum of two sides is greater than the largest of
the three sides.*/

import java.util.*;

class ValidTriangle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.print("\n\t\t\tEnter first side of a triangle : ");
			int S1 = sc.nextInt();
		System.out.print("\t\t\tEnter second side of a triangle : ");
			int S2 = sc.nextInt();
		System.out.print("\t\t\tEnter first third of a triangle : ");
			int S3 = sc.nextInt();

		System.out.println("\t\t\t===================================");

		if(S1+S2>S3 || S1+S3>S2 || S2+S3>S1)
			System.out.println("\t\t\tIt's a valid Triangle");

			else
				System.out.println("\t\t\tIt's not a valid Triangle");
	}
}