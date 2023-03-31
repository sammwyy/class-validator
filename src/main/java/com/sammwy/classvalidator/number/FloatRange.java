package com.sammwy.classvalidator.number;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface FloatRange {
    public float max() default Float.MAX_VALUE;

    public float min() default Float.MIN_VALUE;
}