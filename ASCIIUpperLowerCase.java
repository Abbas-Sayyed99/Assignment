/*(2) Any character is entered through the keyboard, write a program to
determine whether the character entered is a capital letter, a small
case letter, a digit or a special symbol.
The following table shows the range of ASCII values for various
characters:
Characters   ASCII Values
A – Z      65 – 90
a – z      97 – 122
0 – 9     58 - 64
special symbols
48 – 57
0 - 47, 58 - 64, 91 - 96, 123 - 127 */


import java.util.*;

class UpperLowerCase
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("\n\t\t\tUpper Case Lower Case");
		System.out.println("\t\t\t===========================");

		System.out.print("\t\t\tEnter any character : ");
			char c = sc.next().charAt(0);
		System.out.println("\n\t\t\t=================================");

		if(c>=65 && c<=90)
			System.out.println("\t\t\tEntered character is in Upper Case.");

		else if(c>=97 && c<=122)
			System.out.println("\t\t\tEntered character is in lower case.");

		else if(c>=48 && c<=57)
			System.out.println("\t\t\tEntered character is digit.");

		else if((c>=0 && c<=48) || (c>=58 && c<=64) || (c>=91 && c<=96))
			System.out.println("\t\t\tEntered character is special symbol.");
	}

}