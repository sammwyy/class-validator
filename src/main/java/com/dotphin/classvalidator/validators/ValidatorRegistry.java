package com.dotphin.classvalidator.validators;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.dotphin.classvalidator.validators.common.IsNotNullValidator;
import com.dotphin.classvalidator.validators.number.IsDivisibleByValidator;
import com.dotphin.classvalidator.validators.string.ContainsValidator;
import com.dotphin.classvalidator.validators.string.IsAlphaValidator;
import com.dotphin.classvalidator.validators.string.IsAlphanumericValidator;
import com.dotphin.classvalidator.validators.string.IsBICValidator;
import com.dotphin.classvalidator.validators.string.IsBTCAddressValidator;
import com.dotphin.classvalidator.validators.string.IsBase32Validator;
import com.dotphin.classvalidator.validators.string.IsBase64Validator;
import com.dotphin.classvalidator.validators.string.IsCreditCardValidator;
import com.dotphin.classvalidator.validators.string.IsDataURIValidator;
import com.dotphin.classvalidator.validators.string.IsDateStringValidator;
import com.dotphin.classvalidator.validators.string.IsEmailValidator;
import com.dotphin.classvalidator.validators.string.IsEthereumAddressValidator;
import com.dotphin.classvalidator.validators.string.IsFQDNValidator;
import com.dotphin.classvalidator.validators.string.IsHSLValidator;
import com.dotphin.classvalidator.validators.string.IsHexColorValidator;
import com.dotphin.classvalidator.validators.string.IsHexValidator;
import com.dotphin.classvalidator.validators.string.IsIPValidator;
import com.dotphin.classvalidator.validators.string.IsLocaleValidator;
import com.dotphin.classvalidator.validators.string.IsLowerCaseValidator;
import com.dotphin.classvalidator.validators.string.IsMacAddressValidator;
import com.dotphin.classvalidator.validators.string.IsMagnetURIValidator;
import com.dotphin.classvalidator.validators.string.IsMobilePhoneValidator;
import com.dotphin.classvalidator.validators.string.IsMongoIDValidator;
import com.dotphin.classvalidator.validators.string.IsNumericValidator;
import com.dotphin.classvalidator.validators.string.IsPortValidator;
import com.dotphin.classvalidator.validators.string.IsRGBValidator;
import com.dotphin.classvalidator.validators.string.IsLengthValidator;
import com.dotphin.classvalidator.validators.string.IsRegexValidator;
import com.dotphin.classvalidator.validators.string.IsSemVerValidator;
import com.dotphin.classvalidator.validators.string.IsURLValidator;
import com.dotphin.classvalidator.validators.string.IsUUIDValidator;
import com.dotphin.classvalidator.validators.string.IsUpperCaseValidator;
import com.dotphin.classvalidator.validators.string.NotContainsValidator;

public class ValidatorRegistry {
    private static Map<Class<?>, Validator> validators = new HashMap<>();

    static {
        // Common
        register(new IsNotNullValidator());

        // Number
        register(new IsDivisibleByValidator());

        // String
        register(new ContainsValidator());
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
        register(new IsIPValidator());
        register(new IsLengthValidator());
        register(new IsLocaleValidator());
        register(new IsLowerCaseValidator());
        register(new IsMacAddressValidator());
        register(new IsMagnetURIValidator());
        register(new IsMobilePhoneValidator());
        register(new IsMongoIDValidator());
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
