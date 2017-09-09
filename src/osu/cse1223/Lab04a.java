/*
 * Lab04.java
 * User enters a number a then determine what grade goes along with it
 * 
 * @author Paul M Onderisin
 * @verison 1.0.0
 */
package osu.cse1223;

import java.util.Scanner;

public class Lab04a {

	public static void main(String[] args) {
		
		//starts the scanner
		Scanner in = new Scanner(System.in);
		
		//Prompt the user for a input
		p("Enter a grade value between 0 and 100: ", false);
		
		//gets the user input
		String _input = in.nextLine();
		
		//Parses the string into a double
		double _inputDouble = Double.parseDouble(_input);
		
		//Grade for a A
		if( 100.0 > _inputDouble && _inputDouble >= 93.0)
		{
			p("You received an A", true);
		}
		
		//Grade for a A-
		else if( 93.0 > _inputDouble && _inputDouble >= 90.0)
		{
			p("You received an A-", true);
		}
		
		//Grade for a B+
		else if( 90.0 > _inputDouble && _inputDouble >= 87.0)
		{
			p("You received an B+", true);
		}
		
		//Grade for a B
		else if( 87.0 > _inputDouble && _inputDouble >= 83.0)
		{
			p("You received an B", true);
		}
		
		//Grade for a B-
		else if( 83.0 > _inputDouble && _inputDouble >= 80.0)
		{
			p("You received an B-", true);
		}
		
		//Grade for a C+
		else if( 80.0 > _inputDouble && _inputDouble >= 80.0)
		{
			p("You received an C+", true);
		}
		
		//Grade for a C
		else if( 77.0 > _inputDouble && _inputDouble >= 73.0)
		{
			p("You received an C", true);
		}
		
		//Grade for a C-
		else if( 73.0 > _inputDouble && _inputDouble >= 70.0)
		{
			p("You received an C-", true);
		}
		
		//Grade for a D+
		else if( 70.0 > _inputDouble && _inputDouble >= 67.0)
		{
			p("You received an D+", true);
		}
		
		//Grade for a D
		else if( 67.0 > _inputDouble && _inputDouble >= 60.0)
		{
			p("You received an D", true);
		}
		
		//Grade for a E
		else if( 60.0 > _inputDouble && _inputDouble >= 0.0)
		{
			p("You received an E", true);
		}
		else
		{
			p("ERROR: Grade must be between 0 and 100", true);
		}
		
		//Closes the scanner
		in.close();
	}

	public static void p(String message, boolean bool)
	{
		
		if(bool)
		{
			System.out.println(message);
		}
		else
		{
			System.out.print(message);
		}
	}
}
