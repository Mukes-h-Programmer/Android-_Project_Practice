package com.example.table;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText inputnumber;
    Button sumbit;
    TextView output;
    int ans = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputnumber = findViewById(R.id.inputnumber);
        sumbit = findViewById(R.id.sumbit);
        output = findViewById(R.id.output);
        sumbit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.sumbit:
                StringBuffer b = new StringBuffer();
                int res;
                String fs = inputnumber.getText().toString();
                int n = Integer.parseInt(fs);
                for (int i = 1 ; i<=10; i++ ){
                    ans = (n*i);
                    b.append(n+ " X "+i+" = "+ans+"\n\n");
                    output.setText(b);
                }
                break;
        }

    }
}