import java.util.Scanner;
public class sum_of_digit {
    public static void main(String[] args) {
        System.out.print("enetr the number : ");

        Scanner obj= new Scanner(System.in);
        int n=obj.nextInt();
        int sum=0;

        while(n>0){
            sum=sum+n%10;
            n=n/10;
        }
        System.out.println("sum of digits is : " + sum);
    }

}
