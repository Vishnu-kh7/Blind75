package allsolutions;

import java.util.Arrays;

public class StockBestProfitSolution {
	public static void main(String[] args) {
	int [] arr = {8,2,9,1,7,5}; 
    int ans=  maxProfit(arr);
    System.out.println(ans);
}

private static int maxProfit(int[] arr) {
	int [] temp = new int[arr.length];
	int min = arr[0];
	temp[0] = 0;
	
	for(int i = 1;i<arr.length;i++) {
		temp[i] = arr[i]-min; 
		if(arr[i]<min) min = arr[i];
	}
	Arrays.sort(temp);
	return temp[temp.length-1];
}
}
