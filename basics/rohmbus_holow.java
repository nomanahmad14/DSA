import java.util.Scanner;
public class rohmbus_holow {
    public static void main(String[] args) {
        System.out.print("enter the number n : ");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();

        int ls=n-1;
        int ms=n-2;
        
        for(int i=1;i<=n;i++){
            //left dpaces
            for(int j=1;j<=ls;j++){
                System.out.print("  ");
            }

            ls--;
            System.out.print("* ");
            if(i==1 ||i==n){
                for(int j=1;j<=n-1;j++){
                    System.out.print("* ");
                }
               }
            else{
                      //mid spaces
                      for(int j=1;j<=ms;j++){
                        System.out.print("  ");
                    }
        
                    System.out.print("* ");
           }

            System.out.println();
        }
    }
}
