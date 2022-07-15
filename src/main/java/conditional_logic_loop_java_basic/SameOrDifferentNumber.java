//3. Input 2 decimal numbers and check if they are both same or different up to two decimal places.
// E.g 120.546 & 120.241
package conditional_logic_loop_java_basic;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SameOrDifferentNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give first number:");
        double num1=sc.nextDouble();
        System.out.println("Give second number:");
        double num2=sc.nextDouble();
        //Alternative method to compare numbers up to two decimal place
        // by not rounding it
        comparingNumbers(num1,num2);
//        comparing numbers by rounding it to two decimal places
//        if((String.format("%.2f",num1)).equals(String.format("%.2f",num2))){
//            System.out.println("The inputted numbers are same");
//        }
//        else{
//            System.out.println("The inputted numbers are different");
//        }
    }
    public static void comparingNumbers(double num1,double num2){
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);
        String number1 = df.format(num1);
        String number2=df.format(num2);
        if(number1.equals(number2)){
            System.out.println("The inputted numbers are same");
        }
        else{
            System.out.println("The inputted numbers are different");
        }

    }
}
