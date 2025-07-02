import java.util.Scanner;
public class question {
    public static void main(String[] args) {
        Scanner cl=new Scanner(System.in);
        // cl.close();
        // int a=cl.nextInt();
        // char b=cl.next().charAt(0);
        // float c=cl.nextFloat();

        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);

        // int a=cl.nextInt();
        // int b=cl.nextInt();

        // int c=a+b;

        // System.out.println(c);

        // System.out.println(a+b);
        // System.out.println(a-b);
        // System.out.println(a*b);
        // System.out.println(a/b);
        // System.out.println(a%b);
        System.out.println("enter temprature in fahrenite=");
        double f=cl.nextDouble();
        
        double c=((f - 32)*5.0)/9.0;
        System.out.println("temprature in celcius=" + c);

    }
    
}
