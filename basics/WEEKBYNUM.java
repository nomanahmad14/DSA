import java.util.Scanner;
public class WEEKBYNUM {
    public static void main(String[] args) {
        System.out.println("enetr the day number : ");

        Scanner obj=new Scanner(System.in);
        int d=obj.nextInt();

        switch(d){
            case 1:
            System.out.println("MONDAY");
            break;

            case 2:
            System.out.println("TUESDAY");
            break;

            case 3:
            System.out.println("WEDNESDAY");
            break;

            case 4:
            System.out.println("THURSDAY");
            break;

            case 5:
            System.out.println("FRIDAY");
            break;

            case 6:
            System.out.println("SATAURDAY");
            break;

            case 7:
            System.out.println("SUNDAY");
            break;

            default:System.out.println("wrong day");
        }
    }
}
