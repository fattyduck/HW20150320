/**
 * Created by fattyduck on 3/18/15.
 */
import java.util.Scanner;
public class prettyTitle{

    public static void titleEdit(String input){
        String[]words=input.split(" ");
        //using split to convert string into an array of words
        int stringLengh=input.length();
        int arrayLength= words.length;
        //made an int for the array length and input length
        String output=words[0].substring(0,1).toUpperCase()+words[0].substring(1);
        //The first word of the string is automatically there and first letter capitalized
        String underline="";
        //loop to create underline
        for(int i=0;i<stringLengh;i++){
            if(input.charAt(i)!=' '){
                underline+="*";
            }else{
                underline+=" ";
            }
        }
        //loop to capitalize
        for(int i=1; i<arrayLength;i++){
            //start from 1 because I want the first word to always be capital
            if(words[i].equalsIgnoreCase("of")||words[i].equalsIgnoreCase("a")||words[i].equalsIgnoreCase("and")||words[i].equalsIgnoreCase("the")){
                output+=" "+words[i];
            }else{
                output+=" "+words[i].substring(0,1).toUpperCase()+words[i].substring(1);
            }
        }
        System.out.println(output);
        System.out.println(underline);
    }
    public static void main(String[] args){
        Scanner cow = new Scanner(System.in);
        String title;
        System.out.println("Enter the title here: ");
        title = cow.nextLine();
        titleEdit(title);

    }



}