import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bj_1003 {
    


    public static void main(String[] args) {
    
        Scanner sc =new Scanner(System.in);
        

        int x=sc.nextInt();
        int y=sc.nextInt();
        int w=sc.nextInt();
        int h=sc.nextInt();

        ArrayList<Integer> data=new ArrayList<>();
        data.add(x-0);
        data.add(y-0);
        data.add(w-x);
        data.add(h-y);

        Collections.sort(data);

        System.out.println(data.get(0));

    
        
        

    }



}
