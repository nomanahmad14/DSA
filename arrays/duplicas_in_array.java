import java.util.Scanner;

public class duplicas_in_array {
    public static void main(String[] args) {
        System.out.println("enter the length of array");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the values in array");

        for(int i=0;i<arr.length;i++){
            arr[i]=obj.nextInt();
        }

        int max=0;

        for(int i=0;i<n;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        // System.out.println(max);

        int feq[]=new int[max+1];
        
        for(int i=0;i<n;i++)
        {
            feq[arr[i]]++;
        }
        int count =0;
        System.out.println("duplicate array is: ");
        for(int i=0;i<max+1;i++)
        {
            if(feq[i]>=2)
            {
                // System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("duplicate elemets are " + count);
    }
}
