package Arrays;

public class Twodtoonedarray {
	
	public static void main(String[] args) {
	int[][] arr= {{1,2,3},{4,5,6}};
	
	int row=arr.length;
	int col=arr[0].length;
	
	int []result=new int[row*col];
	int  index=0;
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
			result[index++]=arr[i][j];
		}
	}
	 for(int num:result) {
		 System.out.print(num+",");
	 }

}
}