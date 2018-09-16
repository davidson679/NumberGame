/* Created By
 Harley Davidson
 Created on 21-07-2018  .
*/
import java.util.Scanner;
public class NumberGames {
    public static void main(String []args){
        int randomNumber =(int) (Math.random() * 100) + 1;
        boolean haswon = false;

        System.out.println("I have randomly chosen a number between 1 and 100.");
        System.out.println("Try to guess it.");

        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i > 0; i--) {
            System.out.println("you have" + ( i ) + "guess(es) left chose again: ");
            int guess = scanner.nextInt();

            if (randomNumber < guess) {
                System.out.println("it's smaller than"  +  (guess)  +  ".");
            }
            if (randomNumber > guess) {
                System.out.println("it's greater than"  +  (guess)  +  ".");
            }
            if (randomNumber == guess) {
                haswon = true;
                break;
            }
        }
        if (haswon){
            System.out.println("CORRECT...........! You WIN......░²¿(-__-)");
            System.out.println("created by HARLEY-DAVIDSON");
        } else {

            System.out.println("The Right NUmber Was: " + randomNumber);
            System.out.println("GAME OVER.....YOu LOSE.....(-^-)");
            System.out.println("created by HARLEY-DAVIDSON");

        }
    }
}
