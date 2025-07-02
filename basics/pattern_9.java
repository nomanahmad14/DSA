import java.util.Scanner;

public class pattern_9 {
    public static void main(String[] args) {
        System.out.println("enter the value of n");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        int ls = 0;
        int ms = 1+2 *( n -2);

        // upper part

        for (int i = 1; i <= n; i++) {

            // leftspaces
            for (int j = 1; j <= ls; j++) {
                System.out.print(" ");
            }
            System.out.print(i);
            

            // middle spaces
            
                for (int j = 1; j <= ms; j++) {
                    System.out.print(" ");
                }
                ls++;
                ms = ms - 2;
               if(i!=n) {
                System.out.print(i);
               }
                System.out.println();
            
        }


         // lower part
        ls=n-2;
        ms=1;


         for (int i = n-1; i >= 1; i--) {

            // leftspaces
            for (int j = 1; j <= ls; j++) {
                System.out.print(" ");
            }
            System.out.print(i);
            

            // middle spaces
            
                for (int j = 1; j <= ms; j++) {
                    System.out.print(" ");
                }
                System.out.print(i);
                ls--;
                ms = ms +2;
             
                System.out.println();
            
        }
    }
}
