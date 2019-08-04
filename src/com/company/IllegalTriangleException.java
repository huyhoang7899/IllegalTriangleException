package com.company;

public class IllegalTriangleException extends Exception {
    String errorMessage;
    public IllegalTriangleException(String inErrorMessage){
        super();
        this.errorMessage = inErrorMessage;
    }
    public String getString(){
        return this.errorMessage;
    }
}
