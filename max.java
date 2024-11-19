import java.util.*;
public class max{
    public static void main(String [] args){
        int [] arr;
        int n,max=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER num of elements");
        n=sc.nextInt();
        arr = new int[n];
        System.out.println("ENTER THE ARRAY Elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("THE ARRAY Elements");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                  max=arr[i];
            }
        }
        System.out.println("MAX ELEMENTS:  "+max);
    }
}