import java.util.Scanner;

public class pattern_8 {
    public static void main(String[] args) {
        System.out.println("enter the number :");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();

        //upper part
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        //lower part

        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
