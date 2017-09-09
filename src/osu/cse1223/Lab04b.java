/*
 * Lab04b.java
 * converts normal time into military time
 * 
 * @author Paul M. Onderisin
 * @version 1.0.0
 */
package osu.cse1223;

import java.util.Scanner;

public class Lab04b {

	public static void main(String[] args) 
	{
		
		//Starts the scanner
		Scanner in = new Scanner(System.in);
		
		//prompts the user for a time in this format
		p("Enter a time in HH:MM AM/PM format: ", false);
		
		//gets the user's time
		String _time = in.nextLine();
		
		//Gets the AM/PM part
		String _AmPm = _time.split(" ")[1];
		
		//Gets the Hour and minutes part
		String _HourMin = _time.split(" ")[0];
		
		//Gets the hour
		int _hour = Integer.parseInt(_HourMin.split(":")[0]);
		
		//Gets the minute
		int _minute = Integer.parseInt(_HourMin.split(":")[1]);
		
		//Adds 12 hours if the AM/Pm is PM
		if(_AmPm.equalsIgnoreCase("pm"))
		{
			_hour = _hour + 12;
		}
		
		//Prints the military time
		p("Time in military time is: " + _hour + "" + _minute, true);
		
		//Closes the scanner
		in.close();
	}
	
	//So i dont have to type out the long message
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
