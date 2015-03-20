/**
 * Created by fattyduck on 3/18/15.
 */
import java.util.Scanner;

public class fibonacci {

    public static int fibonacci(int num) {
        //fibonacci start
        int fnum = 0;
        int snum = 1;
        /*this for loops idea is sum is first number plus second number then the pattern restarts itself
        *  with first number as second number and second number as sum and goes on etc.
        */

        for (int i = 0; i < num; i++) {
            int tnum = fnum + snum;
            fnum = snum;
            snum = tnum;



        }
        return fnum;

    }


    public static void main(String[] args) {
        Scanner cow=new Scanner(System.in);
        System.out.println("Which number place do you want to see from the fibonacci game?");
        int in= cow.nextInt();
        System.out.println(fibonacci(in));
    }


}

