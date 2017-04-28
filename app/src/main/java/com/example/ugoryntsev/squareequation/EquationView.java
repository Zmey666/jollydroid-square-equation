package com.example.ugoryntsev.squareequation;

import com.arellomobile.mvp.MvpView;

/**
 * Created by ugoryntsev on 22.04.2017.
 */

public interface EquationView extends MvpView{
    void twoRoots(double rootOne, double rootTwo);
    void oneRoot(double root);
    void noRoots();
}
