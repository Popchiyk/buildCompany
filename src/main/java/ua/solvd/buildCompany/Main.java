package ua.solvd.buildCompany;

import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import ua.solvd.buildCompany.enums.Education;
import ua.solvd.buildCompany.interfaces.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, ExecutionException, InterruptedException {
        int randomTorque = RandomUtils.nextInt(51, 200);
        final Logger LOGGER = LogManager.getLogger(Main.class.getName());
        List<IInstrument> instrumentList = new ArrayList<>(
                Arrays.asList(
                        new Screwdriver("SCW-100", 3, "Poland", randomTorque,
                                100, 300),
                        new Screwdriver("SCW-150", 5, "Poland", 150,
                                50, 500),
                        new Screwdriver("SCW-300", 1, "Poland", 150,
                                50, 150),
                        new Chainsaw("CSW-150", "Poland", 200, 150,
                                50, 3),
                        new Chainsaw("CSW-300", "Poland", 150, 100,
                                225, 2)
                )
        );
        List<IWorker> employeeList = new ArrayList<>(
                Arrays.asList(
                        new Architect("Roman", "Romanovuch", "Ukraine", 28, LocalDate.now(),
                                "asdadasd", 2, Education.HIGHER, 300),
                        new Architect("Andrey", "Anderyovuch", "Ukraine", 28, LocalDate.now(),
                                "asdadasd", 3, Education.HIGHER, 0),
                        new Engineer("Roman","Arturovuch","Ukraine",28,LocalDate.now(),
                                "fdad312",300,1,Education.SECONDARY),
                        new Engineer("Ivan","Ivanov","Ukraine",28,LocalDate.now(),
                                "fdad312",250,2,Education.HIGHER)
                )
        );
        List<IMaterial> materialList = new ArrayList<>(
                Arrays.asList(
                        new Brick("Ceramics","Ukraine",200,20,3,250),
                        new Brick("Silicate","Ukraine",150,30,3,200),
                        new Concrete("Heavy","Ukraine",350,250,40,450),
                        new Concrete("Light","Ukraine",250,150,30,200)
                )
        );
        Architect a = new Architect("Qwerty", "Qwerty", "Ukraine", 28, LocalDate.now(),
                "asdadasd", 3, Education.SECONDARY, 300);
        Architect ba = new Architect("Qwerty", "Qwerty", "Ukraine", 28, LocalDate.now(),
                "asdadasd", 3, Education.SECONDARY, 300);
        IWorker w = () -> {

            int salary = 0;
            if (a.getWorkExperience() > 3 && StringUtils.equals(a.getEducation().getValue(),
                    Education.HIGHER.getValue())) {
                salary += a.getSalary() + 500;
            } else if (a.getWorkExperience() > 2 && StringUtils.equals(a.getEducation().getValue(),
                    Education.SECONDARY.getValue())) {
                salary += a.getSalary() + 250;
            }

            return salary;
        };
        LOGGER.info("Calculate used lambda by interface = " + w.getCalculateSalary());
        double sumScrewdriver = instrumentList.stream().filter(in -> (in instanceof Screwdriver))
                .mapToDouble(in -> ((Screwdriver) in).getPrice() * ((Screwdriver) in).getQuantity()).sum();
        double sumTotalInstrument = instrumentList.stream().mapToDouble(IInstrument::getPriceInstrument).sum();
        LOGGER.info("sumScrewdriver used stream = " + sumScrewdriver);
        LOGGER.info("sumTotalInstrument used stream = " + sumTotalInstrument);
        Brick b = new Brick("Ceramics","Ukraine",200,20,3,250);
        Converter<Brick,Concrete> converter = x -> new Concrete(x.name,x.developer, x.getPrice(), x.getWeight(),
                x.getSize(), x.getQuantity());
        Concrete concrete = converter.convert(b);
        LOGGER.info("Converter Brick in Concrete "+concrete.toString());
        Function<String,Integer> valueString = Integer::valueOf;
        LOGGER.info("Convert string to Integer "+valueString.apply("322"));

        Class<?> providerClass = Class.forName("ua.solvd.buildCompany.Provider");
        Constructor<?>[] constructors = providerClass.getConstructors();
        LOGGER.info("Constructor length into Provider "+constructors.length);;
        Field[] fields = providerClass.getDeclaredFields();
        Method[] methods = providerClass.getDeclaredMethods();
        List<Method> actualMethod = Arrays.stream(methods).collect(Collectors.toList());
        List<Field> actualFields = Arrays.stream(fields).collect(Collectors.toList());
        LOGGER.info("Fields with class Provider "+actualFields);
        LOGGER.info("Methods with class Provider "+actualMethod);
        CompletableFuture<Void> completableFuture = CompletableFuture.supplyAsync(a::getCalculateSalary)
                .thenAcceptBothAsync(CompletableFuture.supplyAsync(ba::getCalculateSalary),
                        (s1,s2) -> LOGGER.info("Completable Future Async sum two method "+(s1 + s2)));
        completableFuture.get();
    }

}
