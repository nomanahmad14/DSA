import java.util.Scanner;
public class fun_sum {
    public static int summ(int x,int y){
        return x+y;
    }
    public static double SUM(double x,double y){
        return x+y;
    }

    public static void main(String[] args) {
        System.out.println("enter two numbers : ");
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        
        double x=93.75;
        double y=75.65;

        int c=summ(a, b);

        System.out.println("sum of two number is = " + c);
        System.out.println(SUM(x, y));
    }
}
