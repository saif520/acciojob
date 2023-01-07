import java.util.Scanner;


class Main {
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput(){
		int N = s.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++){
			A[i] = s.nextInt();
		}
		return A;
	}
	
	public static void main(String[] args) {
		int[] A = takeInput();
		int T = s.nextInt();
		System.out.println(firstIndex(A, T, 0));
	}

	static int firstIndex(int A[],int T,int si)
	{
		//Write your code here
		if(A.length==si){
			return -1;
		}
        if(A[si]==T){
			return si;
		}
		return firstIndex(A,T,si+1);
	}
}