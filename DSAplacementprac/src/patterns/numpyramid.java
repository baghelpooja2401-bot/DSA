package patterns;
//****
//****
//****
//****
public class numpyramid {
	public static void main(String[] args) {
		
	int n=4;
	for(int i=1;i<=n;i++) {
		for(int s=i;s<=3;s++)
			System.out.print(" ");
		for(int j=1;j<=i;j++) 
			System.out.print(j);
		
			for(int r=i-1;r>=1;r--)
				System.out.print(r);
		System.out.println();
		
	}
}}