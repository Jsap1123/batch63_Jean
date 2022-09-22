package com.cogent;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 123, sum = 0, r;
		
		while (!(i==0)) {
			r = i % 10; //123%10 = 12
			sum = sum* 10 + r; //0 * 10 + 12 = 12
			i=i/10; //123/12
		}
		System.out.println("Reverse number is " + sum);
		
		i = i++ + ++i;

	}

}
