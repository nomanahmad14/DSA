import java.util.Scanner;
public class all_armstrong_nums_1_to_N {
    public static int powerFN(int a,int b){
        int answer=1;
        for(int i=1;i<=b;i++){
            answer=answer*a;
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int n1=n;

        for(int i=1;i<=n;i++){
            int d=0;
            int i1=i;
            int sum=0;
            while(i1>0){
            i1=i1/10;
            d++;
            }
            i1=i;
            while(i1>0){
                sum=sum+powerFN(i1%10, d);
                i1=i1/10;
            }

            if(sum==i){
                System.out.println(i);
            }
        }


    }
}
