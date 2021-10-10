import java.util.Scanner;

public class baekjoon_1436 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        int key=666;
        int count =1;

        while(count !=n){
            key++;
            if(String.valueOf(key).contains("666")){
                count++;
            }


        }
        System.out.println(key);

        
    }
}
