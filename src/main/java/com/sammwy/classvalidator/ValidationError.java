package com.sammwy.classvalidator;

public class ValidationError {
    private String fieldName;
    private Object fieldValue;
    private String validatorName;

    public ValidationError(String fieldName, Object fieldValue, String validatorName) {
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
        this.validatorName = validatorName;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public Object getFieldValue() {
        return this.fieldValue;
    }

    public String getValidatorName() {
        return this.validatorName;
    }

    public String getMessage() {
        return "Field " + fieldName + " failed " + validatorName + " validator with value " + fieldValue + ". ";
    }

    public Exception toException() {
        return new Exception(this.getMessage());
    }
}
