import java.util.Scanner;

public class addition_of_two_array {
    public static void main(String[] args) {
        System.out.println("enter the rows and coulumns of the array");
        Scanner  obj=new Scanner(System.in);
        int rows=obj.nextInt();
        int cols=obj.nextInt();

        int arr[][]=new int[rows][cols];
        System.out.println("enter the elments");

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=obj.nextInt();

            }
        }

        int brr[][]=new int[rows][cols];
        System.out.println("enter the elments");

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                brr[i][j]=obj.nextInt();

            }
        }

        int sum[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                sum[i][j]=arr[i][j]+brr[i][j];

            }
        }

        System.out.println("sum array is");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(sum[i][j] + " ");

            }
            System.out.println();
        }

    }
}