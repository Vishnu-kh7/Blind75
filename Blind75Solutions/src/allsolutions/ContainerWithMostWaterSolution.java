package allsolutions;

import java.util.Scanner;

public class ContainerWithMostWaterSolution {

	public static void main(String[] args) {
		System.out.println("ContainerWithMostWater Solution");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter number of elements");
        int n = keyboard.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements");
        for(int i = 0; i < n; i++) {
            nums[i] = keyboard.nextInt();
        }
        int maxArea = maxArea(nums);
        System.out.println("The maximum area is " + maxArea);
	}
	private static int maxArea(int[] height) {
		int tempMaxArea = 0;
		int length = height.length;
		int res = computeMaxArea(0,length-1,height,tempMaxArea);
		return res;
        
    }
	private static int computeMaxArea(int start, int end, int[] height, int tempMaxArea) {
		if(start<end) {
			int area = Math.min(height[start], height[end]) * (end-start);
			if(height[start]<=height[end])
				computeMaxArea(start+1,end,height,Math.max(tempMaxArea, area));
			else
				computeMaxArea(start,end-1,height,Math.max(tempMaxArea, area));
		}
		
			return tempMaxArea;
	}
}
