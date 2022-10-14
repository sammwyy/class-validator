package com.dotphin.classvalidator.validators;

import java.util.HashMap;
import java.util.Map;

import com.dotphin.classvalidator.validators.common.IsNotNullValidator;
import com.dotphin.classvalidator.validators.string.ContainsValidator;
import com.dotphin.classvalidator.validators.string.IsAlphaValidator;
import com.dotphin.classvalidator.validators.string.IsAlphanumericValidator;
import com.dotphin.classvalidator.validators.string.IsEmailValidator;
import com.dotphin.classvalidator.validators.string.LengthValidator;
import com.dotphin.classvalidator.validators.string.RegexValidator;

public class ValidatorRegistry {
    private static Map<Class<?>, Validator> validators = new HashMap<>();

    static {
        // Common
        register(new IsNotNullValidator());

        // String
        register(new ContainsValidator());
        register(new IsAlphaValidator());
        register(new IsAlphanumericValidator());
        register(new IsEmailValidator());
        register(new LengthValidator());
        register(new RegexValidator());
    }

    public static void register(Validator validator) {
        validators.put(validator.getAnnotation(), validator);
    }

    public static Validator getValidatorForClass(Class<?> annotation) {
        return validators.get(annotation);
    }
}
