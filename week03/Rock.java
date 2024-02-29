// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;


public class Rock
{
   public static void main(String[] args)
   {
      String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay;  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number
                            


        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        System.out.print ("Play Rock, Paper, Scissors\n Enter (R, P, or S): ");
        personPlay = scan.next();
        personPlay.toUpperCase();
        computerInt = generator.nextInt(3);
        computerPlay = Integer.toString(computerInt);
        

        switch (computerInt)
        {
            case 0:
                computerPlay = "R";
                System.out.println("Computer plays: " + computerPlay);
                break;
            case 1:
                computerPlay = "P";
                System.out.println("Computer plays: " + computerPlay);
                break;
            case 2:
                computerPlay = "S";
                System.out.println("Computer plays: " + computerPlay);
                break;
            default:
                System.out.println("Wrong Input");
        }


        //Print computer's play
        if (personPlay.equals(computerPlay))  
            System.out.println("It's a tie!");
        else if (personPlay.equals("R"))
            if (computerPlay.equals("S"))
                System.out.println("Rock crushes scissors.  You win!!");
            else if (computerPlay.equals("P"))
                System.out.println("Paper beats Rock.  You Lose!!");

        else if (personPlay.equals("P"))
            if (computerPlay.equals("S"))
                System.out.println("Scissors beats Paper.  You Lose!!");
            else if (computerPlay.equals("R"))
                System.out.println("Paper beats Rock.  You Win!!");

        else if (personPlay.equals("S"))
            if (computerPlay.equals("P"))
                System.out.println("Scissors beats Paper.  You win!!");
            else if (computerPlay.equals("R"))
                System.out.println("Rock beats Scissors.  You Lose!!");

   }
}
