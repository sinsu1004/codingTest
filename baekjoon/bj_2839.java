import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2839 {
    

    public static void main(String[] args) throws IOException{
        
        BufferedReader dc=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(dc.readLine());
        int count=0;

        if(n%5==0){
            count=n/5;
        }
        else if(n%5==1 ||n%5==3){
            count=n/5+1;
        }
        else if(n%5==4 && n>9||n%5==2 && n>12){
            count=n/5+2;
        }
        else if(n%3==0){
            count=n/3;
        }
        
        else{
            count=-1;
        }



        System.out.println(count);
    }
}

