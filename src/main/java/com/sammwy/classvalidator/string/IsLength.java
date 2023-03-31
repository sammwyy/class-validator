package com.sammwy.classvalidator.string;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface IsLength {
    int min() default Integer.MIN_VALUE;

    int max() default Integer.MAX_VALUE;
}