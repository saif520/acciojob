import java.util.*;

public class Main {
    static int countfun(String s) {
        // Write your code here
		if(s.length()<3)
      return 0;
      
    if(s.substring(0,3).equals("abc") || s.substring(0,3).equals("aba"))
    {
      return 1+countfun(s.substring(1));
    }
    else
    {
      return countfun(s.substring(1));
      }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(countfun(s));

    }
}