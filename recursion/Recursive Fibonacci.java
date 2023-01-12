import java.util.*;
import static java.lang.Math.ceil;

public class Main {

	public static int fib(int n ){
        // write code here
		if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fib(n-1));
    }
}