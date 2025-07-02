import java.util.Scanner;
public class pattern_7 {
    public static void main(String[] args) {
        System.out.println("enter the number :");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int n1=n;

        for(int i=0;i<n;i++){
            for(int j=n1;j>i;j--){
                System.out.print(j +" ");
                
            }
            System.out.println();
            
        }
    }
}
