/*            *             ====================================================                                                                                                            ***                      ====================================================
*            ***            # Name: Jiao Xu
*           *****           # Date: 5/7/2018
*            ***            # Project Name: Lab 11
*             *             # Description: Here is my Car List program.
*                           ====================================================
 */
package com.cars.gc;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {

		int carNum = 0;
		ArrayList<NewCar> inventory = new ArrayList<>();

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Grand Circus Motors admin console!");
		carNum = Validator.getInt(scan, "How many cars are you entering: ");
	

		for (int i = 1; i <= carNum; i++) {
			NewCar thisCar = new NewCar();
			thisCar.setMake(Validator.getString(scan, "Enter Car #" + i + " Make: "));
			
			thisCar.setModel(Validator.getString(scan, "Enter Car #" + i + " Model: "));
		
			thisCar.setYear(Validator.getInt(scan, "Enter Car #" + i + " Year: "));
		
			thisCar.setPrice(Validator.getDouble(scan, "Enter Car #" + i + " Price: "));
			System.out.println();
			
			inventory.add(thisCar);
	
		}
		System.out.println("Current Inventory:");

		for (int i = 0; i < inventory.size(); i++) {
			System.out.println(inventory.get(i));

		}
		scan.close();
	}
}
