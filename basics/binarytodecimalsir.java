public class binarytodecimalsir {
    public static void main(String[] args) {
        int b=10101;
        int sum=0;
        int power=1;

        while(b>0){
            int l=b%10;
            sum=sum+ l * power;
            power=power*2;
            b=b/10;

        }
        System.out.println(sum);
    }
}
