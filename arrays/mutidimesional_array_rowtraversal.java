import java.util.Scanner;
public class mutidimesional_array_rowtraversal {

    public static void main(String[] args) {
        System.out.println("enter the element os array: ");

        int arr[][]=new int[3][3];

        Scanner obj=new Scanner(System.in);
        // int n=obj.nextInt();

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=obj.nextInt();
            }
        }

        System.out.println("row wise traversal is :");

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}