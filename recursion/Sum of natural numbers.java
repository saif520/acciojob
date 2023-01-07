import java.util.*;

public class Main {
	static long NumberSum(long N) {
        //Write your code here
		if(N==0){
			return 0;
		}
		N=N+NumberSum(N-1);
		return N;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
		long sum=0;
        System.out.println(NumberSum(N));
    }
}