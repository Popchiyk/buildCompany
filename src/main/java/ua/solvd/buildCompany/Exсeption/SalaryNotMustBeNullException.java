package ua.solvd.buildCompany.Exсeption;

public class SalaryNotMustBeNullException extends Exception{

    public SalaryNotMustBeNullException() {
        super("Salary not must be 0");
    }


}
