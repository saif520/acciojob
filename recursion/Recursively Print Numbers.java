import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
		printtillN(N);
        
    }

	public static void printtillN(int N) {
		if(N==0){
			return;
		}
		printtillN(N-1);
		System.out.print(N+" ");
		
    }
}