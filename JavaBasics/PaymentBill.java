/*Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)*/

import java.util.*;

public class PaymentBill {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost of a pencil");
        float pencil = sc.nextFloat();
        System.out.print("Enter the cost of a pen");
        float pen = sc.nextFloat();
        System.out.print("Enter the cost of a eraser");
        float eraser = sc.nextFloat();
        float cost = (pen + pencil + eraser);
        System.out.print("Cost:" +cost);
        float result = cost * 0.18f;
        System.out.println("Total Bill:" + (result+cost));
    }
    
}
