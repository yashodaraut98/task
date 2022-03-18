package com.te.array;

public class twoDarray {
public static void main(String[] args) {
	int [][]a= {{1,1,1},{1,1,1}};
	int [][]b= {{1,1,1},{1,1,1}};
	int [][]c= {{0,0,0},{0,0,0}};
	
	for(int i=0;i<=a.length;i++)//for row 
		{
		for(int j=0;j<a[i].length;j++)//for column
			{	
		System.out.format("setting values to i,j  i=%d and j=%d\n",i,j);
			c[i][j]=a[i][j]+b[i][j];	
		}
		}
	for(int i=0;i<=a.length;i++)//for row 
	{
	for(int j=0;j<a[i].length;j++)//for column
		{	
	System.out.print(c[i][j]+" ");
		c[i][j]=a[i][j]+b[i][j];
		
	}System.out.println(" ");
	}

	
}
}
