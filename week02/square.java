import java.util.Scanner;

public class square {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int length, area, perimeter;

    System.out.println("Enter length of square");
    length = scan.nextInt();

    area = length * length;

    perimeter = 4 * length;




    System.out.println("Area is " + area + " and Perimeter is " + perimeter);
    }
}

