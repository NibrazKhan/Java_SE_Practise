//2. Price of a formal shirt is 1200 tk and Sharee is 3500 tk.
// If you buy 2 shirt and 1 sharee, then 400 tk will be discounted. After your purchase what will be your total cost?
package String_Manipulation;

import java.util.Scanner;

public class ShirtShareePurchaseCost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Get discout for buying 2 shirts and 1 sharee");
        System.out.println("How many shirts do you want to buy?");
        int shirt=sc.nextInt();
        System.out.println("How many sharees do you want to buy?");
        int sharee=sc.nextInt();
        int shirtPrice=1200;
        int shareePrice=3500;
        int originalCost=(shirt*shirtPrice)+(sharee*shareePrice);
        if(shirt==2 && sharee==1){
            int discount=400;
            int totalCost=originalCost-discount;
            System.out.println("Total Cost: "+totalCost);
        }
        else{
            int totalCost=originalCost;
            System.out.println("Total Cost: "+totalCost);
        }

    }
}