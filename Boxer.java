/* (5) In boxing the weight class of a boxer is decided as per the following
table. Write a program that receives weight as input and prints out
the boxer’s weight class.
Boxer Class  Weight in Pounds  
Flyweight    < 115
Bantamweight  115 - 121
Featherweight  122 - 153
Middleweight  154 – 189
Heavyweight    >= 190 */


import java.util.*;

class Boxer
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\t\t\tBoxers Weight Class");
		System.out.print("\t\t\t=========================");
		
			System.out.print("\n\t\t\tEnter Weight of a boxer : ");
			int w = sc.nextInt();
			System.out.println("\n\t\t\t=================================");

				if(w<115)
					System.out.println("\t\t\t\tFlyweight");
				
				 else if(w>=115 && w<=121)
						System.out.println("\t\t\t\tBantamweight");
				 	  
				 else if(w>=122 && w<=153)
						System.out.println("\t\t\t\tFeatherweight");
				 		   
				 else if(w>=154 && w<=189)
						System.out.println("\t\t\t\tMiddleweight");
				 				
				 else
						System.out.println("\t\t\t\tHeavyweight");
	}
}
