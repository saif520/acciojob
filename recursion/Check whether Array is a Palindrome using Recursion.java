import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
       
        System.out.println(palindrome(arr,0,n-1));
    }

    public static boolean palindrome(int[] arr, int start, int end) {
    // Write your code here
		if (start >= end) {
	      return true;
	   }
	   if (arr[start] == arr[end]) {
	      return palindrome(arr, start + 1, end - 1);
	   } else {
	      return false;
	   }
    }
}