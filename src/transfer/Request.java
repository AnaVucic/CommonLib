package transfer;

import java.io.Serializable;

/**
 *
 * @author Lenovo
 */
public class Request implements Serializable {
    
    private Object argument;
    private Operation operation;
    
    public Request(){
        
    }

    public Request(Operation operation, Object param) {
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
