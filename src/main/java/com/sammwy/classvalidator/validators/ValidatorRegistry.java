package com.sammwy.classvalidator.validators;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.sammwy.classvalidator.validators.array.ArrayContainsStringValidator;
import com.sammwy.classvalidator.validators.array.ArrayNotContainsStringValidator;
import com.sammwy.classvalidator.validators.array.IsArrayLengthValidator;
import com.sammwy.classvalidator.validators.common.IsNotNullValidator;
import com.sammwy.classvalidator.validators.number.DoubleRangeValidator;
import com.sammwy.classvalidator.validators.number.FloatRangeValidator;
import com.sammwy.classvalidator.validators.number.IntRangeValidator;
import com.sammwy.classvalidator.validators.number.IsDivisibleByValidator;
import com.sammwy.classvalidator.validators.number.IsNegativeValidator;
import com.sammwy.classvalidator.validators.number.IsPositiveValidator;
import com.sammwy.classvalidator.validators.number.LongRangeValidator;
import com.sammwy.classvalidator.validators.string.ContainsValidator;
import com.sammwy.classvalidator.validators.string.EqualsIgnoreCaseValidator;
import com.sammwy.classvalidator.validators.string.EqualsValidator;
import com.sammwy.classvalidator.validators.string.IsAlphaValidator;
import com.sammwy.classvalidator.validators.string.IsAlphanumericValidator;
import com.sammwy.classvalidator.validators.string.IsBICValidator;
import com.sammwy.classvalidator.validators.string.IsBTCAddressValidator;
import com.sammwy.classvalidator.validators.string.IsBase32Validator;
import com.sammwy.classvalidator.validators.string.IsBase64Validator;
import com.sammwy.classvalidator.validators.string.IsCreditCardValidator;
import com.sammwy.classvalidator.validators.string.IsDataURIValidator;
import com.sammwy.classvalidator.validators.string.IsDateStringValidator;
import com.sammwy.classvalidator.validators.string.IsEmailValidator;
import com.sammwy.classvalidator.validators.string.IsEthereumAddressValidator;
import com.sammwy.classvalidator.validators.string.IsFQDNValidator;
import com.sammwy.classvalidator.validators.string.IsHSLValidator;
import com.sammwy.classvalidator.validators.string.IsHexColorValidator;
import com.sammwy.classvalidator.validators.string.IsHexValidator;
import com.sammwy.classvalidator.validators.string.IsIPValidator;
import com.sammwy.classvalidator.validators.string.IsInStringArrayValidator;
import com.sammwy.classvalidator.validators.string.IsLocaleValidator;
import com.sammwy.classvalidator.validators.string.IsLowerCaseValidator;
import com.sammwy.classvalidator.validators.string.IsMacAddressValidator;
import com.sammwy.classvalidator.validators.string.IsMagnetURIValidator;
import com.sammwy.classvalidator.validators.string.IsMobilePhoneValidator;
import com.sammwy.classvalidator.validators.string.IsMongoIDValidator;
import com.sammwy.classvalidator.validators.string.IsNotEmptyValidator;
import com.sammwy.classvalidator.validators.string.IsNumericValidator;
import com.sammwy.classvalidator.validators.string.IsPortValidator;
import com.sammwy.classvalidator.validators.string.IsRGBValidator;
import com.sammwy.classvalidator.validators.string.IsLengthValidator;
import com.sammwy.classvalidator.validators.string.IsRegexValidator;
import com.sammwy.classvalidator.validators.string.IsSemVerValidator;
import com.sammwy.classvalidator.validators.string.IsURLValidator;
import com.sammwy.classvalidator.validators.string.IsUUIDValidator;
import com.sammwy.classvalidator.validators.string.IsUpperCaseValidator;
import com.sammwy.classvalidator.validators.string.NotContainsValidator;

public class ValidatorRegistry {
    private static Map<Class<?>, Validator> validators = new HashMap<>();

    static {
        // Array
        register(new ArrayContainsStringValidator());
        register(new ArrayNotContainsStringValidator());
        register(new IsArrayLengthValidator());

        // Common
        register(new IsNotNullValidator());

        // Number
        register(new DoubleRangeValidator());
        register(new FloatRangeValidator());
        register(new IntRangeValidator());
        register(new IsDivisibleByValidator());
        register(new LongRangeValidator());
        register(new IsNegativeValidator());
        register(new IsPositiveValidator());

        // String
        register(new ContainsValidator());
        register(new EqualsValidator());
        register(new EqualsIgnoreCaseValidator());
        register(new IsAlphanumericValidator());
        register(new IsAlphaValidator());
        register(new IsBase32Validator());
        register(new IsBase64Validator());
        register(new IsBICValidator());
        register(new IsBTCAddressValidator());
        register(new IsCreditCardValidator());
        register(new IsDataURIValidator());
        register(new IsDateStringValidator());
        register(new IsEmailValidator());
        register(new IsEthereumAddressValidator());
        register(new IsFQDNValidator());
        register(new IsHexValidator());
        register(new IsHexColorValidator());
        register(new IsHSLValidator());
        register(new IsInStringArrayValidator());
        register(new IsIPValidator());
        register(new IsLengthValidator());
        register(new IsLocaleValidator());
        register(new IsLowerCaseValidator());
        register(new IsMacAddressValidator());
        register(new IsMagnetURIValidator());
        register(new IsMobilePhoneValidator());
        register(new IsMongoIDValidator());
        register(new IsNotEmptyValidator());
        register(new IsNumericValidator());
        register(new IsPortValidator());
        register(new IsRegexValidator());
        register(new IsRGBValidator());
        register(new IsSemVerValidator());
        register(new IsUpperCaseValidator());
        register(new IsURLValidator());
        register(new IsUUIDValidator());
        register(new NotContainsValidator());
    }

    public static void register(Validator validator) {
        validators.put(validator.getAnnotation(), validator);
    }

    public static Validator getValidatorForClass(Class<?> annotation) {
        return validators.get(annotation);
    }

    public static Collection<Validator> getValidators() {
        return validators.values();
    }
}
