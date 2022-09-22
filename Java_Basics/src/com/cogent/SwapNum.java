package com.cogent;

public class SwapNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10, j = 20;
		
		System.out.println("Before Swap");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
 
        int temp = i;
        i = j;
        j = temp;
 
        System.out.println("After Swap");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
		

	}

}

