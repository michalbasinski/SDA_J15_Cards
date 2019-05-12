package pl.sda;

import pl.sda.utils.SDACreditCardUtils;
import pl.sda.utils.ValidationResult;

public class App
{
    public static void main( String[] args )
    {
        String cardNumber = "345908453631747";

        SDACreditCardUtils sdaCreditCardUtils =
                new SDACreditCardUtils();

        ValidationResult validationResult =
                sdaCreditCardUtils.validate(cardNumber);

        System.out.println(validationResult.getName()
                + " : "
                + validationResult.isChecksumValidation());
    }
}
