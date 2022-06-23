/* 8 Write a Java program to calculate profit or loss.*/

import java.util.*;

class ProfitLoss
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

 		System.out.println("\n\t\t\tProfit and Loss");
		System.out.println("\t\t\t===========================");

		System.out.print("\n\t\t\tEnter Cost Price : ");
		double cp = sc.nextDouble();
		System.out.print("\t\t\tEnter Selling Price : ");
		double sp = sc.nextDouble();
		System.out.println("\t\t\t===========================");

		if(sp>cp)
		{
			System.out.println("\t\t\tYour made a profit" );
			double pl = sp-cp; 
			System.out.println("\t\t\tYour profit amount is : " +pl );
		}
			else
			{
				System.out.println("\t\t\tYour made a loss");
				double pl = cp-sp;
				System.out.println("\t\t\tYour loss amount is : " +pl);
			}
				

	}
}