import java.util.*;
import java.lang.*;
public class Ques3 {
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        float pencil,pen,eraser,totalCost,gst;
       
        System.out.println("Enter Cost of Pencil :");
        pencil=val.nextFloat();

        
        System.out.println("Enter Cost of Pen :");
        pen=val.nextFloat();

        
        System.out.println("Enter Cost of Eraser :");
        eraser=val.nextFloat();

        totalCost=(pencil+pen+eraser);
        gst=(18*totalCost)/100;

        System.out.println("Total Cost inlcude Gst Tax is "+(totalCost+gst));
    }
}
