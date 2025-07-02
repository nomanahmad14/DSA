import java.util.Scanner;
public class fun_even_or_odd {
    public static void evenorodd(int n){
        if(n%2==0){
            System.out.println("given number is even");
        }else{
            System.out.println("given number is odd");
        }
    }
    public static void main(String[] args) {
        
        System.out.println("enter he number to check whether its even or odd");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();

        evenorodd(n);
    }
}
