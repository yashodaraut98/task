package com.te.swapNo;

public class Swap1 {
public static void main(String[] args) {
	int a=7, b=8;
	System.out.println("before Swapping" +"a="+a +",b=" +b);
	
	//...............logic 1...................
	//int t=a;
//	a=b;
//	b=t;
	// using Third variable
	//System.out.println("Atter Swapping" +"a="+a +",b=" +b);
	
	//.....................logic2..............
    // without using third variable;
//	a=a+b; // 7+8=15
//	b=a-b; //15-8=7
//	a=a-b; //15-7=8
//	
	//.......................logic 3................
	//..............without using 3rd variable
	a=a*b; //7*8=56
	b=a/b;  //56/8=7
	a=a/b;  // 56/7=8
	
	
	System.out.println("Atter Swapping" +"a="+a +",b=" +b);

}
}
