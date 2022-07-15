//Write  a program to find the factorial of a given number
package conditional_logic_loop_java_basic;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println("The facorial for "+num+" is: "+fact);
//        //Alternative solution in recursive approach
//        fact=recusrsiveApproach(num);
//        System.out.println("The facorial for "+num+" is: "+fact);
    }
    public static int recusrsiveApproach(int num){
        if(num==0){
            return 1;
        }
        else{
            return(num*recusrsiveApproach(num-1));
        }
    }
}
