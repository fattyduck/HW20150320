/**
 * Created by fattyduck on 3/18/15.
 */
import java.util.Scanner;
public class DivisorPatternArt {

    public static void artPattern(int size){
        //made to scale with size
        for(int i=1; i<=size; i++){
            //start with 1 end with exactly size amount
            String artRow="";
            for(int j=1; j<=size; j++){
                if(j%i==0||i%j==0){
                    //only give @ if the remainder is 0
                    artRow+="@ ";
                }
                else{
                    artRow+="  ";
                }

            }
            System.out.println(artRow);

        }

    }

    public static void main(String[] args) {
        Scanner cow= new Scanner(System.in);
        System.out.println("How big do you want your art to be?");
        int size= cow.nextInt();
        artPattern(size);
    }
}
