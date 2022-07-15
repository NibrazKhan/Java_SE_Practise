//9. Write a program to sum of user input until users input ‘q’ from keyboard
package conditional_logic_loop_java_basic;

import java.util.Scanner;

public class UserInputLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        char ch;
        do {
            System.out.println("Give integer input");
            sum += sc.nextInt();
            System.out.println("Do you want to continue?\n" +
                    "Press y for continuation \n" +
                    "Press q for exiting");
            ch = sc.next().charAt(0);
        }
        while (ch != 'q');
        System.out.println("The sum is " + sum);
//        System.out.println(alternativeSolution());
    }
    public static int alternativeSolution(){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.println("Give integer input for continuation\n" +
                    "Give \"q\" for exiting");
            //checks whether the input is integer or character...
            if(sc.hasNextInt()){
                int num=sc.nextInt();
                sum+=num;
            }
            else{
                char c=sc.next().charAt(0);
                if(c=='q'){
                    break;
                }

            }
        }
        return sum;
    }
}
