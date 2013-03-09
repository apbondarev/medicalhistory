/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.medicalhistory;

import java.util.regex.Pattern;

/**
 *
 * @author bondarev
 */
public class UserServiceImpl implements UserService {
    
    private static final Pattern emailPattern = Pattern
            .compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}$", 
            Pattern.CASE_INSENSITIVE);

    @Override
    public void create(User user) throws AppException {
        // TODO Login already exists
        
        // Login less 3 characters
        if (user.getLogin() == null || user.getLogin().length() < 3) {
            throw new AppException("Login less 3 characters.");
        }
        
        // Email incorrect
        if (user.getEmail() == null || !emailPattern.matcher(user.getEmail())
                .matches()) {
            throw new AppException("Email incorrect.");
        }
        
        // TODO Name already exists
        
        // Name is empty
        if (user.getName() == null || user.getName().length() == 0) {
            throw new AppException("Name is empty.");
        }
        
        // Password less 8 characters
        if (user.getPassword() == null || user.getPassword().length() < 8) {
            throw new AppException("Password less 8 characters.");
        }
    }
    
}
