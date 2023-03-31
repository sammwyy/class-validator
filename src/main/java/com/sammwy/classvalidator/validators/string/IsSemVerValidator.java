package com.sammwy.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.sammwy.classvalidator.string.IsSemVer;
import com.sammwy.classvalidator.utils.StringUtils;
import com.sammwy.classvalidator.validators.StringValidator;

public class IsSemVerValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsSemVer.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        return StringUtils.isSemVer(value);
    }
}
