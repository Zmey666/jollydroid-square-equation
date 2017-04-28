package com.example.ugoryntsev.squareequation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;

public class MainActivity extends MvpAppCompatActivity implements EquationView{

    @InjectPresenter
    public EquationPresenterImpl presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calc = (Button) findViewById(R.id.calculate);


        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    final double a = Double.parseDouble(((TextView)findViewById(R.id.coeffA)).getText().toString());
                    final double b = Double.parseDouble(((TextView)findViewById(R.id.coeffB)).getText().toString());
                    final double c = Double.parseDouble(((TextView)findViewById(R.id.coeffC)).getText().toString());
                    presenter.calc(a, b, c);
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Не косячь при вводе", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    public void twoRoots(double rootOne, double rootTwo) {
        updateRoots(String.valueOf(rootOne), String.valueOf(rootTwo));
    }

    @Override
    public void oneRoot(double root) {
        updateRoots(String.valueOf(root), "none");
    }

    @Override
    public void noRoots() {
        updateRoots("none", "none");
    }

    private void updateRoots(String rootOne, String rootTwo) {
        TextView one = (TextView)findViewById(R.id.rootOne);
        one.setText("K1: " + rootOne);

        TextView two = (TextView)findViewById(R.id.rootTwo);
        two.setText("K1: " + rootTwo);
    }
}
