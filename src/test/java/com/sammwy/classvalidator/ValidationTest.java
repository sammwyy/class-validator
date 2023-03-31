package com.sammwy.classvalidator;

import org.junit.Assert;
import org.junit.Test;

import com.sammwy.classvalidator.validators.ValidatorRegistry;

public class ValidationTest {
    @Test
    public void correctUserValidation() {
        ClassValidator validator = new ClassValidator();

        CorrectUser user = new CorrectUser();
        ValidationResult result = validator.validate(user);

        if (result.isValid()) {
            Assert.assertTrue(true);
        } else {
            for (ValidationError error : result.getErrorList()) {
                System.err.println("ValidationError: " + error.getMessage());
            }
            Assert.assertTrue(false);
        }
    }

    @Test
    public void incorrectUserValidation() {
        ClassValidator validator = new ClassValidator();

        IncorrectUser user = new IncorrectUser();
        ValidationResult result = validator.validate(user);

        int errorCount = result.getErrorList().size();
        int validators = ValidatorRegistry.getValidators().size();
        Assert.assertEquals(errorCount, validators);
    }
}
