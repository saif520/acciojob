import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,x;
        n = sc.nextInt();
        x = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        int[] ans=allIndices(arr1,0,x,0);
		for(int i=0;i<ans.length;i++){
			System.out.print(ans[i]+" ");
		}
    }



    static int[] allIndices(int arr[], int idx, int tar,int count)
    {
        // write code here
	    if(idx==arr.length){
			int[]ba=new int[count];
			return ba;
		}
		int[] ans;
		if(arr[idx]==tar){
			ans=allIndices(arr,idx+1,tar,count+1);
		}
		else{
			ans=allIndices(arr,idx+1,tar,count);
		}
		if(arr[idx]==tar){
			ans[count]=idx;
		}
		return ans;
    }
}
