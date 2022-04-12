package ua.solvd.buildCompany.enums;

public enum Education {
    HIGHER("higher"),
    SECONDARY("secondary");

    private final String value;

    Education(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
