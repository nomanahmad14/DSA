import java.util.Scanner;

public class diagnoal_interchange {
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

      if(rows==cols)
      {
          
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[i][rows-1-j];
                arr[i][rows-1-j]=temp;

            }
        }
      }else{
        System.out.println("it is not a square array");
        
        }

        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
        

    }
}
