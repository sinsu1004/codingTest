import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class bj_2869 {

    public static void main(String[] args) throws IOException {
        
        Scanner sc =new Scanner(System.in);
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

    
        st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int c=Integer.parseInt(st.nextToken());
        
        
        int sum=0;
        int count=0;
        while(c>sum){
            if(count!=0){
            sum-=b;        
            }
            sum+=a;
            count++;
            
        }
        System.out.print(count);
        

    }
}
