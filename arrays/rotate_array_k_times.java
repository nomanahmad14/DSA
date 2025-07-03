import java.util.Scanner;

public class rotate_array_k_times {
    public static void main(String[] args) {
         System.out.println("enter the length of array");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the values in array");

        for(int i=0;i<arr.length;i++){
            arr[i]=obj.nextInt();
        }

        System.out.println("current array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("how many times you want to  rotate the array: ");

        int k=obj.nextInt();
        k=k%n;
        int newArr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            if(i-k >=0)
            {
                newArr[i-k]=arr[i];
            }else
            {
                newArr[i-k+n]=arr[i];
            }
        }

        System.out.println("rotated array is: ");
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i] + " ");
        }
        

    }
}
