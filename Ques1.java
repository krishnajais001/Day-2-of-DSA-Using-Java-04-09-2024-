import java.lang.*;
import java.util.*;
public class Ques1 {
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        int a,b,c;
        double sum;
        System.out.println("Enter A :");
        a=val.nextInt();
        
        System.out.println("Enter B :");
        b=val.nextInt();
        
        System.out.println("Enter C :");
        c=val.nextInt();
        
        sum=(a+b+c)/3;
        System.out.println("Average of A,B,C :"+sum);
    }
}
