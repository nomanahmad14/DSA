import java.util.Scanner;
public class product_of_digits {
    public static void main(String[] args) {
        System.out.print("enter the number : ");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int product=1;
        while(n>0){
            product=product*(n%10);
            n=n/10;
        }
        System.out.println("produvt of digit of number is : " + product);
    }
}
