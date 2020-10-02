/**
 * Created by Ojasvi on 26-01-2018.
 */

import java.util.Scanner; 
public class NumberGame { //created class
    public static void main(String[]args){
        int randomNumber = (int)(Math.random()*100)+1; //used random function
        boolean hasWon=false;
        System.out.println("I have randomly chosen a number between 1 to 100");
        System.out.println("Try to guess it :)");
        Scanner scanner=new Scanner(System.in);
        for (int i= 10; i>0; i--){ //loop for number of chances
            System.out.println("You have "+ i + " guess(es) left. Choose again:");
            int guess=scanner.nextInt();
            if(randomNumber<guess){
                System.out.println("It's smaller than "+guess+" guess");
            }
           else if(randomNumber>guess){
                System.out.println("It's larger than "+guess+" guess");
            }
            else{
                hasWon=true;
                break;
            }
        }
        if(hasWon==true){ // if guessed number is correct
            System.out.println("Correct..!! YOU WON...!!!");
        }else{
            System.out.println("SORRY!! You lose :(");
            System.out.println("The number was "+randomNumber);
        }
    }
}
