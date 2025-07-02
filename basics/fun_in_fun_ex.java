public class fun_in_fun_ex {
    public static void f1(){
        f2();
        System.out.println("1");
        f3();
    }
    public static void f2(){
        f3();
        System.out.println("2");
        
    }
    public static void f3(){
        System.out.println("3");
        
        
    }
    
    public static void main(String[] args) {
        f1();
        f2();
        f3();
    }
}
