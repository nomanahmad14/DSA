import java.util.Scanner;

public class intersection_of_two_array {
    public static void main(String[] args) {
         System.out.println("enter the length of array");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the values in array");

        for(int i=0;i<arr.length;i++){
            arr[i]=obj.nextInt();
        }

        int n1=obj.nextInt();
        int brr[] = new int[n1];
        System.out.println("enter the values in array");

        for(int i=0;i<brr.length;i++){
            brr[i]=obj.nextInt();
        }
        int count=0;
        int res[]=new int[count];
        
        int uniquearr=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
               if (arr[i]==arr[j])
                {
                    uniquearr++;
                }  
            }
        
        }

        int newarr[]=new int[uniquearr];

        for(int i=0;i<uniquearr;i++)
        {
            
        
        }




    }
}
