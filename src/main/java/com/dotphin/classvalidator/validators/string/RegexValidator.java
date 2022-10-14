package com.dotphin.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.string.Regex;
import com.dotphin.classvalidator.validators.StringValidator;

public class RegexValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return Regex.class;
    }

    public String getRegex(Field field) {
        Regex regex = field.getAnnotation(Regex.class);
        return regex.value();
    }

    @Override
    public boolean isValid(Field field, String value) {
        return value.matches(this.getRegex(field));
    }
}
