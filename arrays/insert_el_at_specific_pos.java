import java.util.Scanner;
public class insert_el_at_specific_pos {
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n+1];
        System.out.println("enter the elemnts of array");
        
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }

        System.out.println("enter the position at which you want to insert a new element");
        int pos=obj.nextInt();

        System.out.println("enter the element you want to insert");
        int el=obj.nextInt();

        for(int i=n;i>pos-1;i--){
            arr[i]=arr[i-1];
        }

        arr[pos-1]=el;

        System.out.println("new array is ");

        for(int i=0;i<n+1;i++){
            System.out.println(arr[i]);
        }

    }
}
