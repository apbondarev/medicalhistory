/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.medicalhistory;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User
 * @author bondarev
 */
@Entity
@Table(name = "users")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    private String login;
    private String email;
    private String name;
    private String password;

    public User() {  }

    public User(String login, String email, String name, String password) {
        this.login = login;
        this.email = email;
        this.name = name;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
