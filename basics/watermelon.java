import java.util.Scanner;

public class watermelon {
    public static void main(String[] args) {
        System.out.print("enter the weight of watermelon :");

        Scanner obj=new Scanner(System.in);

        int w =obj.nextInt();

        if(w>=4 && w%2==0){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
