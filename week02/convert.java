import java.util.Scanner;

public class convert {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

    float mile, kilo;

    System.out.println("Enter mile number");
    mile = scan.nextFloat();

    kilo = mile * 1.60935f;
    
    System.out.println("Miles " + mile + " to Kilo is 2" + kilo);
    }
}
