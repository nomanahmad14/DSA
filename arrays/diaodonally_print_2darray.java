import java.util.Scanner;
public class diaodonally_print_2darray {
    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();

        int [][] arr=new int[n][n];

        System.out.println("enter he element of the array");

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=obj.nextInt();
            }
        }

        System.out.println("printing diaoganlly :");

        for(int i=0;i<n;i++)
        {
            for(int k=i;k>=0;k--)
            {
                for(int j=0;j<=i;j++)
                {
                    System.out.print(arr[k][j]);
                }
            }
            System.out.println();
        }


    }
}
