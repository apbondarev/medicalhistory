/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.medicalhistory;

/**
 * An exception in the medical history application.
 * @author bondarev
 */
public class AppException extends RuntimeException {

    /**
     * Constructs an instance of
     * <code>AppException</code> with the specified detail message.
     *
     * @param msg the detail message.
     */
    public AppException(String msg) {
        super(msg);
    }
}
