package com.jqx.study;

public class TestArrayExercise {
	public static void main(String[] args) {
		int arrA[] = new int[10];		
		double sum = 0;
		for (int i = 0; i <arrA.length; i++) {
			if(i==0){
				arrA[0] = 1;
			}else{
				arrA[i] = arrA[i-1]*(i+1);
			}
			sum = sum + (double) 1/arrA[i];
		}
		System.out.println(sum);
//		count2();
	}
	public static void count2() {
		double sum = 0;
		int k = 1;
		for (int i = 1; i < 10; i++) {
			k = k*i;
			sum = sum + (double)1/k;
		}
		System.out.println(sum);
	}
}
