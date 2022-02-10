
package baraka.shop;

import baraka.shop.models.Client;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Scanner;


public class SignUp implements functions {


    @Override
    public void handleInputs() {
        boolean result = false;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your name:");
            String clientName = input.next();
            System.out.println("Enter your email:");
            String clientEmail = input.next();
            System.out.println("Enter your password:");
            String clientPass = input.next();
            System.out.println("Enter your confirm password:");
            String clientConfirmPass = input.next();
            if (!clientConfirmPass.equals(clientPass)) {
                System.out.println("Your password and confirm password don't equals");
                continue;
            }
            Client c = new Client();
            result = c.insert(new String[]{clientName, clientEmail, clientPass, "0"});
            this.handleFooter(result);
        } while (!result);

    }

    @Override
    public void handleFooter(boolean result) {
        if (result) {
            System.out.println("Successfully added.\n\n");
        } else {
            System.out.println("Failed to add.\n\n");
        }
    }

}
