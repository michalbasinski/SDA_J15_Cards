package pl.sda.utils;

import pl.sda.issuers.IssuerDetector;
import pl.sda.verifiers.LuhnVerifier;

public class SDACreditCardUtils {

    public ValidationResult validate(String card) {
        ValidationResult validationResult = new ValidationResult();

        IssuerDetector issuerDetector = new IssuerDetector();
        String issuer = issuerDetector.detect(card);
        validationResult.setName(issuer);

        LuhnVerifier verifier = new LuhnVerifier();
        boolean verify = verifier.verify(card);
        validationResult.setChecksumValidation(verify);

        return validationResult;
    }

}
