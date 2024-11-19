import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER: ");
        
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("PLEASE ENTER A POSITIVE NUMBER");
        }

        else if (num == 1) {
            System.out.println("1 is prime or composite");
        } 
        else {
            boolean isPrime = true; 
            for (int i = 2; i * i <= num; i++) { 
                if (num % i == 0) {
                    isPrime = false; 
                    break; 
                }
            }
            
            if (isPrime) {
                System.out.println(num + " is  prime");
            } else {
                System.out.println(num + " is not  prime");
            }
        }
    }
}
