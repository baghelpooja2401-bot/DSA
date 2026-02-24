package oops;
import java.util.Scanner;

public class factorialrecursion {
	public static int fact(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return n* fact(n-1);
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int result=fact(n);
		System.out.println("factorial of number is"+ result);
	}

}
