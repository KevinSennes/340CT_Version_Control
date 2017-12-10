/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author sennesk
 */
class users { //new class showing login details
 
private final String username;
private final String password;
private final String[][] accounts = {{"Kevin", "abc123"},{"Admin", "abc123"}}; // username, password

public users(String user, String pass){
    username = user;
    password = pass;
}

public boolean auth(){ //compares is input was same as pre existing login
    if((username.equals(accounts[0][0])) && (password.equals(accounts[0][1]))){
        return true;
    }else { //if not correct, the program will close.
        System.out.println("User or Password incorrect, program will close");
        System.exit(0);
        return false;
    }
}
}

