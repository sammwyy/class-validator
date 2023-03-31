package com.sammwy.classvalidator;

import java.util.ArrayList;
import java.util.List;

public class ValidationResult {
    private List<ValidationError> errors;

    public ValidationResult() {
        this.errors = new ArrayList<>();
    }

    public void addError(ValidationError error) {
        this.errors.add(error);
    }

    public ValidationError getError(int index) {
        return this.errors.get(index);
    }

    public List<ValidationError> getErrorList() {
        return this.errors;
    }

    public ValidationError getFirstError() {
        return this.getError(0);
    }

    public boolean isValid() {
        return this.errors.size() == 0;
    }
}
