package pl.sda.utils;

public class ValidationResult {
    private String name;
    private boolean checksumValidation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isChecksumValidation() {
        return checksumValidation;
    }

    public void setChecksumValidation(boolean checksumValidation) {
        this.checksumValidation = checksumValidation;
    }
}