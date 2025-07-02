import java.util.Scanner;
public class rohmbus_pattern_sir {
    public static void main(String[] args) {
        System.out.println("enter the number of rows : ");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int space=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            
             }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
            space++;
        }
    }
}    
