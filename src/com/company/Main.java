package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Screwdriver screwdriver = new Screwdriver("SCW-100", 3, "Poland", 400, 200,
                100, 300);
        screwdriver.getFullPriceInstrumentScrewdriver();
        System.out.println(screwdriver.toString());
        Architect a = new Architect("Qwerty", "Qwerty", "Ukraine", 28, LocalDate.now(),
                "asdadasd", 2, "Highter", 300);
        a.calculationSalaryArchitect();
        System.out.println(a.toString());
        Concrete c = new Concrete("solid", "Ukraine", 200, 100, 150, 3);
        c.getFullPriceMaterialConcrete();
        System.out.println(c.toString());
    }

}
