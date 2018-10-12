package com.java.alg.dynamicprog;

public class Fibonacci {

	
	private static Long[] memo;
	
	public static void main(String args[]) {
		long num=10;
		//runRecursive(num);
		runRecursiveWithMemory(num);
		runItera(num);
	}
	
	public static void runRecursive(long num) {
		long start=System.currentTimeMillis();
		System.out.println("Start Fibonacci recursive");
		long res = fibonacciRec(num);
		long finish=System.currentTimeMillis();
		System.out.println("Fibonacci "+num+"="+res+" tooks "+(finish-start) +"ms");
	}
	
	public static void runRecursiveWithMemory(long num) {
		long start=System.currentTimeMillis();
		System.out.println("Start Fibonacci with memory");
		memo = new Long[(int)num+1];
		memo[0]=null;
		memo[1]=1l;
		memo[2]=1l;
		long res = fibonnacciMem(num);
		long finish=System.currentTimeMillis();
		System.out.println("Fibonacci "+num+"="+res+" tooks "+(finish-start) +"ms");
	}
	
	public static void runItera(long num) {
		long start=System.currentTimeMillis();
		System.out.println("Start Fibonacci Itera");
		memo = new Long[2];
		long res = fibonnacciItera(num);
		long finish=System.currentTimeMillis();
		System.out.println("Fibonacci "+num+"="+res+" tooks "+(finish-start) +"ms");
	}
	
	public static long fibonacciRec(long n){
		if(n==1 || n == 2) {
			return 1;
		}else {
			return fibonacciRec(n-1) + fibonacciRec(n-2);
		}
	}
	
	public static long fibonnacciMem(long n) {
		if(memo[(int) n]!=null) {
			return memo[(int)n];
		}else {
			memo[(int)n]=fibonnacciMem(n-1)+fibonnacciMem(n-2);
			return memo[(int)n];
		}
	}
	
	
	public static long fibonnacciItera(long n) {
		long f=0;
		for(int i=1; i<=(int)n; i++) {
			if(i<=2)
				f=1;
			else 
				f= memo[0]+memo[1];
			memo[0]=memo[1];
			memo[1]=f;
		}
		return memo[1];
	}
	
}
