import java.util.Scanner;

public class fraction {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int numerator, denominator;
    float value;

    System.out.println("Enter numerator number");
    numerator = scan.nextInt();

    System.out.println("Enter denominator number");
    denominator = scan.nextInt();

    value = numerator/denominator;

    System.out.println("The decimal equivalent is " + value);
    }
}
