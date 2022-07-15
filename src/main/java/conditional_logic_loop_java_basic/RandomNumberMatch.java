//8. Write a program to generate 2 random numbers which will not be shown to the user.
// Take a user input and match it with any of the random numbers.
// If correct give it 1 point and if incorrect, do not give it any point. Finally, repeat this for 10 times and count the point user achieved.
package conditional_logic_loop_java_basic;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberMatch {
    public static void main(String[] args) {
        Random random=new Random();
        int limit=50;
        //generating random number from 1-50
        int firstRandom=random.nextInt(limit);
//        System.out.println("first random number"+firstRandom);
        int secondRandom=random.nextInt(limit);
//        System.out.println("second random number"+secondRandom);
        int points=0;
        int i=1;
        Scanner sc=new Scanner(System.in);
        //prompting user to guess to guess the number 10 times
        while(i<=10) {
            System.out.println("Guess the number between 1-50!");
            int number=sc.nextInt();
            if(number==firstRandom || number==secondRandom){
                points+=1;
            }
            i+=1;
        }
        System.out.println("Your score is "+points);
    }
}
