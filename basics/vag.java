import java.util.Scanner;
public class vag {
    public static void main(String[] args) {
        System.out.println("enter the value of n ");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int s=0;

        //upper part
        for(int i=0;i<n;i++){
            //first * portion
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }

            //mid spaces
            for(int j=1;j<=s;j++){
                System.out.print(" ");
            }
            s=s+2;

            //last * portion
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
 
        s=2*(n-1);

        // lower part
        for(int i=1;i<=n;i++){
            //first * portion
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //mid spaces
            for(int j=1;j<=s;j++){
                System.out.print(" ");
            }
            s=s-2;

            //last * portion
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
