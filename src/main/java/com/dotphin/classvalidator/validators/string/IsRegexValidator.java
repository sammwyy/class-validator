package com.dotphin.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.string.IsRegex;
import com.dotphin.classvalidator.validators.StringValidator;

public class IsRegexValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsRegex.class;
    }

    public String getRegex(Field field) {
        IsRegex regex = field.getAnnotation(IsRegex.class);
        return regex.value();
    }

    @Override
    public boolean isValid(Field field, String value) {
        return value.matches(this.getRegex(field));
    }
}
