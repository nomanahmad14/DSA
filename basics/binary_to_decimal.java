import java.util.Scanner;
public class binary_to_decimal {
    public static int powerFn(int n,int b){
        int ans=1;
        for(int i=1;i<=b;i++){
            ans=ans*n;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("enter the binary number");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int decimal=0;
        int n1=n;
        int digit=0;
        while(n>0){
            n=n/10;
            digit++;
        }
       
        for(int i=0;i<digit;i++){
            int l=n1%10;
            decimal=decimal + (l* powerFn(2, i));
            n1=n1/10;
        }

        System.out.println("number in decimal = " + decimal);
    }
}
