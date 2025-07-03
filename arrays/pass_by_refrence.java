public class pass_by_refrence {
    public static void fun(int a,int b[]){
        a=a+8;
        b[0]=b[0]+5;
        b[1]=b[1]+7;
    }
    public static void main(String[] args) {
        int arr[]=new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;

        int a=8;

        fun(a, arr);

        System.out.println(a);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

    }
}
