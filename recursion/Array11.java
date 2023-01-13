import java.util.*;
public class Main {
    static int array11(int[] nums, int index,int count) {
		if(index==nums.length){
			return count;
		}
		if(nums[index]==11){
			count++;
		}
		int ans=array11(nums,index+1,count);
		return ans;
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
		
        System.out.println(array11(arr, 0,0));
    }
}