// check wheteher a numberis power of 2 or not
import java.util.Scanner;
public class power_of_two {
    public static void main(String[] args) {
        System.out.println("eneter the number to be checked :");

        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        boolean t=true;
        while(n!=1){
            if(n%2==0){
               t=true;
                n=n/2;
            }else{
                
                System.out.println("number is not of the power 2");
                t=false;
                break;
            }
            
             }

             if(t==true){
                System.out.println("number is of power 2");
       
        }


    }
}
