package com.dotphin.classvalidator;

import com.dotphin.classvalidator.annotations.IsEmail;
import com.dotphin.classvalidator.annotations.Length;

public class User {
    @IsEmail
    public String email;

    @Length(min = 4, max = 16)
    public String username;

    public int age;
}
