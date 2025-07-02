import java.util.Scanner;
public class max_or_min {
    public static int max(int n1,int n2){
        if(n1>n2){
            return n1;
        }else {
            return n2;
        }
    }
    public static void main(String[] args) {
        System.out.println("enter two number : ");
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int maximum=max(a, b);
        System.out.println("maximum between " + a + " and " + b + " is " + maximum);
        int minimum=0;
        if(a==maximum){
            minimum=b;
        }else{
            minimum=a;
        }
        System.out.println("minimum between " + a + " and " + b + " is " + minimum);
    }
}
