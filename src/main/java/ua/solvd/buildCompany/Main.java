package ua.solvd.buildCompany;

import ua.solvd.buildCompany.enums.Education;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Screwdriver screwdriver = new Screwdriver("SCW-100", 3, "Poland",200,
                100, 300);
        screwdriver.getPriceInstrument();
        System.out.println(screwdriver.toString());
        Architect a = new Architect("Qwerty", "Qwerty", "Ukraine", 28, LocalDate.now(),
                "asdadasd", 2, Education.HIGHER, 300);
        Architect ar = new Architect("Qwerty", "Qwerty", "Ukraine", 28, LocalDate.now(),
                "asdadasd", 3, Education.HIGHER, 0);
        ar.getCalculateSalary();
        a.setSalary(0);
        System.out.println(a.toString());
        System.out.println(ar.toString());
        Concrete c = new Concrete("solid", "Ukraine", 0, 100, 150, 3);
        //c.getPriceMaterial();
        c.setPrice(0);
        House h = new House(30,3,"Blue",4);
        h.calculatePrice();
        System.out.println(h.toString());
        System.out.println(c.toString());
    }

}
