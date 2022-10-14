package com.dotphin.classvalidator.validators;

import java.util.HashMap;
import java.util.Map;

import com.dotphin.classvalidator.validators.impl.IsEmailValidator;
import com.dotphin.classvalidator.validators.impl.IsNotNullValidator;
import com.dotphin.classvalidator.validators.impl.LengthValidator;

public class ValidatorRegistry {
    private static Map<Class<?>, Validator> validators = new HashMap<>();

    static {
        register(new IsEmailValidator());
        register(new IsNotNullValidator());
        register(new LengthValidator());
    }

    public static void register(Validator validator) {
        validators.put(validator.getAnnotation(), validator);
    }

    public static Validator getValidatorForClass(Class<?> annotation) {
        return validators.get(annotation);
    }
}
