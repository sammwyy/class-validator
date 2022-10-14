package com.dotphin.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.string.IsMobilePhone;
import com.dotphin.classvalidator.utils.StringUtils;
import com.dotphin.classvalidator.validators.StringValidator;

public class IsMobilePhoneValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsMobilePhone.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        return StringUtils.IsMobilePhone(value);
    }
}
