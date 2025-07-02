import java.util.Scanner;

public class char_or_num {
    public static void main(String[] args) {
        System.out.println("enter char or num : ");
        Scanner obj=new Scanner(System.in);
        char ch=obj.next().charAt(0);

        int val=ch;

        if((val>=65 && val<=90) || (val>=97 && val<=122)){
            System.out.println("its a alphabet");
        }else{
            System.out.println("its a number");
        }
    }
}
