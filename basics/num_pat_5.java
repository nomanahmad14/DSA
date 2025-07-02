
import java.util.Scanner;

public class num_pat_5 {
    public static void main(String[] args) {
        System.out.println("enter the number of rows :");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int n1=n;
        for(int i=1;i<=n;i++){

            for (int j = n; j >= i; j--) { 
                System.out.print(" "); 
            } 



            for(int j=1;j<=i;j++){
                System.out.print(n1);

            }
            System.out.println();
            n1--;
        }
    }
}
