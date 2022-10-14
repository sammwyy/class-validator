package com.dotphin.classvalidator;

import com.dotphin.classvalidator.common.IsNotNull;
import com.dotphin.classvalidator.string.Contains;
import com.dotphin.classvalidator.string.IsAlpha;
import com.dotphin.classvalidator.string.IsAlphanumeric;
import com.dotphin.classvalidator.string.IsBIC;
import com.dotphin.classvalidator.string.IsBase32;
import com.dotphin.classvalidator.string.IsBase64;
import com.dotphin.classvalidator.string.IsEmail;
import com.dotphin.classvalidator.string.Length;
import com.dotphin.classvalidator.string.Regex;

public class CorrectUser {
    @Contains("Hello World")
    public String description = "Uhm, This is a Hello World.";

    @IsAlpha
    public String name = "Valentina";

    @IsAlphanumeric
    public String postalcode = "ABCD1234";

    @IsBIC
    public String bic = "BFRPARBA";

    @IsEmail
    public String email = "sammwy@example.com";

    @Length(min = 4, max = 16)
    public String username = "sammwy";

    @Regex("a.c")
    public String regex = "abc";

    @IsNotNull
    public String notnull = "is not null";

    @IsBase32
    public String base32 = "ORSXG5A=";

    @IsBase64
    public String base64 = "ZXN0YSBlcyB1bmEgcHJ1ZWJh";
}
