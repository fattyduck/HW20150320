/**
 * Created by fattyduck on 3/19/15.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class verbosityCalc {

    public static double verbosityCalc(String filePath){
        //Using double so that I can compare in main
        double verbosity=0;
        int periods=0;

        try{
            //Create strings from files
            String file1 = new Scanner(new File(filePath)).useDelimiter("\\Z").next();
            //Convert string to string array by splitting at space
            String[] Array = file1.split(" ");
            //getting the size of the array and indirectly the number of words
            int words = Array.length;


            for(int i = 0; i<words; i++){
                if (Array[i].contains(".")){
                    periods++;
                }
            }

            double dWords = (double)words;
            double dPeriods= (double)periods;

            verbosity = dWords/dPeriods;

        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

        return verbosity;
    }

    public static void main(String[] args){

        //btw my home system is ubuntu which does not contain .txt or etc to find files, you might to to add .txt at the end of filepath
        System.out.print("The verbosity of Stellar Transformations is: ");
        System.out.printf("%.4f", verbosityCalc("/home/fattyduck/IdeaProjects/HW20150320/src/StellarTrans"));
        //limit desimal places to 4
        System.out.println();

        System.out.print("The verbosity of Swallowed Star is: ");
        System.out.printf("%.4f", verbosityCalc("/home/fattyduck/IdeaProjects/HW20150320/src/SwallowStar"));
        //limit desimal places to 4
        System.out.println("\n");
        //added next line for visual effects

        if(verbosityCalc("/home/fattyduck/IdeaProjects/HW20150320/src/StellarTrans")<verbosityCalc("/home/fattyduck/IdeaProjects/HW20150320/src/SwallowStar")){
            System.out.println("Which means Stellar Transformations is more verbose than Swallowed Star!");
        }else{
            System.out.println("Which means Swallowed Star is more verbose than Stellar Transformations!");
        }
    }

}