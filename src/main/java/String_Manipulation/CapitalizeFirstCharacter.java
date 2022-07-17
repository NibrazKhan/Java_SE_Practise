//8. Write a program to convert each 1st char to uppercase from a string
//Input: rahim lives in sylhet
//Output: Rahim Lives in Sylhet
package String_Manipulation;

import java.util.Arrays;
import java.util.Scanner;

public class CapitalizeFirstCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give input: ");
        String str=sc.nextLine();
        //splitting the string as words
        String []words=str.split(" ");
        for(int i=0;i< words.length;i++){
            //converting first letter of each word to uppercase.
            String firstLetter=String.valueOf(words[i].charAt(0)).toUpperCase();
            words[i]=firstLetter+words[i].substring(1);
        }
//        System.out.println(Arrays.toString(words));
        //joining the whole string from the array of words by space.
        String output=String.join(" ",words);
        System.out.println("Output: "+output);

    }
}
