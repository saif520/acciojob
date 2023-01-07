import java.util.*;

public class Main {
	static long product(long n){
		//Write code here
		if(n==0){
			return 1;
		}
		n=n*product(n-1);
		return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n= sc.nextInt();
        System.out.println(product(n));
    }
}