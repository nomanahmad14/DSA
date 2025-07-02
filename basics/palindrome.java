import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        System.out.println("enter the number : ");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int n2=n;
        int rev=0;
        while(n>0){
            rev=rev*10 + n%10;
            n=n/10;
        }
        System.out.println("reverse of given number is : " + rev);

        if(rev==n2){
            System.out.println("given num is palindrome");
        }else{
            System.out.println("given number is not palindrome");
        }
    }
    
}
