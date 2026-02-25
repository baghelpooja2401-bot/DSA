package patterns;

//  3
// 32
//321

public class pat3 {
	public static void main(String[] args) {
		for(int i=3;i>=1;i--) {
			for(int s=i;s>=2;s--)
				System.out.print(" ");
			for(int j=3;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

