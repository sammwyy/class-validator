package com.dotphin.classvalidator;

import com.dotphin.classvalidator.common.IsNotNull;
import com.dotphin.classvalidator.string.Contains;
import com.dotphin.classvalidator.string.IsAlpha;
import com.dotphin.classvalidator.string.IsAlphanumeric;
import com.dotphin.classvalidator.string.IsBIC;
import com.dotphin.classvalidator.string.IsBTCAddress;
import com.dotphin.classvalidator.string.IsBase32;
import com.dotphin.classvalidator.string.IsBase64;
import com.dotphin.classvalidator.string.IsCreditCard;
import com.dotphin.classvalidator.string.IsDataURI;
import com.dotphin.classvalidator.string.IsDateString;
import com.dotphin.classvalidator.string.IsEmail;
import com.dotphin.classvalidator.string.IsEthereumAddress;
import com.dotphin.classvalidator.string.IsFQDN;
import com.dotphin.classvalidator.string.IsHSL;
import com.dotphin.classvalidator.string.IsHex;
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

    @Length(min = 4, max = 16)
    public String username = "Super extra long username, this is invalid";

    @Regex("a.c")
    public String regex = "def";

    @IsNotNull
    public String notnull = null;

    @IsBase32
    public String base32 = "Not base32";

    @IsBase64
    public String base64 = "Not base64";

    @IsBTCAddress
    public String btcAddress = "Not a btc address";

    @IsCreditCard
    public String creditCard = "Not a credit card";

    @IsDataURI
    public String dataURI = "Not a data uri";

    @IsDateString
    public String dateString = "Not a date string";

    @IsEmail
    public String email = "Not an email";

    @IsEthereumAddress
    public String ethereumAddress = "Not an Ethereum address";

    @IsFQDN
    public String fqdn = "Not a valid FQDN";

    @IsHex
    public String hex = "Not a valid Hex";

    @IsHSL
    public String hsl = "Not a valid HSL";
}
