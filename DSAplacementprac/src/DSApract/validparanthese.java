package DSApract;

import java.util.Stack;

public class validparanthese {
	public static void main(String[] args) {
		String s="({})";
		valid(s);
	}
	 public static boolean valid(String s) {
		 Stack<Character> stack=new Stack<>();
		 for( char ch:s.toCharArray()) {
			 if(ch=='[' || ch=='(' || ch=='{') {
				 stack.push(ch);
			 }
			 else {
				 if(stack.isEmpty())
					 return false;
				 
				 char top=stack.pop();
				 if((ch=='}' && top!='{') || (ch==')' && top!='(') || (ch==']' && top!='[')) {
					 return false;
				 }
			 }
		 }
		 return stack.isEmpty();
		 
	 }

}
