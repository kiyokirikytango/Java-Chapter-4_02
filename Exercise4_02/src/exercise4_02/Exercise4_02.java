/*
Chapter 4 Programming excercise 2
Riky Hernandez
8/31/21
Description: Finding the distance of two points(longtitude and latitude) of the surface of earth
*/
package exercise4_02;
import java.util.Scanner;
public class Exercise4_02 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //user inputs point 1 (lat,long)
       System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
            double x1 = input.nextDouble();
            double y1 = input.nextDouble();
            
          //user inputs point 2 (lat,long)  
       System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
            double x2 = input.nextDouble();
            double y2 = input.nextDouble();
      
            //the equation for the distance for both points, using earths radius as 6371.01
        double d = 6371.01 * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2)));
        
        //the output of the equation 
        System.out.println("The distance between the two points is " + d + " km");
        
        
    }
    
}
