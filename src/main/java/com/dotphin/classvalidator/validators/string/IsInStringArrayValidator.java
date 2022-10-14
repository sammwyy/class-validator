package com.dotphin.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.string.IsInStringArray;
import com.dotphin.classvalidator.utils.ArrayUtils;
import com.dotphin.classvalidator.validators.StringValidator;

public class IsInStringArrayValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsInStringArray.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        IsInStringArray isIn = field.getAnnotation(IsInStringArray.class);
        return ArrayUtils.arrayContains(isIn.value(), value);
    }
}
