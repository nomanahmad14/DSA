import java.util.Scanner;
public class max {
    public static void main(String[] args) {
        System.out.print("enter three numbers: ");
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        

        if(a>=b && a>=c){
            System.out.println("greater number is a= " + a);
        }
        else if(b>=a && b>=c){
            System.out.println("greater number is b= " + b);
        }else{
            System.out.println("greater number is c= " + c);
        }
    }
}
