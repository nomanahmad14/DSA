import java.util.Scanner;
public class fun_armstron_1_to_n {

    public static int powerfn(int a,int b){
        int product =1;
        for(int i=1;i<=b;i++){
            product=product*a;
        }
        return product;
    }

    public static boolean isArmstrong(int n){
        int cn=n;
        int digit=0;

        while(n>0){
            digit++;
            n=n/10;
        }
        int ans=0;
        n=cn;
        while (n>0) {
            ans=ans+powerfn(n%10, digit);
            n=n/10;
            
        }
        if(ans==cn){
            return true;
        }else{
            return false;
        }


    }
    public static void main(String[] args) {
        System.out.println("enter the number n: ");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();

        for(int i=1;i<=n;i++){
            if(isArmstrong(i)==true){
                System.out.println(i);
            }
        }
        
    }
}
