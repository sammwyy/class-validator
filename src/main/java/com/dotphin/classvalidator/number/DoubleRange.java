package com.dotphin.classvalidator.number;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface DoubleRange {
    public double max() default Double.MAX_VALUE;

    public double min() default Double.MIN_VALUE;
}