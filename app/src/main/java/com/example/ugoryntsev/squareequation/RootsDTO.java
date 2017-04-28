package com.example.ugoryntsev.squareequation;

/**
 * Created by ugoryntsev on 22.04.2017.
 */

public class RootsDTO {
    private final Double rootOne;
    private final Double rootTwo;

    public RootsDTO(Double rootOne, Double rootTwo) {
        this.rootOne = rootOne;
        this.rootTwo = rootTwo;
    }

    public Double getRootOne() {
        return rootOne;
    }

    public Double getRootTwo() {
        return rootTwo;
    }
}
