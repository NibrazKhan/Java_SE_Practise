//5. Write a program that will count how many vowels in the given string:
//"roadtosdet"
//Output: 4
package String_Manipulation;

import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give input: ");
        String str = sc.next().toLowerCase();
        char[] arr = str.toCharArray();
        int count = 0;
        for (char c :
                arr) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count += 1;
            }
        }
        System.out.println("Number of vowels: " + count);
    }
}
