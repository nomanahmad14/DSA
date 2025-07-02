import java.util.Scanner;
public class sum_of_digit_of_all_num {
    public static void main(String[] args) {
        System.out.print("enter the number : ");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int sum=0;

        for(int i=1;i<=n;i++){
            int j=i;
            while(j>0){
                
                sum=sum+j%10;
                j=j/10;
            }
        }

        System.out.println("sum of digits os all number til n is : " + sum);





    }
}
