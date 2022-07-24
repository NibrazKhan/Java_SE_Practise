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
        String str="Core i 7 HP laptop price is 76000 tk and cash payment discount 10%";
        str=str.replaceAll("[^\\d]"," ");
        str=str.trim();
        str=str.replaceAll("\\s+"," ");
        String[]splittingPrice=str.split(" ");
//        System.out.println(str);
        char input=sc.next().charAt(0);
        if(input=='y') {

            int laptopPrice = Integer.parseInt(splittingPrice[1]);
            double discount = Integer.parseInt(splittingPrice[2]) / 100.0;
            double purchasePrice = (laptopPrice - (laptopPrice * discount));
            System.out.println("Purchase Price: " + purchasePrice);
        }
        else{
            System.out.println("Thank you for visiting our site!");
        }
    }
}
