/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baraka.shop.models;

import baraka.shop.DbConnection;
import baraka.shop.Storage;

/**
 *
 * @author ALfateh
 */
public class Client extends Storage {


    public Client() {
        super(DbConnection.connect(), "clients" , new String []{"client_name", "email", "password", "is_admin"});
    }

}
