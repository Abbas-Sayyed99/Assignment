/* 10 Write a Java program to input basic salary of an employee and calculate its Gross salary according to following:
Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary <= 20000 : HRA = 25%, DA = 90%
Basic Salary > 20000 : HRA = 30%, DA = 95% */

import java.util.*;

class BasicSalary
 {
  
 	public static void main(String[]args)
	{
 
 		 Scanner sc=new Scanner(System.in);
		System.out.println("\n\t\t\t\tBasic Salary");
		System.out.println("\t\t\t===========================");
 
		 System.out.print("\n\t\t\tEnter Basic Salary : ");
			int Sal=sc.nextInt();
		System.out.println("\t\t\t===========================");

			if(Sal<=10000)
			{
			  double DA=(Sal*0.8);
			  double HRA=(Sal*0.2);
			  double GS=(DA+HRA+Sal);
			  System.out.println("\t\t\tGross Salary Is : " + GS);
			}
				else if(Sal<=20000)
				{
			 	   double DA=(Sal*0.9);
			         double HRA=(Sal*0.25);
			         double GS=(DA+HRA+Sal);
			         System.out.println("\t\t\tGross Salary Is : " + GS);
			      }
					else if(Sal>=20000)
					{
			 	         double DA=(Sal*0.95);
			               double HRA=(Sal*0.30);
			               double GS=(DA+HRA+Sal);
			               System.out.println("\t\t\tGross Salary Is : " + GS);
			            }
						
							
        }
}