/****************************************************************************
 *
 * Created by: Wendi Yu
 * Created on: Feb 05 2019
 * Created for: ICS4U
 * This program calculates whatever mass (kg) the user inputs to energy (J)
 *
 ****************************************************************************/
import java.util.Scanner;

public class Energy {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Constant
		
		double LIGHTSPEED = 299800000;
		
		System.out.println("Enter the mass of an object in kg : ");
		
		double mass = scanner.nextDouble();
		scanner.close();
		
		if (mass < 0) { 
			
			System.out.println("Invaild number! Please, try other numbers");
		}
		else {
			double energy = mass * LIGHTSPEED;
			
			System.out.println("If " + mass + " kg of energy was converted to Joule (J). It will produce "+ energy + " J of energy.");
		}

	}

}
