package com.dotphin.classvalidator.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StringUtils {
    public static boolean isAlpha(String value) {
        return value.matches("^[a-zA-Z]*$");
    }

    public static boolean isAlphanumeric(String value) {
        return value.matches("^[a-zA-Z0-9]*$");
    }

    public static boolean isBase32(String value) {
        return value.matches("^([A-Z2-7=]{8})+$");
    }

    public static boolean isBase64(String value) {
        return value.matches("^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)?$");
    }

    public static boolean isBIC(String value) {
        return value.matches("^[A-Z]{6}[A-Z0-9]{2}([A-Z0-9]{3})?$");
    }

    public static boolean isBTCAddress(String value) {
        return value.matches("^(bc1|[13])[a-zA-HJ-NP-Z0-9]{25,39}$");
    }

    public static boolean isCreditCard(String value) {
        return value.matches(
                "(^4[0-9]{12}(?:[0-9]{3})?$)|(^(?:5[1-5][0-9]{2}|222[1-9]|22[3-9][0-9]|2[3-6][0-9]{2}|27[01][0-9]|2720)[0-9]{12}$)|(3[47][0-9]{13})|(^3(?:0[0-5]|[68][0-9])[0-9]{11}$)|(^6(?:011|5[0-9]{2})[0-9]{12}$)|(^(?:2131|1800|35\\d{3})\\d{11}$)");
    }

    public static boolean isDataURI(String value) {
        return value.matches("data:([-\\w]+\\/[-+\\w.]+)?(;?\\w+=[-\\w]+)*(;base64)?,.*");
    }

    public static boolean isDateString(String value) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss:ms");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(value);
            return true;
        } catch (ParseException pe) {
            return false;
        }
    }

    public static boolean isEmail(String value) {
        return value.matches("^(.+)@(.+)$");
    }

    public static boolean isEthereumAddress(String value) {
        return value.matches("^0x[a-fA-F0-9]{40}$");
    }

    public static boolean isFQDN(String value) {
        return value.matches("(?=^.{4,253}$)(^((?!-)[a-zA-Z0-9-]{1,63}(?<!-)\\.)+[a-zA-Z]{2,63}$)");
    }

    public static boolean isHex(String value) {
        return value.matches("-?[0-9a-fA-F]+");
    }

    public static boolean isHexColor(String value) {
        return value.matches("^#[0-9a-f]{3}([0-9a-f]{3})?$");
    }

    public static boolean isHSL(String value) {
        return value.matches(
                "^hsl\\(\\s*(0|[1-9]\\d?|[12]\\d\\d|3[0-5]\\d)\\s*,\\s*((0|[1-9]\\d?|100)%)\\s*,\\s*((0|[1-9]\\d?|100)%)\\s*\\)$");
    }

    public static boolean isIP(String value) {
        return value.matches("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$");
    }

    public static boolean isLength(String value, int min, int max) {
        int length = value.length();
        return length <= max && length >= min;
    }

    public static boolean isSwift(String value) {
        return isBIC(value);
    }
}
