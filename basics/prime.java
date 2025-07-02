import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        System.out.println("enter the number : ");
        Scanner obj= new Scanner(System.in);
        int n=obj.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("number is prime");
        }else{
            System.out.println("number is not prime");
        }

    }
}
