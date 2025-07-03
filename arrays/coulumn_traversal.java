import java.util.Scanner;
public class coulumn_traversal {
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

        System.out.println("column wise traveral : ");
        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++){
                
                System.out.print(arr[j][i] + " ");
                
            }
            System.out.println();
        }
    }
}
