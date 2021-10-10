import java.util.Scanner;

public class baekjoon_1018 {
    public static char[][] boad;
    public static int min=64;

    public static void find(int x, int y){
        int count=0;
        char first=boad[x][y];
        
        if(first=='W'){
            for(int i=x;i<x+8;i++){
                for(int k=y;k<y+8;k++){
                  if(first!=boad[i][k]){
                      count++;
                  }
                  
                  if(first=='W'){
                    first='B';
                  }
                  else{
                    first='W';
                  }

                }
                if(first=='W'){
                    first='B';
                  }
                  else{
                    first='W';
                  }
            }
        }
        else if(first=='B'){
            for(int i=x;i<x+8;i++){
                for(int k=y;k<y+8;k++){
                  if(first!=boad[i][k]){
                      count++;
                  }
                  
                  if(first=='W'){
                    first='B';
                  }
                  else{
                    first='W';
                  }

                }
                if(first=='W'){
                    first='B';
                  }
                  else{
                    first='W';
                  }
            }
        }
        if(min>count){
            min=count;
        }
      
     
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        boad=new char[x][y];
        
        sc.nextLine();

        for(int i=0;i<x;i++){
            String str=sc.nextLine().trim();
            for(int k=0;k<y;k++){
                boad[i][k]=str.charAt(k);
            }
        }
        
        int xlengh=x-7;
        int ylengh=y-7;

        for(int i=0;i<xlengh;i++){
            for(int k=0;k<ylengh;k++){
                find(i,k);

            }
        }
        System.out.println(min);
        


    }
}
 