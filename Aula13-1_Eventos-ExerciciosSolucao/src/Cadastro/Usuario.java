/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro;

import java.io.Serializable;

/**
 *
 * @author Sebastián
 */
public class Usuario implements Serializable{
   private String completeName; 
   private String userName;
   private String password;
   private boolean isSuperUser;
    public Usuario(String completeName, String userName, String password, boolean isSuperUser) {
        this.completeName = completeName;
        this.userName = userName;
        this.password = encode(password);
        this.isSuperUser = isSuperUser;
    }

    private String encode(String password){
        return password + "*";
    }
    
    private String decode(String password){
        return password.substring(0, password.length()-1);
    }
    
    public String getCompleteName() {
        return completeName;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return decode(password);
    }

    public void setPassword(String password) {
        this.password = encode(password);
    }

    public boolean isIsSuperUser() {
        return isSuperUser;
    }

    public void setIsSuperUser(boolean isSuperUser) {
        this.isSuperUser = isSuperUser;
    }
    
    
    
}
