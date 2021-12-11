import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bj_11866 {
    
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> data= new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        Scanner sc =new Scanner(System.in);
        Queue<Integer> q= new LinkedList<>();

        int n=sc.nextInt();
        int k=sc.nextInt();

        for(int i=0;i<n;i++){
            q.add(i+1);
        }
        sb.append("<");

        while(q.size() >1){
            for(int i=0;i<k-1;i++){
                int a=q.poll();
                q.offer(a);
            }
            sb.append(q.poll()+", ");
        }
        sb.append(q.poll()+">");
        System.out.println(sb);


    }
      
}
