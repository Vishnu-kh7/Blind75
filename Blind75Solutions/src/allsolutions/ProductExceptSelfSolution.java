package allsolutions;

import java.util.Scanner;

public class ProductExceptSelfSolution {

	public static void main(String[] args) {
		System.out.println("ArrayHasDuplicate Solution");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter number of elements");
        int n = keyboard.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements");
        for(int i = 0; i < n; i++) {
            nums[i] = keyboard.nextInt();
        }
        int res[] = productExceptSelf(nums);
	}
	private static int[] productExceptSelf(int[] nums) {
		
		int lp[] = new int[nums.length];
		int rp[] = new int[nums.length];
		
		//do a left pass
		//each element in this array contain product till that number
		
		lp[0] = 1;
		int ref = 1;
		for(int i=1;i<nums.length;i++) {
			lp[i]=nums[i-1]*ref;
			ref = lp[i];
		}
		
		//right pass
		rp[nums.length -1] =1;
		int ref1 =1;
		for(int j=nums.length-2;j>=0;j--) {
			rp[j] = nums[j+1]*ref1;
			ref1=rp[j];
		}
		
		int res[] = new int[nums.length];
		for(int k=0;k<nums.length;k++) {
			res[k]=lp[k]*rp[k];
		}
		return res;
    }
}
