package com.dotphin.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.string.Contains;
import com.dotphin.classvalidator.validators.Validator;

public class ContainsValidator implements Validator {
    @Override
    public Class<?> getAnnotation() {
        return Contains.class;
    }

    @Override
    public boolean isValid(Field field, Object value) {
        Contains annotation = field.getAnnotation(Contains.class);

        if (value != null && value instanceof String) {
            String str = (String) value;
            return str.contains(annotation.value());
        }

        return true;
    }
}
