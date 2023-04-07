package edu.dio.Exception;

public class DivisaoNaoExataException extends Exception {
    private int numerador;
    private int denominador;

    public DivisaoNaoExataException(String message, int numerado, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}
