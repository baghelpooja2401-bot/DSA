package Arrays;

import java.util.HashSet;
import java.util.Set;

public class duplicateinarray {
	public static void main(String[] args) {
		int arr[]= {2,4,5,6,3,3,4,3};
Set<Integer> set= new HashSet<>(); 


for(int num:arr) {
if(set.contains(num)){
	System.out.println("dupicate"+ num);
	break;
	
}
set.add(num);
	
}

}}