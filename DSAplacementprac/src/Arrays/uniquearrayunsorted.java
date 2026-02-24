package Arrays;

import java.util.Arrays;

public class uniquearrayunsorted {
	public static int[] unique(int arr[]) {
		int temp[]=new int[arr.length];
		int uniquecount=0;
		
		
		for(int i=0;i<arr.length;i++) {
			boolean isduplicate=false;
			 for(int j=0;j<uniquecount;j++) {
				 if(arr[i]==temp[j]) {
					 isduplicate=true;
				 break;
			 }}
			 if(!isduplicate){
				 temp[uniquecount]=arr[i];
				 uniquecount++;
				 
			 }
		}
		return Arrays.copyOf(temp, uniquecount);
	}
public static void main(String[] args) {
	int arr[]= {2,3,4,4,6,7,8,7};
	
	System.out.println(Arrays.toString(unique(arr)));
	
}
}
