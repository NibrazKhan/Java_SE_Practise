//2. Input an amount from the user and find out the number of notes from input amount in given array
package Function_Array;

import java.util.Scanner;

public class NumberOfNotes {
    public static void main(String[] args) {
        int []array={1000,500,100,50,20,10,5,2};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount of money: ");
        int amount=sc.nextInt();
        //the minimum amount can be 2 as the minumum note amount is 2 so should be greater than 1.
        if(amount>1) {
            notesRequired(array, amount);
        }
        else{
            System.out.println("Invalid amount entered! Give valid amount");
        }
    }
    public static void notesRequired(int []array,int amount){
        int count=0;
        for (int notes:
                array) {
            if(notes<=amount){
                while(notes<=amount){
                    amount-=notes;
                    count+=1;
                }
                //checking whether there is amount left as 1 or not
                //if amount==1 the note will be discarded as there will be residual amount
                if(amount==1){
                    amount+=notes*count;
                    count=0;
                    continue;
                }
                else {
                    System.out.println(notes + " " + count);
                    count = 0;
                }
            }

        }
    }
}
