package com.sammwy.classvalidator;

import com.sammwy.classvalidator.array.ArrayContainsString;
import com.sammwy.classvalidator.array.ArrayNotContainsString;
import com.sammwy.classvalidator.array.IsArrayLength;
import com.sammwy.classvalidator.common.IsNotNull;
import com.sammwy.classvalidator.number.DoubleRange;
import com.sammwy.classvalidator.number.FloatRange;
import com.sammwy.classvalidator.number.IntRange;
import com.sammwy.classvalidator.number.IsDivisibleBy;
import com.sammwy.classvalidator.number.IsNegative;
import com.sammwy.classvalidator.number.IsPositive;
import com.sammwy.classvalidator.number.LongRange;
import com.sammwy.classvalidator.string.Contains;
import com.sammwy.classvalidator.string.Equals;
import com.sammwy.classvalidator.string.EqualsIgnoreCase;
import com.sammwy.classvalidator.string.IsAlpha;
import com.sammwy.classvalidator.string.IsAlphanumeric;
import com.sammwy.classvalidator.string.IsBIC;
import com.sammwy.classvalidator.string.IsBTCAddress;
import com.sammwy.classvalidator.string.IsBase32;
import com.sammwy.classvalidator.string.IsBase64;
import com.sammwy.classvalidator.string.IsCreditCard;
import com.sammwy.classvalidator.string.IsDataURI;
import com.sammwy.classvalidator.string.IsDateString;
import com.sammwy.classvalidator.string.IsEmail;
import com.sammwy.classvalidator.string.IsEthereumAddress;
import com.sammwy.classvalidator.string.IsFQDN;
import com.sammwy.classvalidator.string.IsHSL;
import com.sammwy.classvalidator.string.IsHex;
import com.sammwy.classvalidator.string.IsHexColor;
import com.sammwy.classvalidator.string.IsIP;
import com.sammwy.classvalidator.string.IsInStringArray;
import com.sammwy.classvalidator.string.IsLength;
import com.sammwy.classvalidator.string.IsLocale;
import com.sammwy.classvalidator.string.IsLowerCase;
import com.sammwy.classvalidator.string.IsMacAddress;
import com.sammwy.classvalidator.string.IsMagnetURI;
import com.sammwy.classvalidator.string.IsMobilePhone;
import com.sammwy.classvalidator.string.IsMongoID;
import com.sammwy.classvalidator.string.IsNotEmpty;
import com.sammwy.classvalidator.string.IsNumeric;
import com.sammwy.classvalidator.string.IsPort;
import com.sammwy.classvalidator.string.IsRGB;
import com.sammwy.classvalidator.string.IsRegex;
import com.sammwy.classvalidator.string.IsSemVer;
import com.sammwy.classvalidator.string.IsURL;
import com.sammwy.classvalidator.string.IsUUID;
import com.sammwy.classvalidator.string.IsUpperCase;
import com.sammwy.classvalidator.string.NotContains;

public class CorrectUser {
    // Array
    @ArrayContainsString("foo")
    public String[] arrayContainsString = new String[] { "foo", "bar" };

    // Array
    @ArrayNotContainsString("not")
    public String[] arrayNotContainsString = new String[] { "valid", "array" };

    @IsArrayLength(min = 2, max = 5)
    public String[] isArrayLength = new String[] { "a", "valid", "array", "length" };

    // Number
    @IsDivisibleBy(5)
    public int age = 20;

    @IsNegative
    public int negative = -1;

    @IsPositive
    public int positive = 1;

    @DoubleRange(min = 0.000000001, max = 0.000000002)
    public double doubleRange = 0.0000000015;

    @FloatRange(min = 1000000000.001f, max = 1000000000.002f)
    public float floatRange = 1000000000.0015f;

    @IntRange(min = 1, max = 3)
    public int intRange = 2;

    @LongRange(min = 999999999999999999L, max = 1000000000000000001L)
    public long longRange = 1000000000000000000L;

    // String
    @Contains("Hello World")
    public String contains = "Uhm, This is a Hello World.";

    @Equals("equals")
    public String equals = "equals";

    @EqualsIgnoreCase("EqUaLs IgNoRe CaSe")
    public String equalsIgnoreCase = "equals ignore case";

    @IsAlpha
    public String alpha = "Valentina";

    @IsAlphanumeric
    public String alphanumeric = "ABCD1234";

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

    @IsInStringArray({ "red", "blue", "green", "yellow" })
    public String isInStringArray = "red";

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

    @IsMagnetURI
    public String magnetURI = "magnet:?xt=urn:3216546465987dfgs9798";

    @IsMobilePhone
    public String mobilePhone = "+541122334455";

    @IsMongoID
    public String mongoID = "551137c2f9e1fac808a5f572";

    @IsNotEmpty
    public String notEmpty = "Not empty";

    @IsNumeric
    public String numeric = "1234567890";

    @IsPort
    public String port = "8080";

    @IsRegex("a.c")
    public String regex = "abc";

    @IsRGB
    public String rgb = "rgb(255, 0, 0)";

    @IsSemVer
    public String semver = "1.0.0-SNAPSHOT";

    @IsUpperCase
    public String uppercase = "UPPER CASE";

    @IsURL
    public String url = "https://sammwy.com/projects?test=1";

    @IsUUID
    public String uuid = "01234567-9ABC-DEF0-1234-56789ABCDEF0";

    @NotContains("not contains")
    public String notcontains = "A valid value";
}
