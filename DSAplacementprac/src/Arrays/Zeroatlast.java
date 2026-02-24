package Arrays;

import java.util.Arrays;

public class Zeroatlast {
	public static int[] zero(int arr[] ){
		int n=arr.length-1;

		int index=0;
		 for(int i=0;i<arr.length;i++){
		 if(arr[i]!=0){
		arr[index++]=arr[i];
		}}
		while(index<arr.length){
		arr[index++]=0;
		}
		return arr;}

public static void main(String[] args) {
	int arr[]= {2,0,0,5,0,6,2};
	
	System.out.println(Arrays.toString(zero(arr)));
	
	
}}

