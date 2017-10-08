package com.learnshare.restapi.util;


public class RESTAPIError {

    private String errorMessage;

    public RESTAPIError(String errorMessage){
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}
