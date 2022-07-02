package allsolutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSumSolution {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TwoSum Solution");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter number of elements");
        int n = keyboard.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements");
        for(int i = 0; i < n; i++) {
            nums[i] = keyboard.nextInt();
        }
        System.out.println("Enter the target");
        int target = keyboard.nextInt();

        keyboard.close();

        int[] indices = findTwoSum(nums, target);
        if(indices==null) {
        	System.out.println("no pair found");
        }
        else {
        	System.out.println("Indices are : "+indices[0]+" "+ indices[1]);	
        }
	}

	private static int[] findTwoSum(int[] nums, int target) {
		Map <Integer, Integer> targetMap = new HashMap<Integer, Integer>();
		int targetDiff = 0;
		for(int i=0;i<nums.length;i++) {
			targetDiff= target - nums[i];
			
			if(targetMap.containsKey(targetDiff)) {
				int index[] = {targetMap.get(targetDiff),i};
				System.out.println(targetMap.get(targetDiff)+" " +i);
				System.out.println(targetDiff+"  "+nums[i]);
				return index;
			}
			else {
				targetMap.put(nums[i], i);
			}
		}
		return null;
	}


}
