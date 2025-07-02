import java.util.Scanner;

public class num_pat_1 {
    public static void main(String[] args) {
        System.out.println("enter the number of rows :");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
