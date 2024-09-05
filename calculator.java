import java.lang.*;
import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        int a,b;
        System.out.print("Enter value of A :");
        a=val.nextInt();

        System.out.print("Enter value of B :");
        b=val.nextInt();

        System.out.println("Sum of A&B : "+(a+b));
        System.out.println("Sub of A&B :"+(a-b));

        System.out.println("Mul of A&B : "+(a*b));
        System.out.println("Div of A&B :"+(a/b));

        System.out.println("Moulo of A&B : "+(a%b));
        
    }
}
