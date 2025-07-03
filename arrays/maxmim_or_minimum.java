import java.util.Scanner;

public class maxmim_or_minimum {
     public static void main(String[] args) {
        System.out.println("enter the length of array");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the values in array");

        for(int i=0;i<arr.length;i++){
            arr[i]=obj.nextInt();
        }

        int max=arr[0];
        int min=arr[0];

        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }

            if(min>arr[i]){
                min=arr[i];
            }
        }

        System.out.println("maximum is " + max);
        System.out.println("minimum is " + min);
    }
}
