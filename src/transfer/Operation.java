/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transfer;

import java.io.Serializable;

/**
 *
 * @author Lenovo
 */
public enum Operation implements Serializable{
    LOGIN,
    LOGOUT,
    
    SAVE_APPOINTMENT,
    GET_ALL_APPOINTMENTS,
    FIND_APPOINTMENT,
    EDIT_APPOINTMENT,
    DELETE_APPOINTMENT,
    
    SAVE_DOG,
    GET_ALL_DOGS,
    FIND_DOG,
    EDIT_DOG,
    DELETE_DOG,
    
    SAVE_SALON,
    GET_ALL_SALONS,
    FIND_SALON,
    EDIT_SALON,
    DELETE_SALON,
    
    SAVE_PERSON,
    GET_ALL_PERSONS,
    FIND_PERSON,
    EDIT_PERSON,
    DELETE_PERSON
}
