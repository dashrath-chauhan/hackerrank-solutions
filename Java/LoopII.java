import java.util.*;
import java.io.*;

class LoopII {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            String series = "";
            int sum = a;
            for(int j = 0; j < n; j++) {
                double result = Math.pow(2, j);
                sum += result * b;
                series += Integer.toString(sum) + " "; 
            }
            System.out.println(series);
        }
        in.close();
    }
}
