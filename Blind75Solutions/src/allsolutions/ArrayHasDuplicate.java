package allsolutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ArrayHasDuplicate {

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
        System.out.println(duplicateElementExists(nums));
	}

	private static boolean duplicateElementExists(int[] nums) {
		Set<Integer> numSet = new HashSet<>();
		for(int no:nums) {
			if(!numSet.add(no)) return true;
		}
		return false;
	}

}
