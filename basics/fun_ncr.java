import java.util.Scanner;
public class fun_ncr {
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static int ncr(int n,int r){
        int ncr;
        if(n-r<0){
            ncr=0;
        }else{
            int factn=factorial(n);
            int factr=factorial(r);
            int factnr=factorial(n-r);

            ncr=factn/(factr*factnr);
        }

        return ncr;
    }

    public static void main(String[] args) {
        System.out.println("enter the value of n and r");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int r=obj.nextInt();

        System.out.println("nCr for given number is : " + ncr(n, r));
    }
}
