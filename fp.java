import java.util.*;

public class functions {
    public static int calculatesum(int a, int b){
        int sum=a+b;
        return sum;

    }
    public static void main(int args[]) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int sum=calculatesum(a,b);
        System.out.println(sum);
    }

    
}
