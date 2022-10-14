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

public class IncorrectUser {
    @Contains("Hello World")
    public String description = "No, not contains.";

    @IsAlpha
    public String name = "Not a name";

    @IsAlphanumeric
    public String postalcode = "Not a postal code";

    @IsBIC
    public String bic = "Not a bic";

    @IsEmail
    public String email = "Not an email";

    @Length(min = 4, max = 16)
    public String username = "Super extra long username, this is invalid";

    @Regex("a.c")
    public String regex = "def";

    @IsNotNull
    public String notnull = null;

    @IsBase32
    public String base32 = "is not base32";

    @IsBase64
    public String base64 = "is not base64";
}
