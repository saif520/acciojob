import java.util.*;

public class Main {
    public static void printEncodings(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        if(str.charAt(0)=='0'){
            return;
        }
        // taking first character
        int firstDigit = str.charAt(0) - '0';
        char charToAdd = (char)('a' + firstDigit - 1);
        String ss = str.substring(1);
        printEncodings(ss, asf+charToAdd);
        // taking first 2 char 
        if(str.length() >= 2){
            int firstTwoDigits = Integer.parseInt(str.substring(0,2));
            if(firstTwoDigits<=26){
                charToAdd = (char)('a' + firstTwoDigits - 1);
                ss = str.substring(2);
                printEncodings(ss, asf+charToAdd);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printEncodings(str,"");
    }
}