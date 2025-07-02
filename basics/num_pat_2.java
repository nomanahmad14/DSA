import java.util.Scanner;

public class num_pat_2 {
    public static void main(String[] args) {
        System.out.println("enter the number of rows :");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int n1=n;
        for(int i=1;i<=n;i++){
            int i2=i;
            for(int j=1;j<=i;j++){
                
                System.out.print(i2 +" ");
                i2--;
            }
            System.out.println();
        }
    }
}
