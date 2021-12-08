import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class bj_2292 {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());
        int answer=1;
        int min=2;
        

        while(min<n){
            min = min+(6*answer);
            min--;
            answer++;

        }     
        System.out.println(answer);

    }
}
