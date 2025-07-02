import java.util.Scanner;

public class pattern_6 {
  public static void main(String[] args) {
    System.out.println("enter the number n : ");
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    int n1=n;
    //uppper part
    //spacee starting 
    int leftspace=0;
    int midspace=n+2;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=leftspace;j++){
            System.out.print(" ");
            
        }
        leftspace=leftspace+1;
        System.out.print("*");
        // System.err.println();

        //mid spacce
        
        for(int j=1;j<=midspace;j++){
            System.out.print(" ");
        }

        midspace=midspace-2;
        if(i!=n){
            System.out.print("*");
        }
        
        System.out.println();
    }
    
    //lower part
    
    leftspace=leftspace-2;
    midspace=midspace+4;
    for(int i=1;i<=n-1;i++){
        //start spaces
        for(int j=1;j<=leftspace;j++){
            System.out.print(" ");

        }
        leftspace=leftspace-1;
        System.out.print("*");
        
        for(int j=1;j<=midspace;j++){
            System.out.print(" ");
        }
        midspace=midspace+2;
        System.out.print("*");
        System.out.println();
    }
   
    
  }  
}
