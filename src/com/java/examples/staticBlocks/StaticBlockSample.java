package com.java.examples.staticBlocks;

public class StaticBlockSample {

	public static int B, H;
	public static boolean flag=true;

	static {
		if (B < 0 || H < 0) {
			flag = false;
		}
	}
	
	public static void main(String[] args){
		System.out.println("Something here");
		if(flag) {
			int area = B*H;
			System.out.println(area);
		}
	}

}
