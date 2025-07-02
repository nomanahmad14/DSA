import java.util.Scanner;
public class armstrong {
    public static int powerFN(int a,int b){
        int answer=1;
        for(int i=1;i<=b;i++){
            answer=answer*a;
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println("enter the numberv:");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int n1=n;
        int n2=n;
        int d=0;
        int sum=0;
        while(n>0){
            n=n/10;
            d++;
        }

        System.out.println("number of digit = " + d);

        while(n1>0){
                sum=sum +powerFN(n1%10,d) ;
                n1=n1/10;

        }

        if(sum==n2){
            System.out.println("given number is armstrong number");
        }else{
            System.out.println("given number is not armstrong number");
        }
    }
}
