import java.util.Random;
import java.util.Scanner;
public class GuessingGame{
    public static void main(String[] args){

    


Random random=new Random();
Scanner scanner=new Scanner(System.in);
int numberguess=random.nextInt(100)+1;
int guess;
int attempts=0;
System.out.println(" Heartly welcome to guessing game my friends");
System.out.println(" i have picked a number between 1 and 100");
System.out.println(" can you guess that?");
while(true)
{
    System.out.println(" enter the guess");
    guess=scanner.nextInt();
    attempts++;

    if(guess==numberguess){
        System.out.println(" yeah congratulations ,you guess right in "+attempts+"attempts");
        break;
    }
    else if(guess<numberguess){
        System.out.println(" Too low!! please try again");
    }
    else
    {
        System.out.println(" Too high!! try again");
    }
}
System.out.println(" Thanks for playing , have a good day");
scanner.close();
    }
}
