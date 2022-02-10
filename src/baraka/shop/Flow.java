/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baraka.shop;

import java.sql.Connection;

/**
 *
 * @author ALfateh
 */
public class Flow {

  

    public void signUp() {
        SignUp signUp = new SignUp();
        signUp.handleInputs();
    }

    public void startFlow() {
        
        signUp();
    }

}
