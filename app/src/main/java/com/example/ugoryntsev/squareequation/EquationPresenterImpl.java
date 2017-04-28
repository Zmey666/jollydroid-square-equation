package com.example.ugoryntsev.squareequation;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

/**
 * Created by ugoryntsev on 22.04.2017.
 */

@InjectViewState
public class EquationPresenterImpl extends MvpPresenter<EquationView> implements EquationPresenter {

    @Override
    public void calc(double a, double b, double c) {
        double disc = b * b - 4 * a * c;

        if (disc < 0) {
            getViewState().noRoots();
            return;
        }

        if (disc == 0) {
            getViewState().oneRoot(calcFirst(a, b, disc));
            return;
        }

        getViewState().twoRoots(calcFirst(a,b,disc), calcSecond(a,b,disc));
    }

    private double calcFirst (double a, double b, double disc){
        return (-1 * b + Math.sqrt(disc)) / (2 * a);
    }

    private double calcSecond (double a, double b, double disc){
        return (-1 * b - Math.sqrt(disc)) / (2 * a);
    }
}
