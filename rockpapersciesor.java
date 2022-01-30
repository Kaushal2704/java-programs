package games;

import java.util.Random;
import java.util.Scanner;

public class rockpapersciesor {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int count=0;
        int game=0;
        while (true) {
            String[] moves = {"r", "p", "s"};
            String opponent = moves[new Random().nextInt(moves.length)];

            String user;

            while (true) {
                System.out.print("please enter your move between r p and s = ");
                user = input.nextLine();
                if (user.equals("r") || user.equals("p") || user.equals("s")) {
                    break;
                } else {
                    System.out.println("invalid input");
                }
            }

            if (opponent.equals(user)) {
                System.out.println("you both choose same move it is draw");
            } else if (opponent.equals("r")) {
                if (user.equals("p")) {
                    System.out.println("you win");
                    count++;
                } else if (user.equals("s")) {
                    System.out.println("you lose");
                }
            } else if (opponent.equals("p")) {
                if (user.equals("r")) {
                    System.out.println("you lose");
                } else if (user.equals("s")) {
                    System.out.println("you win");
                    count++;
                }
            } else if (opponent.equals("s")) {
                if (user.equals("r")) {
                    System.out.println("you win");
                    count++;
                } else if (user.equals("p")) {
                    System.out.println("you lose");
                }
            }
            game++;
            System.out.println("play again( y/n )");
            String playagain=input.nextLine();
            if(!playagain.equals("y")){
                break;
            }
        }
        System.out.println("you win "+count+" games out of "+game+" games");
        input.close();
    }
}
