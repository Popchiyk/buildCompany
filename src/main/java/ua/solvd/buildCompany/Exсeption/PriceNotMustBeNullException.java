package ua.solvd.buildCompany.Exсeption;

public class PriceNotMustBeNullException extends Exception{

    public PriceNotMustBeNullException() {
        super("Price not must be 0");
    }

}
