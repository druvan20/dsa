import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("ENTER NUMBER: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;

        }
        System.out.println("SUM IS  "+sum);

    }
}
