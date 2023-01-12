import java.util.Scanner;



class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++){
			A[i] = s.nextInt();
		}
		int T = s.nextInt();
		System.out.println(lastIndex(A, T, 0));
	}

	static int lastIndex(int arr[],int tar,int idx)
	{
		//Write your code here
		if(idx==arr.length){
			return -1;
		}
        int smallAns=lastIndex(arr,tar,idx+1);
		int ans=0;
		if(smallAns==-1){
			if(arr[idx]==tar){
				ans=idx;
			}
			else{
				ans=smallAns;
			}
		}
		else{
			ans=smallAns;
		}
		return ans;
	}
}