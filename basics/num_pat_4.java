
import java.util.Scanner;

public class num_pat_4 {
    public static void main(String[] args) {
        System.out.println("enter the number of rows :");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        System.out.println("enter the number of columns :");
        int m=obj.nextInt();
        int n1=n;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(j%2==0){
                System.out.print("0");
               }else{
                System.out.print("1");
               }
            }
           
            System.out.println();
        }
    }
}
