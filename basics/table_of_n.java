import java.util.Scanner;
public class table_of_n {
    public static void main(String[] args) {
        System.out.print("enter the number : ");

        Scanner obj=new Scanner(System.in);

        int n=obj.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(n + "*" + i + "=" + (n*i));
        }
    }
}
