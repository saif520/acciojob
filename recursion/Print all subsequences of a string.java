import java.util.*;
import java.util.Scanner;

public class Main{
    public static void printSubs(String str, String asf){
        if(str.length()==0){
            System.out.print(asf+" ");
            return;
        }
        char ch = str.charAt(0);
        String ss = str.substring(1);
        printSubs(ss, asf+ch);
        printSubs(ss, asf);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printSubs(str,"");
    }
}