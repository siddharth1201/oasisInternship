package Ngame;
import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
public class Main {
    public static void main(String[] args){
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number:");
        
        int rand_int = ran.nextInt(100);
        System.out.print("The number is between 1 and 100:\nYou have 10 attempts to guess the number!\n");
        int strikes = 0;
        while(true){
            System.out.println("\n=======================================================================================\n");
            System.out.print("Enter your number:");
            if(strikes>10){
                System.out.println("You have failed to guess the number");
                break;
            }
            int guess = sc.nextInt();
            strikes++;
            if(guess>rand_int){
                System.out.println("The actual number is lower:");
            }
            else if(guess<rand_int){
                System.out.println("The actual number is higher");
            }
            else{
                System.out.println("Congratulations!!!! you have successfully guessed the number\nYour Score is:"+(10-strikes));
                break;
            }
        }
    }

    
    
}
