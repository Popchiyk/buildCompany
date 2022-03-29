package ua.solvd.buildCompany.Exeption;

public class PriceNotMustBeNullException extends Exception{
    public PriceNotMustBeNullException() {
        super("Price not must be 0");
    }

}
