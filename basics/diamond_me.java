import java.util.Scanner;
public class diamond_me {
    public static void main(String[] args) {
        System.out.println("enter the value of n : ");
        Scanner obj=new Scanner(System.in);
       
        int n=obj.nextInt();

       int star=1;
       int space=n-1;

       for(int i=1;i<=n;i++){
        for(int j=1;j<=space;j++){
            System.out.print("  ");
        }

        for(int j=1;j<=star;j++){
            System.out.print("* ");
        }

        space=space-1;
        star=star+2;
        System.out.println();
       }

       space=1;
       star=star-4;

       for(int i=1;i<=n;i++){
        for(int j=1;j<=space;j++){
            System.out.print("  ");
        }

        for(int j=1;j<=star;j++){
            System.out.print("* ");
        }

        space=space+1;
        star=star-2;
        System.out.println();
       }
    }
}
