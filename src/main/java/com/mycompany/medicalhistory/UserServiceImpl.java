/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.medicalhistory;

import java.util.regex.Pattern;

/**
 * User business logic.
 * @author bondarev
 */
public class UserServiceImpl implements UserService {

    private static final Pattern EMAIL_PATTERN = Pattern
            .compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}$",
            Pattern.CASE_INSENSITIVE);
    private static final int LOGIN_MIN_LENGTH = 3;
    private static final int PASSWORD_MIN_LENGTH = 8;

    @Override
    public void create(User user) {
        // TODO Login already exists

        // Login less 3 characters
        if (user.getLogin() == null 
                || user.getLogin().length() < LOGIN_MIN_LENGTH) {
            throw new AppException("Login less 3 characters.");
        }

        // Email incorrect
        if (user.getEmail() == null || !EMAIL_PATTERN.matcher(user.getEmail())
                .matches()) {
            throw new AppException("Email incorrect.");
        }

        // TODO Name already exists

        // Name is empty
        if (user.getName() == null || user.getName().length() == 0) {
            throw new AppException("Name is empty.");
        }

        // Password less 8 characters
        if (user.getPassword() == null 
                || user.getPassword().length() < PASSWORD_MIN_LENGTH) {
            throw new AppException("Password less 8 characters.");
        }
    }

}
