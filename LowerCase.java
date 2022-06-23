/* (6) Using conditional operators determine:
   	(1) Whether the character entered through the keyboard is a lower case alphabet or not.
   	(2) Whether a character entered through the keyboard is a special symbol or not. */

import java.util.*;

class LowerCase
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("\n\t\t\tUpper Case Lower Case");
		System.out.println("\t\t\t===========================");

		System.out.print("\t\t\tEnter any character : ");
			char c = sc.next().charAt(0);
		System.out.println("\n\t\t\t=================================");

		if(c>='a' && c<='z')
			System.out.println("\t\t\tEntered character is in lower case.");

		else if(c>='A' && c<='Z')
			System.out.println("\t\t\tEntered character is not lower case.");

		else if((c>=0 && c<=48) || (c>=58 && c<=64) || (c>=91 && c<=96))
			System.out.println("\t\t\tEntered character is special symbol.");

		else
			System.out.println("\t\t\tEnter alphabet or symbol");
	}

}