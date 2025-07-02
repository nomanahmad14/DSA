import java.util.Scanner;
public class fun_npr {
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static int npr(int n,int r){
        int npr;
        if(n-r<0){
            npr=0;
        }else{
            int factn=factorial(n);
            
            int factnr=factorial(n-r);

            npr=factn/(factnr);
        }

        return npr;
    }

    public static void main(String[] args) {
        System.out.println("enter the value of n and r");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int r=obj.nextInt();

        System.out.println("nPr for given number is : " + npr(n, r));
    }
}
