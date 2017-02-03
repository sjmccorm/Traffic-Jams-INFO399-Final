package edu.indiana.soic.burrow.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnCallFunction;
    TextView tvAdd, tvDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCallFunction = (Button) findViewById(R.id.button);
        tvAdd = (TextView) findViewById(R.id.textView);
        tvDiv = (TextView) findViewById(R.id.textView2);
    }

    public int add(int a, int b) {
        return a+b;
    }

    public int divide(int a, int b){
        return a/b;
    }

    public void function(View v)
    {
        int sum = add(3,7);
        int div = divide(4,1);

        tvAdd.setText("Sum = " + sum);
        tvDiv.setText("Div = " + div);
    }
}
