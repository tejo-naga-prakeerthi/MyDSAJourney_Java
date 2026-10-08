/* In a program, input 3 numbers : A, B and C. You have to output the average of
these 3 numbers. */

import java.util.*;

public class Average{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        System.out.print("Enter c:");
        int c = sc.nextInt();
        System.out.print("The average of three numbers is:");
        System.out.println((a+b+c)/3);
    }
}
