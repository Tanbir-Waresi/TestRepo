package com.phoenix.demos;

import java.util.Scanner;

public class MainResources {

	public static void main(String[] args) {
		
		
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the required service code: ");
		int service = userInput.nextInt();
		
		
		Resources myref = new Resources();
		
		switch(service) {
		case 1:
			System.out.println(myref.getGroceries());
			System.out.println(myref.getGroceriesPhoneNo());
			break;
		case 2:
			System.out.println(myref.getFruits());
			System.out.println(myref.getFruitsPhoneNo());
			break;	
		case 3:
			System.out.println(myref.getVegetables());
			System.out.println(myref.getVegetablesPhoneNo());
			break;
		case 4:
			System.out.println(myref.getAmbulance());
			System.out.println(myref.getAmbulancePhoneNo());
			break;
		case 5:
			System.out.println(myref.getTransporations());
			System.out.println(myref.getTransportationsPhoneNo());
			break;
		default:
			System.out.println("Service code not available");
		}
		
		userInput.close();
	}

}
