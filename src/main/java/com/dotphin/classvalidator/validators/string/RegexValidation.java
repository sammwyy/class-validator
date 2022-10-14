package com.dotphin.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.string.Regex;
import com.dotphin.classvalidator.validators.Validator;

public class RegexValidation implements Validator {
    @Override
    public Class<?> getAnnotation() {
        return Regex.class;
    }

    public String getRegex(Field field) {
        Regex regex = field.getAnnotation(Regex.class);
        return regex.value();
    }

    @Override
    public boolean isValid(Field field, Object value) {
        if (value != null && value instanceof String) {
            String str = (String) value;
            return str.matches(this.getRegex(field));
        }

        return true;
    }
}
