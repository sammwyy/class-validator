package com.sammwy.classvalidator;

public class ClassValidatorOptions {
    private boolean skipMissingProperties = false;
    private boolean stopAtFirstError = false;

    public boolean isSkipMissingProperties() {
        return this.skipMissingProperties;
    }

    public boolean isStopAtFirstError() {
        return this.stopAtFirstError;
    }

    public ClassValidatorOptions setSkipMissingProperties(boolean result) {
        this.skipMissingProperties = result;
        return this;
    }

    public ClassValidatorOptions setStopAtFirstError(boolean result) {
        this.stopAtFirstError = result;
        return this;
    }
}
