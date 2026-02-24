package String;
import java.util.Scanner;
public class stringpalindrome {
//	 public static boolean Ispalin(String s) {
//		 int l=0;
//		 int r=s.length()-1;
//		 
//		 while(l<r) {
//			 if(s.charAt(l)!=s.charAt(r)) {
//				 return false;
//			 
//			 }
//			 l++;
//			 r--;
//			 
//		 }
//		 return true;
//	 }
//	 public static void main(String[] args) {
//		 String s="madam";
//		 System.out.println(Ispalin(s));
//		 
//	 }

	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.println("enter string");
		 String s=sc.nextLine();
		 
		 int flag=0;
		 
		 
		 char[] ch=s.toCharArray();
		 int l=ch.length;
		 int m=l/2;
		 for(int i=0;i<m;i++) {
			 if(ch[i]!=ch[l-1-i]) {
				 flag=1;
				 break;
			 }}
			 
			 if(flag==1) {
				 System.out.println("String is not palindrome ");
			 }
			 else {
				 System.out.println("string is palindrome");
			 }
		 }
	}

