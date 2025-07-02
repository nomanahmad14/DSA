import java.util.Scanner;
public class rohmbus_pattern {
    public static void main(String[] args) {
        System.out.println("enter the number of rows : ");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<i+n;j++){
                if(j<i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
