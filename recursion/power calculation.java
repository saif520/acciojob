import java.util.*;

class Main {
	public static long power1(int x, int n){
		//write code here
		if(n==0){
			return 1;
		}
		long smallAns=power1(x,n-1);
		long ans=smallAns*x;
		return ans;
	}
	public static void main(String[] args)
	{
    		Scanner sc = new Scanner(System.in);
    		int x = sc.nextInt();
    		int n = sc.nextInt();
		System.out.println(power1(x, n));
	}
}