import java.util.Scanner;

public class baekjoon_2231 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        
        int result =0;

        for(int i=0;i<number;i++){
            int sum=0;
            int n=i;

            while(n !=0){
                sum+=n%10;
                n /=10;
            }

            if(sum+i==number){
                result=i;
                break;
            }
        }
        System.out.println(result);
        
    }
}
