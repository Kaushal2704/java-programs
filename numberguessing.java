package games;

import java.util.Random;
import java.util.Scanner;

public class numberguessing {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Random randomnumber=new Random();

        int Ognumber=randomnumber.nextInt(100);
        int number;
        int count=0;
        while (true){
            System.out.println("guess the number");
            number=input.nextInt();
            if (number==Ognumber){
                System.out.println("you guess the correct number ,you won");
                break;
            }
            else if(number>Ognumber){
                System.out.println("your number is greater then the orignal number ");
            }
            else {
                System.out.println("your number is lower then the orignal  number");
            }
            count++;

        }
        System.out.println("you guessed the correct number in "+ count + " guesses");

    }
}
