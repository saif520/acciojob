import java.io.*;
import java.util.*;

public class Main {
    static String[] sarr = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKPC(String str, String asf){
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        int fd = str.charAt(0) - '0';
        String ss = str.substring(1);
        String add = sarr[fd];
        for(int i=0; i<add.length(); i++){
            char toAdd = add.charAt(i);
            printKPC(ss, asf + toAdd);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        printKPC(str, "");
    }
}