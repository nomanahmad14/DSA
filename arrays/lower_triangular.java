import java.util.Scanner;

public class lower_triangular {
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

        
        for(int i=0;i<rows;i++){
           
            for(int j=0;j<cols;j++){
                if(i>=j)
                {
                System.out.print(arr[i][j] + " ");
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
           
        }

        

    }
}






