import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++)
		{
			nums[i] = sc.nextInt();
		}
        int result=maxElement(nums,0);
        System.out.print(result);
    }

    public static int maxElement(int[] arr,int idx){
      //Write your code here
		if(idx==arr.length){
			return Integer.MIN_VALUE;
		}
		int smallAns=maxElement(arr,idx+1);
		int ans=Math.max(arr[idx],smallAns);
		return ans;
    }
}