import java.util.Scanner;

public class even_or_odd_array {
    public static void main(String[] args) {
        
        System.out.println("enter the size of array");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elemnts of array");
        
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }

        int counteven=0;
        int countodd=0;

        for(int i=0;i<n;i++){
            if(arr[i] % 2 == 0){
                counteven++;
            }else{
                countodd++;
            }
        }



        int even[]=new int[counteven];
        int odd[]=new int[countodd];
        int j=0;
        int k=0;

        for(int i=0;i<n;i++)
        {
            if(arr[i] % 2 ==0){
                
                even[j]=arr[i];
                j++;
                
            }else
            {
                
                odd[k]=arr[i];
                k++;
            }
        }

        System.out.println("even array is :");

        for(int i=0;i<even.length;i++){
            System.out.println(even[i]);
        }

        System.out.println("odd array is :");

        for(int i=0;i<odd.length;i++){
            System.out.println(odd[i]);
        }
    }
}
