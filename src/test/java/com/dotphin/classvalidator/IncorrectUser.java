package com.dotphin.classvalidator;

import com.dotphin.classvalidator.common.IsNotNull;
import com.dotphin.classvalidator.number.DoubleRange;
import com.dotphin.classvalidator.number.FloatRange;
import com.dotphin.classvalidator.number.IntRange;
import com.dotphin.classvalidator.number.IsDivisibleBy;
import com.dotphin.classvalidator.number.IsNegative;
import com.dotphin.classvalidator.number.IsPositive;
import com.dotphin.classvalidator.number.LongRange;
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
import com.dotphin.classvalidator.string.IsMongoID;
import com.dotphin.classvalidator.string.IsNotEmpty;
import com.dotphin.classvalidator.string.IsNumeric;
import com.dotphin.classvalidator.string.IsPort;
import com.dotphin.classvalidator.string.IsRGB;
import com.dotphin.classvalidator.string.IsRegex;
import com.dotphin.classvalidator.string.IsSemVer;
import com.dotphin.classvalidator.string.IsURL;
import com.dotphin.classvalidator.string.IsUUID;
import com.dotphin.classvalidator.string.IsUpperCase;
import com.dotphin.classvalidator.string.NotContains;

public class IncorrectUser {
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
