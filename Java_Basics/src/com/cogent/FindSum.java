package com.cogent;

public class FindSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int esum = 0, osum = 0, sum = 0;
		for(int i = 0; i <= 10; i++) {
			if (i%2 == 0) {
				//System.out.println(i);
				esum = esum + i;
			}
			else {
				//System.out.println(i);
				osum = osum + i;
			}
			sum = sum + i;
			
		}
		System.out.println("Even Sum is " +esum);
		System.out.println("Odd Sum is " +osum);
		System.out.println("Total Sum is " +sum);

	}

}
