package com.sammwy.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.sammwy.classvalidator.string.IsInStringArray;
import com.sammwy.classvalidator.utils.ArrayUtils;
import com.sammwy.classvalidator.validators.StringValidator;

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
