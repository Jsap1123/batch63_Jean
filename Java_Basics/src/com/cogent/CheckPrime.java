package com.cogent;

public class CheckPrime {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		for(int numToCheck = 2; numToCheck <= 10; numToCheck++) {
			//int numToCheck = 11;
			boolean isPrime = true;
			for (int factor = 2; factor < numToCheck; factor++) {
				if(numToCheck % factor == 0) {
					isPrime = false;
					//System.out.println(numToCheck + " is not prime");
					break;
					
				}	
			}
			if (isPrime) {
				System.out.println(numToCheck + " is prime");
			}
			
		}
		

	}

}
