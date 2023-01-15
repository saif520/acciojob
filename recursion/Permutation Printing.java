import java.util.*;
  
public class Main{
  
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      String s=scn.nextLine();
      String asf="";
      permutationPrint(s,asf);
   }
   public static void permutationPrint(String ques, String asf) {
        if(ques.length()==0){
            System.out.println(asf);
            return;
        }

        for(int i=0; i<ques.length(); i++){
            char toAdd = ques.charAt(i);

            String leftPart = ques.substring(0, i);
            String rightPart = ques.substring(i+1, ques.length());

            String roq = leftPart + rightPart;
            permutationPrint(roq, asf+toAdd);
        }
    }
  }