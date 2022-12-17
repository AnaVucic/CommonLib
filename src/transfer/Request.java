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
public class Request implements Serializable{
    
    private Object argument;
    private Operation operation;
    
    public Request(){
        
    }

    public Request(Object param, Operation operation, Long id) {
        this.argument = param;
        this.operation = operation;
    }

    public Object getParam() {
        return argument;
    }

    public void setParam(Object param) {
        this.argument = param;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
    
}
