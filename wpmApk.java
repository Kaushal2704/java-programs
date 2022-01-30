package apk;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class wpmApk {
     static String[] words={ "HELLO","how","jug","someone","who","centelope","cakes","sometimes","anyone",
                                    "whoami","center","john","alex"};
    public static void main(String[] args) throws InterruptedException {
    Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);
        for (int i=0;i<20;i++) {
            System.out.print(words[rand.nextInt(words.length)]+" ");
        }
        System.out.println();
        double start = LocalTime.now().toNanoOfDay();
        String wordsType=sc.nextLine();
        double end = LocalTime.now().toNanoOfDay();
        double time=end-start;
        double second = time/1000000000.0;

        int wpm=(int)((((double) wordsType.length()/5 )/second)*60);
        System.out.println("your words per min is " +wpm +" wpm");
    }
}
