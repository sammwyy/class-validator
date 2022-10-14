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
import com.dotphin.classvalidator.string.IsHexColor;
import com.dotphin.classvalidator.string.IsIP;
import com.dotphin.classvalidator.string.IsLength;
import com.dotphin.classvalidator.string.IsLocale;
import com.dotphin.classvalidator.string.IsLowerCase;
import com.dotphin.classvalidator.string.IsMacAddress;
import com.dotphin.classvalidator.string.IsMagnetURI;
import com.dotphin.classvalidator.string.IsMobilePhone;
import com.dotphin.classvalidator.string.IsRegex;

public class IncorrectUser {
    @Contains("Hello World")
    public String description = "No, not contains.";

    @IsAlpha
    public String name = "Not a name";

    @IsAlphanumeric
    public String postalcode = "Not a postal code";

    @IsBIC
    public String bic = "Not a bic";

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

    @IsHexColor
    public String hexColor = "Not a valid Hex color";

    @IsHSL
    public String hsl = "Not a valid HSL";

    @IsIP
    public String ip = "Not a valid IP";

    @IsLength(min = 4, max = 16)
    public String username = "Super extra long username, this is invalid";

    @IsLocale
    public String locale = "Not a valid Locale";

    @IsLowerCase
    public String lowercase = "Not Lower Case";

    @IsMacAddress
    public String macAddress = "Not a MAC address";

    @IsMagnetURI
    public String magnetURI = "Not a Magnet URI";

    @IsMobilePhone
    public String mobilePhone = "Not a valid mobile phone";

    @IsRegex("a.c")
    public String regex = "def";
}
