import java.util.Scanner;

public class missing_num_0_to_n {

    public static int summ(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }

        return sum;
    }
    public static void main(String[] args) {
        System.out.println("enter the length of array");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the values in array");

        for(int i=0;i<arr.length;i++){
            arr[i]=obj.nextInt();
        }
        
        int sumofall=summ(n);
        int sumofarray=0;
        for(int i=0;i<n;i++){
            sumofarray=sumofarray+arr[i];
        }

        int missingelement=sumofall-sumofarray;
        System.out.println("missing element is  "+ missingelement);
        
    }
}
