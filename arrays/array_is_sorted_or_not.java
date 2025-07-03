import java.util.Scanner;

public class array_is_sorted_or_not{
     public static void main(String[] args) {
        System.out.println("enter the length of array");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the values in array");

        for(int i=0;i<arr.length;i++){
            arr[i]=obj.nextInt();
        }

        boolean res=true;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1]){
                res=true;
            }else{
                res=false;
            }
        }

        if(res==true){
            System.out.println("array is sorteed");
        }else{
            System.out.println("array is not sorted");
        }
    }
}