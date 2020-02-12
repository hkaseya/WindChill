package project_1;

/*

	Honore Shambuyi Kaseya
	CMSC 203
	Dr. Amhed Tarek
	Montgomery College
	Feb. 2020

	 */

	import java.util.Scanner;

	public class WindChill {
	    
	    public static void main(String args []) {
	        
	        Scanner input = new Scanner(System.in); 
	        final double constant = 35.74; 
	        double windSpeed, tempF, windChillIndex; 
	        
	        System.out.print("\nThe following program will help determine "); 
	        System.out.print("the wind chill temperature of a given wind speed"); 
	        System.out.println(" and temperature."); 
	        System.out.print("\n• The wind speed should be greater than");
	        System.out.print(" or equal to 5 but less than or equal to 60"); 
	        System.out.print("\n• The temperature values should be greater than");
	        System.out.print(" or equal to -45 but less than or equal to 40");
	        System.out.println();
	        
	        System.out.print("\nEnter a value for windspeed: "); 
	        windSpeed = input.nextDouble(); 
	        System.out.print("Enter a value for temperature in Farenheit: ");
	        tempF = input.nextDouble(); 
	        
	        windChillIndex = constant + (0.6215 * tempF) - (35.75 * Math.pow(windSpeed, 0.16)) 
	                    + (0.4275 * tempF * Math.pow(windSpeed, 0.16)); 
	        
	        System.out.println("\nThe windchill index for wind speed of " + 
	                windSpeed + " and temperature " + tempF + " is " 
	                    + Math.round(windChillIndex * 100.0) / 100.0 + " degrees Farenheit");
	        System.out.println("\nProgrammer: Honore Shambuyi Kaseya");
	        System.out.println(); 
	        
	        input.close(); 
	        
	    }

}
