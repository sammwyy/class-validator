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

public class IncorrectUser {
    // Array
    @ArrayContainsString("foo")
    public String[] arrayContainsString = new String[] { "invalid", "array" };

    // Array
    @ArrayNotContainsString("not")
    public String[] arrayNotContainsString = new String[] { "not", "valid", "array" };

    @IsArrayLength(min = 2, max = 5)
    public String[] isArrayLength = new String[] { "invalid" };

    // Number
    @IsDivisibleBy(5)
    public int age = 123;

    @IsNegative
    public int negative = 1;

    @IsPositive
    public int positive = -1;

    @DoubleRange(min = 0.000000001, max = 0.000000002)
    public double doubleRange = 0.000000003;

    @FloatRange(min = 10000.001f, max = 10000.002f)
    public float floatRange = 10000.003f;

    @IntRange(min = 1, max = 3)
    public int intRange = 4;

    @LongRange(min = 999999999999999999L, max = 1000000000000000001L)
    public long longRange = 1000000000000000002L;

    // String
    @Contains("Hello World")
    public String contains = "No, not contains.";

    @Equals("equals")
    public String equals = "EqUaLs";

    @EqualsIgnoreCase("EqUaLs IgNoRe CaSe")
    public String equalsIgnoreCase = "not equals";

    @IsAlpha
    public String alpha = "Not a name";

    @IsAlphanumeric
    public String alphanumeric = "Not a postal code";

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

    @IsInStringArray({ "red", "blue", "green", "yellow" })
    public String isInStringArray = "white";

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

    @IsMongoID
    public String mongoID = "Not a valid Mongo ID";

    @IsNotEmpty(trim = true)
    public String notEmpty = "            ";

    @IsNumeric
    public String numeric = "Not a valid number";

    @IsPort
    public String port = "99999";

    @IsRegex("a.c")
    public String regex = "def";

    @IsRGB
    public String rgb = "rgb(777, notvalid, null)";

    @IsSemVer
    public String semver = "Not a valid SemVer";

    @IsUpperCase
    public String uppercase = "Not Upper Case";

    @IsURL
    public String url = "not://a_valid_url";

    @IsUUID
    public String uuid = "Not a valid UUID";

    @NotContains("not contains")
    public String notcontains = "An invalid value because it contains 'not contains' string";
}
