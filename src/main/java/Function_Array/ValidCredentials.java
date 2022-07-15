//6. Suppose a software system excepts valid credentials from user to logged in to the system.
// if the user inputs wrong password for 3 times, system will say that "Your user has been temporary locked".
// Let the username: admin, password: adm1n
package Function_Array;

import java.util.Scanner;

public class ValidCredentials {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Username: ");
        String username=sc.nextLine();
        if(username.equals("admin")) {
            String systemMessage = credentialValidation();
            System.out.println(systemMessage);
        }
        else {
            System.out.println("Give valid username first and then you can proceed");
        }

    }
    public static String credentialValidation(){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.println("Password: ");
            String password=sc.nextLine();
            if(password.equals("adm1n")){
                return "Success";
            }
            else {
                System.out.println("You have entered wrong password!\n" +
                        "You have "+(int)(3-i-1) +" attempt left");
            }
        }
        return "Your user has been temporary locked";
    }
}
