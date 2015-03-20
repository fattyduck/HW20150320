/**
 * Created by fattyduck on 3/17/15.
 */
import java.util.Random;
import java.util.Scanner;
public class twentyQuestionsGame {
    public static void main(String[] args){
        Scanner cow=new Scanner(System.in);
        Random rand=new Random();
        int myNum=rand.nextInt(100000);
        int guess;
        int chance=20;
        System.out.println("I have a number in mind from 0-100,000. try to best to guess the number!");
        guess=cow.nextInt();
        chance-=1;
        while(guess!=myNum){
            if(guess<myNum){
                System.out.println("My number is greater than the one you guessed! You have "+chance+" chances left, guess again!");
                guess=cow.nextInt();
                chance-=1;
            }else if(guess>myNum){
                System.out.println("My number is less than the one you guessed! You have "+chance+" chances left, guess again!");
                guess=cow.nextInt();
                chance-=1;
            }else{
                System.out.println("Invalid input, You have "+chance+" chances left, guess again!");
                guess=cow.nextInt();
                chance-=1;
            }
            if(chance==0){
                System.out.println("Game over you have lost this game. Please come again!");
                break;
            }
            if(guess==myNum){
                System.out.println("Congratz my friend, you did it!");
            }
        }

    }
}