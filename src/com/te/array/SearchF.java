package com.te.array;

public class SearchF {
	
	public static void main(String[] args) {
		

		float [] marks= {2.5f,5.6f,7.8f,34.87f};
		float num=7.8f;

		boolean isInArray= false;
		for(float f:marks) {
			if(num==f) {
				if(isInArray=true)
					break;
			}
		}
				if(isInArray)
				
				{
					
				System.out.println("present:"+num);
			}else {
				System.out.println("not present:"+num);
			}
		
	
	}
}
