import java.util.Scanner;

public class baekjoon_10989 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n=sc.nextInt();
        int[] s2=new int[10001];

        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            s2[a]++;
        }
        for(int i=1;i<10001;i++){
            for(int k=0;k<s2[i];k++){
            sb.append(i+"\n");
            }
        }
        System.out.println(sb);
        
    }
}
