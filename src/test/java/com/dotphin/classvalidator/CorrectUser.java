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
import com.dotphin.classvalidator.string.IsRegex;

public class CorrectUser {
    @Contains("Hello World")
    public String description = "Uhm, This is a Hello World.";

    @IsAlpha
    public String name = "Valentina";

    @IsAlphanumeric
    public String postalcode = "ABCD1234";

    @IsBIC
    public String bic = "BFRPARBA";

    @IsNotNull
    public String notnull = "is not null";

    @IsBase32
    public String base32 = "ORSXG5A=";

    @IsBase64
    public String base64 = "ZXN0YSBlcyB1bmEgcHJ1ZWJh";

    @IsBTCAddress
    public String btcAddress = "16AVL22aTtzHZrsPBQtMZN6BrW7T2mvZqB";

    @IsCreditCard
    public String creditCard = "4222222222222";

    @IsDataURI
    public String dataURI = "data:image/jpeg;base64,UEsDBBQAAAAI";

    @IsDateString
    public String dateString = "23-11-2001 22:00:00:000";

    @IsEmail
    public String email = "sammwy@example.com";

    @IsEthereumAddress
    public String ethereumAddress = "0x8ba57063ce41d0e7e2de18bd02a389b7da945e63";

    @IsFQDN
    public String fqdn = "www.sammwy.com";

    @IsHex
    public String hex = "abcdef0123456789";

    @IsHexColor
    public String hexColor = "#ff0000";

    @IsHSL
    public String hsl = "hsl(240, 100%, 50%)";

    @IsIP
    public String ip = "192.168.0.1";

    @IsLength(min = 4, max = 16)
    public String username = "sammwy";

    @IsLocale
    public String locale = "es_AR";

    @IsLowerCase
    public String lowercase = "lower case";

    @IsMacAddress
    public String macAddress = "00:00:5e:00:53:af";

    @IsRegex("a.c")
    public String regex = "abc";
}
