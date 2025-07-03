import java.util.Scanner;

public class mutlply_2darray {
    public static void main(String[] args) {
        System.out.println("enter the size of arrays: ");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();

        System.out.println(("enter he elemnts of array one : "));

        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=obj.nextInt();
            }
        }

        System.out.println(("enter he elemnts of array two : "));

        int b[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                b[i][j]=obj.nextInt();
            }
        }

        int c[][]=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
                }
            }
        }

        System.out.println("result array is : ");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(c[i][j] +" ");
            }
            System.out.println();
        }


    }
}
