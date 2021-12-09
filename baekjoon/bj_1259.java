import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1259 {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        while(true){
            int a= Integer.parseInt(br.readLine());
            if(a==0){
                break;
            }
            
            String b=String.valueOf(a);
            char[] c=b.toCharArray();
            boolean d=true;
            
            for(int i=0;i<c.length/2;i++){
                if(c[i]!=(c[c.length-i-1])){
                    d=false;
                }
            }
            if(d==true){
                sb.append("yes\n");
            }
            else{
                sb.append("no\n");
            }



            


        }

        System.out.println(sb);
        
    }

}
