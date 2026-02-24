package Arrays;

import java.util.HashMap;

public class slidingwindow {

	

		public static void main(String args[]){

		int arr[]={1,4,3,2,1,4,6};
		int k=4;
  Countunique(arr,k);}


		public static void Countunique(int []arr,int key){
		HashMap<Integer,Integer>map=new HashMap<>();
		//first window


		int k=4;
		for(int i=0;i<k;i++){
		map.put(arr[i],map.getOrDefault(arr[i],0)+1);}

		System.out.println("uniquecount"+map.size());

		for(int i=k;i<arr.length;i++){
		int out=arr[i-k];
		map.put(out,map.get(out)-1);

		if(map.get(out)==0){
		map.remove(out);
		}

		int in=arr[i];
		map.put(in,map.getOrDefault(in,0)+1);
		System.out.println("uniquecount"+map.size());

		 
		}

		}
}
