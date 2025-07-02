import java.util.Scanner;
public class number_of_primes {
    public static void main(String[] args) {
        
        System.out.println("enter the number :");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int x=n;
        
        for(int i=1;i<=n;i++){
            int count = 0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                  
                }
            }  if(count==2){
                System.out.println(i);
            }
        }


    }
}
