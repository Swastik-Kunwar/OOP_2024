import java.util.Scanner;
public class average {
    // *******************************************************************
//   average.java
//   Read three integers from the user and print their average
// *******************************************************************
    public static void main(String[] args){

        int val1, val2, val3;
        double average;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter three integers and I will compute their average. ");

        System.out.println("Enter first number");
        val1 = scan.nextInt();
    
        System.out.println("Enter second number");
        val2 = scan.nextInt();
        
        System.out.println("Enter third number");
        val3 = scan.nextInt();
    
        average = (val1 + val2 + val3)/3;
    
        System.out.println("The average is " + average);

    }
}
