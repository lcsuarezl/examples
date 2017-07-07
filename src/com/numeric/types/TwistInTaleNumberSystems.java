package com.numeric.types; 

class TwistInTaleNumberSystems{

	public static void main(String args[]){
		int baseDecimal = 267;
		int octVal = 0413;
		int hexVal = 0x10B;
		int binVal = 0b100001011;
		System.out.println("baseDecimal:"+baseDecimal);
		System.out.println("octVal:"+octVal);	
		System.out.println("hexVal:"+hexVal);
		System.out.println("binVal:"+binVal);
		testNumberFormats();
	}


	private static void testNumberFormats(){
		long var1 = 0_100_267_760;
		//long var2 = 0_x_4_13;
		//long var3 = 0b_x10_BA_75;
		//long var4 = 0b_1000_10_1;
		//long var5 = 0xa10_AG_75;
		long var6 = 0x1_000_10;
		long var7 = 100_12_12;
	}
}
