/*In a program, input the side of a square. You have to output the area of the
square.*/

import java.util.*;

public class SquareArea {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the square:");
        float side = sc.nextFloat();
        System.out.print("The area of the square is:");
        System.out.println(side*side);
    }
}
