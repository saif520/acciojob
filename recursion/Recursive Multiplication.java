import java.io.*;
import java.util.*;
public class Main {
  public static int multiplyRecursively(int m, int n) {
    //Write code here and print output
	  if(n==1){
		  return m;
	  }
	  return m+multiplyRecursively(m,n-1);
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int m = scn.nextInt();
    int n = scn.nextInt();
    System.out.println(multiplyRecursively(m,n));
  }
}