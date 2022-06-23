/* 9 Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F */

import java.util.*;

class Grade
 {
  
 	public static void main(String[]args)
	{
 
 		 Scanner sc=new Scanner(System.in);
		System.out.println("\n\t\t\t\tGrade");
		System.out.println("\t\t\t===========================");
 
		 System.out.print("\t\t\tEnter Physics marks : ");
			int p=sc.nextInt();
		 System.out.print("\t\t\tEnter Chemistry : ");
			int ch=sc.nextInt();
		 System.out.print("\t\t\tEnter Biology: ");
			int b=sc.nextInt();
		 System.out.print("\t\t\tEnter Mathematics : ");
			int m=sc.nextInt();
             System.out.print("\t\t\tEnter Computer : ");
			int com=sc.nextInt();

		 int ma = p+ch+b+m+com;
		 int t = (ma*100)/500;
		System.out.println("\t\t\t===========================");

	       if(t>=90)
			{
			  System.out.println("\t\t\t\tGrade A");
			}
				else if(t>=80)
				{
			 	   System.out.println("\t\t\t\tGrade B");
			      }
					else if(t>=70)
					{
					    System.out.println("\t\t\t\tGrade C");
			            }
						else if(t>=60)
						{
					   	   System.out.println("\t\t\t\tGrade D");
			            	 }
							else if(t>=40)
							{
							    System.out.println("\t\t\t\tGrade A");
			           			 }
								else
									System.out.println("\t\t\t\tGrade F");
        }
}