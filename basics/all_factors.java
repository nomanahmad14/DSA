import java.util.Scanner;
public class all_factors {
    public static void main(String[] args) {
        System.out.println("enter the number : " );
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();

        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}
