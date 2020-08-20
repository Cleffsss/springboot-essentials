package br.com.devdojo.error;

import br.com.devdojo.model.Student;

public class CustomErrorType {
    private String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public CustomErrorType(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
