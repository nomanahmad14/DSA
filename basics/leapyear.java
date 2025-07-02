import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        System.out.println("enter the year you want to check : ");
        Scanner obj=new Scanner(System.in);

        int a=obj.nextInt();
        if(a%4 == 0 && a%100 != 0){
            System.out.println("given year is leap year");
        }else if(a%4 == 0 && a%100==0){
            if(a%400==0){
                System.out.println("given year is leap year");
            }else{
                System.out.println("given year is NOT a leap year");
            }
        }else{
            System.out.println("given year is NOT a leap year");
        }
    }
}
