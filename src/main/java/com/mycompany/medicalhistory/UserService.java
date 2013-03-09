/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.medicalhistory;

/**
 * User service.
 * @author bondarev
 */
public interface UserService {
    /**
     * Create new user.
     * @param user New user.
     * @throws AppException Login exists, login less 3 characters,
     * email is incorrect, name already exists, name is empty, 
     * password less 8 characters.
     */
    void create(User user) throws AppException;
}
