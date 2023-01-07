import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int x,n;
        x = sc.nextInt();        
        n = sc.nextInt();

        System.out.println(power(x,n));		
    }

	public static long power(int x, int n)
    {
		//Write code here
		if(n==0){
			return 1;
		}
		long smallAns=power(x,n/2);
		long ans=smallAns*smallAns;
		if(n%2!=0){
			ans=ans*x;
		}
		return ans;
    }
}