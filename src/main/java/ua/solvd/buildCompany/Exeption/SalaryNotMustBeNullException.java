package ua.solvd.buildCompany.Exeption;

public class SalaryNotMustBeNullException extends Exception{

    public SalaryNotMustBeNullException() {
        super("Salary not must be 0");
    }


}
