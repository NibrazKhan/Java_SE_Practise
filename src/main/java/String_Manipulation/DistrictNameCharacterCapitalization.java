//4. Writea program that will give following output:
//Input: chattogram
//Output: C8M
package String_Manipulation;

import java.util.Scanner;

public class DistrictNameCharacterCapitalization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give the input as String: ");
        String str=sc.next();
        String firstChar=String.valueOf(str.charAt(0)).toUpperCase();
        int inBetweenCharsLength=str.length()-2;
        String lastChar=String.valueOf(str.charAt(str.length()-1)).toUpperCase();
        String output=firstChar+inBetweenCharsLength+lastChar;
        System.out.println("Output: "+output);
    }
}
