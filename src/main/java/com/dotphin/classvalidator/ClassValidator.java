package com.dotphin.classvalidator;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import com.dotphin.classvalidator.common.IsNotNull;
import com.dotphin.classvalidator.validators.Validator;
import com.dotphin.classvalidator.validators.ValidatorRegistry;

public class ClassValidator {
    private ClassValidatorOptions settings;

    public ClassValidator(ClassValidatorOptions settings) {
        this.settings = settings;
    }

    public ClassValidator() {
        this(new ClassValidatorOptions());
    }

    public ClassValidatorOptions getSettings() {
        return this.settings;
    }

    public ValidationError validate(Field field, Object instance) {
        try {
            Object value = field.get(instance);

            if (value == null && !this.settings.isSkipMissingProperties()) {
                return new ValidationError(field.getName(), value, IsNotNull.class.getSimpleName());
            }

            for (Annotation annotation : field.getAnnotations()) {
                Validator validator = ValidatorRegistry.getValidatorForClass(annotation.annotationType());

                if (validator != null) {
                    if (!validator.isValid(field, value)) {
                        return new ValidationError(field.getName(), value, validator.getName());
                    }
                }
            }
        } catch (IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }

    public ValidationResult validate(Object instance) {
        ValidationResult result = new ValidationResult();
        Class<?> clazz = instance.getClass();

        for (Field field : clazz.getDeclaredFields()) {
            ValidationError error = this.validate(field, instance);
            if (error != null) {
                result.addError(error);

                if (settings.isStopAtFirstError()) {
                    return result;
                }
            }
        }

        return result;
    }
}
