package com.cogent;

public class SwapNum2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10, j = 20;
		
		System.out.println("Before Swap");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
		
		i = i + j;
	    j = i - j;
	    i = i - j;
	    System.out.println("After swapping:" + " i = " + i + ", j = " + j);
	}
}
