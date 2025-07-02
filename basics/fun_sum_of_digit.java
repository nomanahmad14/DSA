import java.util.Scanner;
public class fun_sum_of_digit {
    public static int sumDigit(int n){
        int sum=0;
        while(n>0){
            sum=sum+n%10;
            n=n/10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("enter the number : ");
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();

        System.out.println("sum of digit is :" + sumDigit(x));
    }
}
