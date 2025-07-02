import java.util.Scanner;
public class fun_all_prime_bw_a_to_b {
    public static void printPrime(int a,int b){
        
        for(int i=a;i<=b;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }

                
            }
            if(count==2){
                System.out.println(i);
            }
        }

    }
    public static void main(String[] args) {
        System.out.println("enter the range for primes :");
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        int y=obj.nextInt();

        printPrime(x, y);
    }
}
