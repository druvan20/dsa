import java.util.Scanner;

public class tables {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER: ");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            
            System.out.println("THE number is"+n+"*"+i+"="+n*i);
        }
        
    }
}