import java.util.Scanner;

/**
 * baekjoon_2798
 */
public class baekjoon_2798 {

    public static void main(String[] args) {
        

        Scanner sc=new Scanner(System.in);
        System.out.println("카드의 개수와 숫자를 입력하세요");
        int number=sc.nextInt();
        int[] arr=new int[number];
        int m =sc.nextInt();
        int sum=0;
        System.out.println("카드 "+number+"장을 순서대로 입력하세요");
        for(int i=0;i<number;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<number-2;i++){ //0,1,2
            for(int k=i+1;k<number-1;k++){ //1,2,3
                for(int l=k+1;l<number;l++){//2,3,4
                    if(sum<(arr[i]+arr[k]+arr[l]) && m>=(arr[i]+arr[k]+arr[l])){
                        sum=(arr[i]+arr[k]+arr[l]);
                        System.out.println(sum);
                    }
                }
            }
        }
        System.out.println(sum);
        



    }
}