package Arrays;

public class misingelement {
//public static int Missingnum(int[] nums) {
//	int n=nums.length;
//	int Expectedsum=n*(n+1)/2;
//	int actualsum=0;
//	for(int num:nums) {
//		actualsum+=num;
//	}
//	return Expectedsum-actualsum;
//}
//	public static void main(String[] args) {
//		int[] nums= {3,4,0,1};
//		
//		
//		System.out.println(Missingnum(nums));
//		
//	}
//}
//	
	
	
	    public static int missingNumber(int[] nums) {
	        int xor = 0;
	        int n = nums.length;

	        for (int i = 0; i <= n; i++) {
	            xor ^= i;
	        }

	        for (int num : nums) {
	            xor ^= num;
	        }

	        return xor;
	    }
	

	
	public static void main(String[] args) {
		int[] nums= {3,4,0,1};
		
		
		System.out.println(missingNumber(nums));
		
	}
}
