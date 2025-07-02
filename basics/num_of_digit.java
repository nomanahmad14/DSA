import java.util.Scanner;
public class num_of_digit {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("enter the number : ");
        int a=obj.nextInt();
        int count=0;
        while(a>0){
            a=a/10;
            count++;
        }

        System.out.println("number of digit are: " + count);
    }

}
