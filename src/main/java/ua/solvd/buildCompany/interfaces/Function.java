package ua.solvd.buildCompany.interfaces;

@FunctionalInterface
public interface Function<T,R> {
    R apply(T t);
}
