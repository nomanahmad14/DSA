import java.util.Scanner;
 public class rotate_2d_array {
    public static int [] reverse(int [] arr){
        int i=0;
        int j=arr.length - 1;

        while (i<j) 
        {
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;    

            i++;
            j--;
        }

        return arr;
    }
 

    public static int [][] rotate(int [][] arr){
        
        int n=arr.length;//rows and cols

        //step 1 take transpose
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i<j)
                {
                    int temp;
                    temp =arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }

            }
        }

        //step 2 interchange rows

        for(int i=0;i<n;i++)
        {
            reverse(arr[i]);

        }

        return arr;
            
    }
    public static void main(String[] args) {
        
        System.out.print("enter the size of the array: ");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int [][] arr=new int[n][n];
        System.out.println("enter the element of array");

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=obj.nextInt();
            }
        }

        rotate(arr); 
        System.out.println("rotated array is :");

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]);
            }

            System.out.println();
        }

    }
 }
