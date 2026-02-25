package patterns;
//1 2 3
//  2 3
//    3
public class pat5 {
	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			for(int s=i;s>=2;s--)
				System.out.print(" ");
			for(int j=i;j<=3;j++){
				System.out.print(j);}
				System.out.println();
			}
		}
	}

