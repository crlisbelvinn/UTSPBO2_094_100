/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_pbo_094_100;

/**
 *
 * @author xpopow
 */
public class Login {
    private String username;
    private String password;
    private String[][] accounts = { {"admin", "admin"}};

    public Login(String username, String password) 
    {
        this.username = username;
        this.password = password;
    }

    public boolean checkPassword()
    {

        if((username.equals(accounts[0][0])) && (password.equals(accounts[0][1])))
            return true;
        else
            return false;
    }

}
