//3. Core i 7 HP laptop price is 76000 tk and cash payment discount 10%.
// What will be the purchase price?
package String_Manipulation;

import java.util.Scanner;

public class laptopPurchasePrice {
    public static void main(String[] args) {
        System.out.println("Buy i7 HP laptop with 10% discount!\n" +
                "Press y for purchase\n" +
                "n for not purchasing");
        Scanner sc=new Scanner(System.in);
        char input=sc.next().charAt(0);
        if(input=='y') {

            int laptopPrice = 76000;
            double discount = 10.0 / 100.0;
            double purchasePrice = (laptopPrice - (laptopPrice * discount));
            System.out.println("Purchase Price: " + purchasePrice);
        }
        else{
            System.out.println("Thank you for visiting our site!");
        }
    }
}
