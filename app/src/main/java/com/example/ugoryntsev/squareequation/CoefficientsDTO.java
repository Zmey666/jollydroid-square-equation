package com.example.ugoryntsev.squareequation;

/**
 * Created by ugoryntsev on 22.04.2017.
 */

public class CoefficientsDTO {
    private final double a;
    private final double b;
    private final double c;

    public CoefficientsDTO(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
