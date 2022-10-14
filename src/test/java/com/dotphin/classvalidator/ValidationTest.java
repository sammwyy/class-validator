package com.dotphin.classvalidator;

import org.junit.Assert;
import org.junit.Test;

public class ValidationTest {
    @Test
    public void validationTest() {
        ClassValidator validator = new ClassValidator();

        User user = new User();
        user.username = "Sammwy";
        user.email = "sammwy@example.com";
        user.age = 20;

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
}
