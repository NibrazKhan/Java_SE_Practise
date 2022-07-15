//1. Take input from a user and check if the number exists in the array
package Function_Array;

import java.util.Scanner;

public class NumberExistsOrNot {
    public static void main(String[] args) {
        int array []={1,3,5,7,2,4,6,8};
        Scanner sc=new Scanner(System.in);
        //taking element to be checked as input.
        System.out.println("Which number do you want to check? ");
        int element=sc.nextInt();
        int index=elementPresentOrnot(array,element);
        //if the element is found desired index will be returned
        //else -1 will be returned
        if(index!=-1)
            System.out.println("Found in the position "+index);
        else
            System.out.println("Found no element");
    }
    public static int elementPresentOrnot(int[]array,int elem){
        for(int i=0;i<array.length;i++){
            if(array[i]==elem){
                return i;
            }
        }
        return -1;
    }
}
