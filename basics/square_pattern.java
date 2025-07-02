import java.util.Scanner;

public class square_pattern {
    public static void main(String[] args) {
        System.out.println("enter the number of rows");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
