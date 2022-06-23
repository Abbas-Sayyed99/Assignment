/*(1) Any year is entered through the keyboard, write a program to
determine whether the year is leap or not. Use the logical operators
&& and ||.*/

import java.util.*;

class LeapYear
{
	public static void main(String[]args)
		{
			Scanner sc = new Scanner(System.in);

			System.out.print("\n\t\t\tEnter Year : ");
			int y = sc.nextInt();
			System.out.println("\t\t\t================");
			
			if((y%4==0 || y%400==0) && y%3!=0)
				System.out.println("\t\t\tIt's a Leap Year");
				
				else
					System.out.println("\t\t\tIt's not a Leap Year");
		}

}
