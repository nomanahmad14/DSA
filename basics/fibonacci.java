import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println("enter the number :");
        Scanner obj=new Scanner(System.in);

        int n=obj.nextInt();
        
        int f=0;
        int s=1;

        System.out.println(f);
        System.out.println(s);

        n=n-2;
         while(n>0){
            int t=f+s;

            System.out.println(t);
            f=s;
            s=t;
            n--;
         }
    
    
    
    
    }
}
