package com.dotphin.classvalidator;

import com.dotphin.classvalidator.string.IsBIC;
import com.dotphin.classvalidator.string.IsEmail;
import com.dotphin.classvalidator.string.Length;

public class User {
    @IsEmail
    public String email;

    @Length(min = 4, max = 16)
    public String username;

    public int age;

    @IsBIC
    public String bic;
}
