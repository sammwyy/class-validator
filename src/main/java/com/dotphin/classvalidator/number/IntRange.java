package com.dotphin.classvalidator.number;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface IntRange {
    public int max() default Integer.MAX_VALUE;

    public int min() default Integer.MIN_VALUE;
}