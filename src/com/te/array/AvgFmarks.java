package com.te.array;

public class AvgFmarks {
	public static void main(String[] args) {
		float [] marks= {93.94f,634.5f,2.5f,9.3f,7.4f};
		float sum=0;
		for(float f:marks) {
			sum=sum+f;
		}
		System.out.println(sum);
		System.out.println(sum/marks.length);
	}

}
