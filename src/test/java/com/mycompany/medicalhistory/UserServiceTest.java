/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.medicalhistory;

import org.junit.Test;

public class UserServiceTest {
    private UserService userService = new UserServiceImpl();
    
    /**
     * Create new user. Normal case.
     */
    @Test
    public void testCreate() {
        User user = new User("lgn", "login@example.com", "Login Name", 
                "12345678");
        userService.create(user);
    }
    
    /**
     * Create new user. Login less 3 characters
     */
    @Test(expected = AppException.class)
    public void testCreateLoginLess3Chars() {
        User user = new User("lg", "login@example.com", "Login Name", 
                "12345678");
        userService.create(user);
    }
    
    /**
     * Create new user. Email incorrect.
     */
    @Test(expected = AppException.class)
    public void testCreateEmailIncorrect() {
        User user = new User("login", "login(at)example.com", "Login Name", 
                "12345678");
        userService.create(user);
    }
    
    /**
     * Create new user. Name is empty.
     */
    @Test(expected = AppException.class)
    public void testCreateNameEmpty() {
        User user = new User("login", "login@example.com", null, 
                "12345678");
        userService.create(user);
    }
    
    /**
     * Create new user. Password less 8 characters.
     */
    @Test(expected = AppException.class)
    public void testCreatePasswordLess8Chars() {
        User user = new User("login", "login@example.com", "Login Name", 
                "123456");
        userService.create(user);
    }
}