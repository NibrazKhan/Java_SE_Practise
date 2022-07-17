//6. Replace "R" from Rahim with "F" from the given String:
//Input: Ratul and Rahim lives in Rangpur
//Output: Ratul and Fahim lives in Rangpur
package String_Manipulation;

import java.util.Scanner;

public class ReplacingCharacter {
    public static void main(String[] args) {
        String str = "Ratul and Rahim lives in Rangpur";
        System.out.println(str);
        //Run the alternative solutions by decommenting it.
        naiveSolution(str);
//        alternativeSolutionUsingSubstring(str);
//        alternativeSolutionUsingStringBuilder(str);
    }

    public static void naiveSolution(String str) {
        System.out.println("Output: " + str.replace("Rahim", "Fahim"));
    }

    public static void alternativeSolutionUsingSubstring(String str) {
        int index = str.indexOf("Rahim");
        String output = str.substring(0, index - 1) + " F" + str.substring(index + 1);
        System.out.println("Output: " + output);
    }

    public static void alternativeSolutionUsingStringBuilder(String str) {
        int index = str.indexOf("Rahim");
        char ch = 'F';
        StringBuilder string = new StringBuilder(str);
        string.setCharAt(index, ch);
        System.out.println("Output: " + string.toString());

    }
}
