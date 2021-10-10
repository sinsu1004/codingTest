import java.util.Scanner;

public class baekjoon_7568 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] x=new int[n];
        int[] y=new int[n];
        int[] rank=new int[n];
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
            rank[i]=1;
            if(i!=0){
                for(int k=i-1;k>-1;k--){
                    if(x[i]>x[k]&&y[i]>y[k]){
                        rank[k]++;
                    }
                    else if(x[i]<x[k]&&y[i]<y[k]){
                        rank[i]++;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(rank[i]+" ");
        }


    }
}
