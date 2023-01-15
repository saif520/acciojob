import java.io.*;
import java.util.*;

public class Main {
	public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }

        // if(sr>dr || sc>dc){
        //     return;
        // }

        // horizontal steps 
        for(int jump = 1; jump<=dc-sc; jump++){
            printMazePaths(sr, sc + jump, dr, dc, psf + "h"+ jump);
        }

        // vertical steps
        for(int jump = 1; jump<=dr-sr; jump++){
            printMazePaths(sr+jump, sc, dr, dc, psf+"v"+jump);
        }

        // diagonal steps
        for(int jump=1; jump<=dc-sc && jump<=dr-sr; jump++){
            printMazePaths(sr + jump, sc + jump, dr, dc, psf+"d"+jump);
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        printMazePaths(0, 0, n - 1, m - 1, "");
    }
}