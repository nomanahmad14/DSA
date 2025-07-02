import java.util.Scanner;
public class first_and_last_digit {
    public static void main(String[] args) {
        System.out.println("enter the number :");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int l=n%10;
        int f=0;
        while(n>0){
            f=n%10;
            n=n/10;
        }

        System.out.println("first digit is : " + f + "  last digit is : " + l);
        
    }   
}
