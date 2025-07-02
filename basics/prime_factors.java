import java.util.Scanner;
public class prime_factors {
    public static boolean isPrime(int n){
        int count=0;
        int n1=n;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2 || count==1){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        
    //    boolean t= isPrime(15);
    //    System.out.println(t);
    System.out.println("enter the number : ");
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    int n1=n;
    for(int i= 1;i<=n;i++){
        if(n%i==0){
            if(isPrime(i)==true){
                System.out.println(i);
            }
        }
    }
    }
    
}
